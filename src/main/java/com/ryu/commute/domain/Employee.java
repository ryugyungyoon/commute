package com.ryu.commute.domain;

import com.ryu.commute.dto.request.EmployeeCreateRequest;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_SEQ")
    private Long employeeSeq;
    @Column(nullable = false, length = 10)
    private String name;
    @Column(nullable = true)
    private Long teamSeq;
    @Column(nullable = false, length = 7)
    private String role;
    @Column(nullable = false)
    private Date birthday;
    @Column(nullable = false)
    private Date workStartDate;

    protected Employee() {};

    public Employee(EmployeeCreateRequest reqDto){
        if(reqDto.getName() == null || reqDto.getName().isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 name(%s) 들어왔습니다.", reqDto.getName()));
        }
        else if(reqDto.getRole() == null || reqDto.getRole().isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 role(%s) 들어왔습니다.", reqDto.getRole()));
        }
        else if(reqDto.getBirthday() == null || String.valueOf(reqDto.getBirthday()).isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 birthday(%s) 들어왔습니다.", reqDto.getBirthday()));
        }
        else if(reqDto.getWorkStartDate() == null || String.valueOf(reqDto.getWorkStartDate()).isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 workStartDate(%s) 들어왔습니다.", reqDto.getWorkStartDate()));
        }
        this.name = reqDto.getName();
        this.teamSeq = reqDto.getTeamSeq();
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
