package com.ryu.commute.service;

import com.ryu.commute.domain.Employee;
import com.ryu.commute.domain.EmployeeRepository;
import com.ryu.commute.domain.Team;
import com.ryu.commute.domain.TeamRepository;
import com.ryu.commute.dto.request.EmployeeCreateRequest;
import com.ryu.commute.dto.request.TeamCreateRequest;
import com.ryu.commute.dto.response.EmployeeResponse;
import com.ryu.commute.dto.response.TeamResponse;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
public class EmployeeService {

    private TeamRepository teamRepository;

    private EmployeeRepository employeeRepository;

    public EmployeeService(TeamRepository teamRepository, EmployeeRepository employeeRepository) {
        this.teamRepository = teamRepository;
        this.employeeRepository = employeeRepository;
    }

    public void saveTeam(TeamCreateRequest reqDto){
        teamRepository.save(new Team(reqDto));
    }

    public void saveEmployee(EmployeeCreateRequest reqDto){
        employeeRepository.save(new Employee(reqDto));
    };

    public List<TeamResponse> getTeams(){
        return teamRepository.findAll().stream()
                .map(TeamResponse::new)
                .collect(Collectors.toList());
    }

    public List<EmployeeResponse> getEmployees(){
        return employeeRepository.findAll().stream()
                .map(EmployeeResponse::new)
                .collect(Collectors.toList());
    }
}
