package com.demo.springbootdemo.controller;

import com.demo.springbootdemo.domain.EmployeeModel;
import com.demo.springbootdemo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/list")
    public List<EmployeeModel> getEmployeeList(@RequestParam Map<String, Object> map ) {
        return employeeService.getEmployeeList(map);
    }

    @PostMapping("/save")
    public EmployeeModel save(@RequestBody EmployeeModel employeeModel){
        return employeeService.save(employeeModel);
    }

    @PostMapping("/update")
    public EmployeeModel update(@RequestBody EmployeeModel employeeModel){
        return employeeService.update(employeeModel);
    }

    @GetMapping("/delete")
    public void delete(@RequestParam Long id) {
        employeeService.delete(id);
    }

}
