package com.ryu.commute.dto.response;

import com.ryu.commute.domain.Employee;
import com.ryu.commute.domain.Team;

public class TeamResponse {

    private Long teamSeq;
    private String teamNm;
    private String managerNm;
    private Long memberCnt;

    public TeamResponse(Long teamSeq, String teamNm, String managerNm, Long memberCnt) {
        this.teamSeq = teamSeq;
        this.teamNm = teamNm;
        this.managerNm = managerNm;
        this.memberCnt = memberCnt;
    }

    public TeamResponse(Team team){
        if(team ==null){
            throw new IllegalArgumentException();
        }
        else {
            this.teamSeq = team.getTeamSeq();
            this.teamNm = team.getName();
            for (Employee employee : team.getEmployee()) {
                if(this.teamSeq == employee.getTeamSeq()){
                    this.managerNm = this.managerNm.isBlank() ? employee.getName() : this.managerNm;
                    this.memberCnt++;
                }
            }
        }
    }

    public Long getTeamSeq() {
        return teamSeq;
    }

    public String getTeamNm() {
        return teamNm;
    }

    public String getManagerNm() {
        return managerNm;
    }

    public Long getMemberCnt() {
        return memberCnt;
    }
}
