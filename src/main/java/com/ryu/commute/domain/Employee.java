package com.ryu.commute.domain;

import com.ryu.commute.dto.request.EmployeeCreateRequest;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeSeq = null;
    @Column(nullable = false, length = 10)
    private String name;
    @Column(nullable = false, length = 20)
    private String teamName;
    @Column(nullable = false, length = 7)
    private String role;
    private Date birthday;
    private Date workStartDate;

    protected Employee() {};

    public Employee(EmployeeCreateRequest reqDto){
        if(reqDto.getName() == null || reqDto.getName().isBlank() ||
            reqDto.getRole() == null || reqDto.getRole().isBlank() ||
            reqDto.getBirthday() == null || String.valueOf(reqDto.getBirthday()).isBlank() ||
            reqDto.getWorkStartDate() == null || String.valueOf(reqDto.getWorkStartDate()).isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 정보가 들어왔습니다."));
        }
        this.name = reqDto.getName();
        this.teamName = reqDto.getTeamName();
        this.role = reqDto.getRole();
        this.birthday = reqDto.getBirthday();
        this.workStartDate = reqDto.getWorkStartDate();
    }
    public Long getEmployeeSeq() {
        return employeeSeq;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getRole() {
        return role;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Date getWorkStartDate() {
        return workStartDate;
    }
}
