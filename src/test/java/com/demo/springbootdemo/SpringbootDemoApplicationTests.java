package com.demo.springbootdemo;

import com.demo.springbootdemo.controller.EmployeeController;
import com.demo.springbootdemo.domain.EmployeeModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SpringbootDemoApplication.class})
public class SpringbootDemoApplicationTests {

    @Autowired
    EmployeeController controller;


    @Test
    public void testGetEmployeeList() {
        Map<String, Object> map = new HashMap<>();

        map.put("id", "2");

        List<EmployeeModel> resModels = controller.getEmployeeList(map);
        System.out.println("===============输出查询结果===========================");
        System.out.println(resModels);

        Assert.assertEquals("test02",resModels.get(0).getName() );
    }

    @Test
    public void testSave() {
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setName("test10");
        employeeModel.setAge(26);
        employeeModel.setSex(1);
        employeeModel.setDepartment("技术部");
        employeeModel.setEmail("21312313@163.com");

        controller.save(employeeModel);

        System.out.println("==========================================");
        System.out.println(employeeModel);

        Assert.assertEquals("test10",employeeModel.getName());

    }

    @Test
    public void testUpdate() {
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setId(8L);
        employeeModel.getId();
        employeeModel.setEmail("1111111@test.com");
        controller.update(employeeModel);

        System.out.println("==========================================");
        System.out.println(employeeModel);

        Assert.assertEquals("1111111@test.com",employeeModel.getEmail());

    }

    @Test
    public void testDelete() {

        controller.delete(3L);

    }

}
