package com.ryu.commute.domain;

import com.ryu.commute.dto.request.TeamCreateRequest;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEAM_SEQ")
    private Long teamSeq;

    @Column(nullable = false, length = 10)
    private String name;

    @OneToMany
    @JoinTable(name = "team_employee",
            joinColumns = @JoinColumn(name = "TEAM_SEQ"),
            inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_SEQ"))
    private List<Employee> employee = new ArrayList<Employee>();

    protected Team() {};

    public Team(TeamCreateRequest reqDto) {
        if(reqDto.getTeamNm() == null || reqDto.getTeamNm().isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다", reqDto.getTeamNm()));
        }
        this.name = reqDto.getTeamNm();
    }

    public Team(List<Employee> employee) {
        this.employee = employee;
    }

    public Long getTeamSeq() {
        return teamSeq;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployee() {
        return employee;
    }
}
