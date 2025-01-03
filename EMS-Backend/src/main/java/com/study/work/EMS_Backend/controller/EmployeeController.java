package com.study.work.EMS_Backend.controller;

import com.study.work.EMS_Backend.dto.EmployeeDto;
import com.study.work.EMS_Backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor

public class EmployeeController {

    private EmployeeService employeeService;

    //Build ADD Employee Rest API

    @PostMapping

    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
       EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
       return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    //Build Get Employee Rest Api

    @GetMapping("{id}")

    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId) {
      EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
      return new ResponseEntity<>(employeeDto,HttpStatus.OK);
    }

    // Build Get All Employees
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getEmployees(){
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees,HttpStatus.OK);
    }

    // Build Update Employee Rest Api
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,@RequestBody EmployeeDto updatedEmployee) {
        EmployeeDto employeeDto = employeeService.updateEmployee(employeeId, updatedEmployee);
        return new ResponseEntity<>(employeeDto,HttpStatus.OK);
    }

    //Build Delete Employee Rest Api
    @DeleteMapping("{id}")

    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("Employee Deleted Successfully");
    }


}
