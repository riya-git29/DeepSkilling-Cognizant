package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public Employee save(Employee employee){
        return repository.save(employee);
    }

    public List<Employee> getAll(){
        return repository.findAll();
    }

    public Employee getById(Long id){
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Page<Employee> getEmployees(int page,int size,String sortBy){
        return repository.findAll(PageRequest.of(page,size,Sort.by(sortBy)));
    }

}