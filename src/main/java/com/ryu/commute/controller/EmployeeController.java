package com.ryu.commute.controller;

import com.ryu.commute.domain.Employee;
import com.ryu.commute.dto.request.EmployeeCreateRequest;
import com.ryu.commute.dto.request.TeamCreateRequest;
import com.ryu.commute.dto.response.EmployeeResponse;
import com.ryu.commute.dto.response.TeamResponse;
import com.ryu.commute.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/team/save")
    public void saveTeam(@RequestBody TeamCreateRequest reqDto){
        employeeService.saveTeam(reqDto);
    }

    @PostMapping("/employee/save")
    public void saveEmployee(@RequestBody EmployeeCreateRequest reqDto){
        employeeService.saveEmployee(reqDto);
    }

    @GetMapping("team/list")
    public List<TeamResponse> getTeams(){
        return employeeService.getTeams();
    }

    @GetMapping("emloyee/list")
    public List<EmployeeResponse> getEmployees(){
        return employeeService.getEmployees();
    }
}
