package com.luo.ssm.mapper;


import com.luo.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    /**
     * 查询所有的员工信息
     * **/
    List<Employee> getAllEmployee();
}
