package java_spring_lab.crud.controller.impl;

import java_spring_lab.crud.model.Employee;
import java_spring_lab.crud.service.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("'/api")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @PostMapping("/employees")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
    }
}
