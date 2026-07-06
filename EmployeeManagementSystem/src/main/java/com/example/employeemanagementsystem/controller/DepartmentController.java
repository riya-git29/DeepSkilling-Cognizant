package com.example.employeemanagementsystem.controller;

import com.example.employeemanagementsystem.entity.Department;
import com.example.employeemanagementsystem.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")

public class DepartmentController {

    @Autowired
    DepartmentService service;

    @PostMapping
    public Department save(@RequestBody Department department){
        return service.save(department);
    }

    @GetMapping
    public List<Department> getAll(){
        return service.getAll();
    }

}