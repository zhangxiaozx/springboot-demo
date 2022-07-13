package com.demo.springbootdemo.service.impl;

import com.demo.springbootdemo.dao.EmployeeDao;
import com.demo.springbootdemo.domain.EmployeeModel;
import com.demo.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<EmployeeModel> getEmployeeList(Map<String, Object> map) {
        return employeeDao.getEmployeeList(map);
    }

    @Override
    public EmployeeModel save(EmployeeModel employeeModel) {
        employeeDao.save(employeeModel);
        return employeeModel;
    }

    @Override
    public EmployeeModel update(EmployeeModel employeeModel) {
        employeeDao.update(employeeModel);
        return employeeModel;

    }

    @Override
    public void delete(Object id) {
        employeeDao.delete(id);
    }
}
