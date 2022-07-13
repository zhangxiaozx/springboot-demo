package com.demo.springbootdemo.service;

import com.demo.springbootdemo.domain.EmployeeModel;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    /**
     * 获取员工信息
     */
    List<EmployeeModel> getEmployeeList(Map<String, Object> map);

    /**
     * 添加员工
     * @param employeeModel
     */
    EmployeeModel save(EmployeeModel employeeModel);

    /**
     * 修改员工信息
     */
    EmployeeModel update(EmployeeModel employeeModel);

    /**
     * 删除员工信息
     */
    void delete(Object id);
}
