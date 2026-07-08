package com.cognizant.controller;

import com.cognizant.model.Department;
import com.cognizant.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {

        System.out.println("Department REST Service Called");

        return departmentService.getAllDepartments();
    }

}