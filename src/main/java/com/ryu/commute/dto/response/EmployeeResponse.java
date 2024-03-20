package com.ryu.commute.dto.response;

import com.ryu.commute.domain.Employee;

import java.util.Date;

public class EmployeeResponse {

    private Long employeeSeq;
    private String name;
    private Long teamSeq;
    private String role;
    private Date birthday;
    private Date workStartDate;

    public EmployeeResponse(Long employeeSeq, String name, Long teamSeq, String role, Date birthday, Date workStartDate) {
        this.employeeSeq = employeeSeq;
        this.name = name;
        this.teamSeq = teamSeq;
        this.role = role;
        this.birthday = birthday;
        this.workStartDate = workStartDate;
    }
    public EmployeeResponse(Employee employee) {
        this.employeeSeq = employee.getEmployeeSeq();
        this.name = employee.getName();
        this.teamSeq = employee.getTeamSeq();
        this.role = employee.getRole();
        this.birthday = employee.getBirthday();
        this.workStartDate = employee.getWorkStartDate();
    }

    public Long getEmployeeSeq() {
        return employeeSeq;
    }

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
