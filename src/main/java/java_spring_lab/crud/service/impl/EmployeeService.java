package java_spring_lab.crud.service.impl;

import java_spring_lab.crud.model.Employee;
import java_spring_lab.crud.repository.EmployeeRepository;
import java_spring_lab.crud.service.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
