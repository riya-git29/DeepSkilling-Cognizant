package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.projection.EmployeeDTO;
import com.example.employeemanagementsystem.projection.EmployeeView;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

    List<Employee> findByName(String name);

    List<Employee> findByEmailContaining(String email);

    List<Employee> findByDepartmentName(String name);

    @Query("select e from Employee e where e.email=?1")
    Employee getEmployeeByEmail(String email);

    Page<Employee> findAll(Pageable pageable);

    List<EmployeeView> findBy();

    @Query("select new com.example.employeemanagementsystem.projection.EmployeeDTO(e.name,e.email) from Employee e")
    List<EmployeeDTO> fetchDTO();
}