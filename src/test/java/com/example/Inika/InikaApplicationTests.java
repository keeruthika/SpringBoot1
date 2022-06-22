
package com.example.Inika;

import com.example.Inika.Repository.EmployeeRepository;
import com.example.Inika.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class InikaApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testABC(){
    /*  Employee abbbbb = employeeRepository.findByName("kisore");
        assertEquals("Test",abbbbb.getName(), "kisore");*/
    }
}

