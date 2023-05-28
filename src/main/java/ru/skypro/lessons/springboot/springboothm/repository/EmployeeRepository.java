package ru.skypro.lessons.springboot.springboothm.repository;

import ru.skypro.lessons.springboot.springboothm.pojo.Employee;

import java.util.List;

public interface EmployeeRepository {
    int getSumSalary();

    int getMinSalary();

    int getMaxSalary();

    List<Employee> getMaxSalaryEmployee();
}
