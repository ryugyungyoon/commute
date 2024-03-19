package com.ryu.commute.service;

import com.ryu.commute.domain.Employee;
import com.ryu.commute.domain.EmployeeRepository;
import com.ryu.commute.domain.Team;
import com.ryu.commute.dto.request.EmployeeCreateRequest;
import com.ryu.commute.dto.request.TeamCreateRequest;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public void saveTeam(TeamCreateRequest reqDto){
        employeeRepository.save(new Team(reqDto));
    }

    public void saveEmployee(EmployeeCreateRequest reqDto){
        employeeRepository.save(new Employee(reqDto));
    };
}
