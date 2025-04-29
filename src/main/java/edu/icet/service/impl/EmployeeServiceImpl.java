package edu.icet.service.impl;

import edu.icet.dto.Employee;
import edu.icet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public List<Employee> getAll() {
        return List.of();
    }

    @Override
    public void deleteEmployee(Integer id) {

    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public Employee searchEmployeeById(Integer id) {
        return null;
    }
}
