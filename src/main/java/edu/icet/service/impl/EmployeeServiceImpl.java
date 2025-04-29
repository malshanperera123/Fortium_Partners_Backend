package edu.icet.service.impl;

import edu.icet.dto.Employee;
import edu.icet.entity.EmployeeEntity;
import edu.icet.repository.EmployeeRepository;
import edu.icet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    final EmployeeRepository repository;
    final ModelMapper mapper;

    @Override
    public void addEmployee(Employee employee) {
        repository.save(mapper.map(employee,EmployeeEntity.class));
    }

    @Override
    public List<Employee> getAll() {
        ArrayList<Employee> employees=new ArrayList<>();
        List<EmployeeEntity> all = repository.findAll();

        all.forEach(EmployeeEntity->{
            employees.add(mapper.map(EmployeeEntity,Employee.class));
        });
        return employees;
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
