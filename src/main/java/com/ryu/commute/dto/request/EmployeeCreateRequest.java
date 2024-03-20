package com.ryu.commute.dto.request;

import java.util.Date;

public class EmployeeCreateRequest {

    private String name;
    private Long teamSeq;
    private String role;
    private Date birthday;
    private Date workStartDate;

    public String getName() {
        return name;
    }

    public Long getTeamSeq() {
        return teamSeq;
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
