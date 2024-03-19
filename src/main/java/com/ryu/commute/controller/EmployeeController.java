package com.ryu.commute.controller;

import com.ryu.commute.domain.Employee;
import com.ryu.commute.dto.request.EmployeeCreateRequest;
import com.ryu.commute.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/team/save")
    public void saveTeam(){

    }

    @PostMapping("/employee/save")
    public void saveEmployee(@RequestBody EmployeeCreateRequest reqDto){
        employeeService.saveEmployee(reqDto);
    }
}
