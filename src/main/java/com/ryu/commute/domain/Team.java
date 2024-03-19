package com.ryu.commute.domain;

import com.ryu.commute.dto.request.TeamCreateRequest;
import jakarta.persistence.*;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamSeq;

    @Column(nullable = false, length = 10)
    private String name;

    protected Team() {};

    public Team(TeamCreateRequest reqDto) {
        if(reqDto.getName() == null || reqDto.getName().isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다", name));
        }
        this.teamSeq = teamSeq;
        this.name = name;
    }

    public Long getTeamSeq() {
        return teamSeq;
    }

    public String getName() {
        return name;
    }
}
