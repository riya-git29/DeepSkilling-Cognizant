package com.example.employeemanagementsystem.controller;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")

public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping
    public Employee save(@RequestBody Employee employee){
        return service.save(employee);
    }

    @GetMapping
    public List<Employee> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        service.delete(id);
        return "Deleted Successfully";
    }

    @GetMapping("/page")
    public Page<Employee> page(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String sort){
        return service.getEmployees(page,size,sort);
    }

}