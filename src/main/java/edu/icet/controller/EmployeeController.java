package edu.icet.controller;

import edu.icet.dto.Employee;
import edu.icet.repository.EmployeeRepository;
import edu.icet.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {
    final EmployeeService service;

    @PostMapping("/add")
    public void addEmployee(@RequestBody @Valid Employee employee){
       service.addEmployee(employee);
    }

    @GetMapping("/get-all")
    public List<Employee>getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        service.deleteEmployee(id);
    }
    @PutMapping("/update")
    public void updateEmployee(@RequestBody @Valid Employee employee){
        service.updateEmployee(employee);
    }

    @GetMapping("/search-by-id/{id}")
    public Employee searchEmployeeById(@PathVariable Integer id){
        return service.searchEmployeeById(id);
    }


}
