package com.example.Inika.controller;

import com.example.Inika.Service.EmployeeService;
import com.example.Inika.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

@RestController
public class Employeecontroller {
    @Autowired
    private EmployeeService employeeService;

    //get all employees
    @RequestMapping("/Employeedetails")
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }

    //get employees by Id
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> get(@PathVariable Integer id) {
        try {
            Employee employee = employeeService.get(id);
            return new ResponseEntity<Employee>(employee, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }
    }

    // Add Employee
    @PostMapping("/Addemployees")
    public Employee add(@RequestBody Employee employee) {
        Employee employee1 = employeeService.save(employee);
        return employee1;
    }

    //update employee
    @PutMapping("/updateEmployees")
    public ResponseEntity<?> update(@RequestBody Employee employee) {
        try {
            employeeService.save(employee);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //delete employee
    @DeleteMapping("/deleteEmployee/{id}")
    public void delete(@PathVariable Integer id) {
        employeeService.delete(id);
    }

    //get employee by name
    @GetMapping("/employee/{name}")
    public String get(@PathVariable String name) {
        String empname = employeeService.getempName(name);
        return empname;
    }

    // Empname Order by Gender
    @GetMapping("/employee/nameOrderBygender")
    public List<Employee> get() {
        return employeeService.getNameByGender();
    }

    //emp details using nationality and name
    @GetMapping("/employee/{nationality}/{name}")
    public Object get(@PathVariable String nationality, @PathVariable String name) {
        Object e = employeeService.getdetailsbynationalityandname(nationality, name);
        return e;
    }
//msg display
    @GetMapping("/message")
    public Set<String> get1(){
       return employeeService.defaultmsg();
    }


}
