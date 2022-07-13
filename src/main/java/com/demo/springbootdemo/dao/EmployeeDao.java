package com.demo.springbootdemo.dao;

import com.demo.springbootdemo.domain.EmployeeModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeDao {

    /**
     * 获取员工信息
     */
    List<EmployeeModel> getEmployeeList(Map<String, Object> map);

    /**
     * 添加员工
     */
    int save(EmployeeModel employeeModel);

    /**
     * 修改员工信息
     */
    int update(EmployeeModel employeeModel);

    /**
     * 删除员工信息
     */
    int delete(Object id);
}
