package com.employee_management.employee_management.service;

import com.employee_management.employee_management.model.Employee;
import com.employee_management.employee_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee findById(Long id){
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);

    }
    public Employee editEmployee(Long id, Employee updatedEmployee){
        Employee emp = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));

        emp.setFirstName(updatedEmployee.getFirstName());
        emp.setSurname(updatedEmployee.getSurname());
        emp.setBirthDate(updatedEmployee.getBirthDate());
        emp.setPosition(updatedEmployee.getPosition());
        emp.setHourRate(updatedEmployee.getHourRate());
        emp.setCity(updatedEmployee.getCity());
        emp.setStartDate(updatedEmployee.getStartDate());

        return employeeRepository.save(emp);

    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}
