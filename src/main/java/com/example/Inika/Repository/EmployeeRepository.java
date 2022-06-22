package com.example.Inika.Repository;

import com.example.Inika.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository  extends CrudRepository<Employee, Integer> {

     Employee findByName(String abc);

    @Query(value = "SELECT e FROM Employee e ORDER BY e.gender")
    public List<Employee> findEmpNameOrderByGender();

    @Query(value = "SELECT e From Employee e WHERE e.nationality=:nationality AND e.name=:name ")
    public Employee findByNationalityandName(String nationality,String name);




/*
    @Query(value = "SELECT a FROM Employee a ORDER BY a.Name")
    public List<Employee> findAllSortedByName();

    @Query(value = "SELECT e.Emp_Name FROM Employee e ORDER BY Emp_Name", nativeQuery = true)
    public List<Object[]> findAllSortedByNameUsingNative();*/
}
