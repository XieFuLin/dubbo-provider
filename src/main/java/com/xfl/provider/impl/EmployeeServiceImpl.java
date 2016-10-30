package com.xfl.provider.impl;

import com.xfl.provider.entity.Employee;
import com.xfl.provider.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XFL
 * time on 2016/10/30 10:02
 * description: 员工业务相关类实现
 */
public class EmployeeServiceImpl implements IEmployeeService {
    /**
     * 根据员工Id查找员工.
     *
     * @param employeeId 员工Id
     * @return 返回查找到的员工
     */
    @Override
    public Employee findEmployeeById(String employeeId) {
        return new Employee("123456: " + employeeId, "张三");
    }

    /**
     * 根据与员工Id更新员工信息.
     *
     * @param employeeId 员工Id
     * @return 返回更新结果
     */
    @Override
    public Integer updateEmployeeById(String employeeId) {
        return 0;
    }

    /**
     * 根据员工姓名查询员工列表
     *
     * @param searchName 搜索的姓名
     * @return 返回符合条件的员工集合
     */
    @Override
    public List<Employee> searchEmployeeByName(String searchName) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("12345", "李四" + searchName));
        employeeList.add(new Employee("123456", "王五" + searchName));
        employeeList.add(new Employee("1234567", "王麻子" + searchName));
        return employeeList;
    }
}
