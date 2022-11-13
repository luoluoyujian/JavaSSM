package com.luo.ssm.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luo.ssm.mapper.EmployeeMapper;
import com.luo.ssm.pojo.Employee;
import com.luo.ssm.service.EmployeeService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    //public PageInfo<Employee> getEmployeePage(Integer pageNum) {
//        //开启分页功能
//        PageHelper.startPage(pageNum,4);
//        //查询所有的员工信息
//        List<Employee> list = employeeMapper.getAllEmployee();

    //}
}
