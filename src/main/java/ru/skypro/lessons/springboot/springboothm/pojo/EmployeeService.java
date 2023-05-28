package ru.skypro.lessons.springboot.springboothm.pojo;

import java.util.List;

public interface EmployeeService {
    int getSumSalary();

    int getMinSalary();

    int getMaxSalary();

    List<Employee> getMaxSalaryEmployee();
}
