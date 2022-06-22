package com.example.Inika.Service;

import com.example.Inika.Repository.EmployeeRepository;
import com.example.Inika.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PersistenceContext
    private EntityManager entityManager;

    //get all employees
    public List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    //Add employees
    public Employee save(Employee employee) {
        Employee aaa = employeeRepository.save(employee);
        return aaa;
    }

    //get employee by Id
    public Employee get(Integer id) {
        return employeeRepository.findById(id).get();
    }

    //Delete employee
    public String delete(Integer id) {
        employeeRepository.deleteById(id);
        return "id" + "has been deleted";
    }

    //get employee by name
    public String getempName(String name) {
        Employee aa = employeeRepository.findByName(name);
        String abc = aa.getName();
        return employeeRepository.findByName(name).getName();
    }

    //get all employee name sort by gender
    public List<Employee> getNameByGender() {
        List<Employee> employees = new ArrayList<>();
        employees = employeeRepository.findEmpNameOrderByGender();
        return employees;
    }

    //emp details using nationality and name
    public Object getdetailsbynationalityandname(String nationality, String name) {
        getEmpByNativeQuery();
        getEmpByJPAQuery();
        Employee emp = employeeRepository.findByNationalityandName(nationality, name);
        if (emp == null) {
            return "Match not Found";
        } else {
            return emp;
        }
    }


    public Employee getEmpByNativeQuery() {
        List<Object[]> value = entityManager.createNativeQuery("select * from Employee").getResultList();
        System.out.println(value);
        return null;
    }

    public Employee getEmpByJPAQuery() {
        List<Employee> value = entityManager.createQuery("select e from Employee e").getResultList();
        System.out.println(value);
        return null;
    }

    public Set<String> defaultmsg(){
        Set<String> abc = new HashSet<>();
        abc.add("1");
        abc.add("Keerthi");
        abc.add("2");
        abc.add("Karthi");
        abc.add("3");
        abc.add("Kanmani");
        abc.add("3");
        abc.add("3");
        return abc;
    }

}
