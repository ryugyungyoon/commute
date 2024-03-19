package com.ryu.commute.dto.request;

import java.util.Date;

public class EmployeeCreateRequest {

    private String name;
    private String teamName;
    private String role;
    private Date birthday;
    private Date workStartDate;

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
