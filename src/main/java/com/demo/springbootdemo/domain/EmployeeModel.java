package com.demo.springbootdemo.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeModel implements Serializable {

    private Long id;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工年龄
     */
    private Integer age;
    /**
     * 员工性别
     */
    private Integer sex;
    /**
     * 邮箱
     */
    private String  email;
    /**
     * 部门
     */
    private String department;
}
