package ru.skypro.lessons.springboot.springboothm.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.springboothm.pojo.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    private final List<Employee> employeeList = List.of(
            new Employee("Катя", 90_000),
            new Employee("Дима", 102_000),
            new Employee("Олег", 80_000),
            new Employee("Вика", 165_000));

    @Override
    public int getSumSalary() {
        int sum = 0;
        for (Employee emp : employeeList) {
            sum += emp.getSalary();
        }
        return sum;
    }

    @Override
    public int getMinSalary() {
        int minSalary = 999999999;
        for (Employee emp : employeeList) {
            if (minSalary > emp.getSalary()) {
                minSalary = emp.getSalary();
            }
        }
        return minSalary;
    }

    @Override
    public int getMaxSalary() {
        int maxSalary = 0;
        for (Employee emp : employeeList) {
            if (maxSalary < emp.getSalary()) {
                maxSalary = emp.getSalary();
            }
        }
        return maxSalary;
    }

    @Override
    public List<Employee> getMaxSalaryEmployee() {
        List<Employee> middleSalaryEmployee = new ArrayList<>();
        int middleSalary = this.getSumSalary()/employeeList.size();
        for (Employee emp : employeeList) {
            if (emp.getSalary() > middleSalary) {
                middleSalaryEmployee.add(emp);
            }
        }
        return middleSalaryEmployee;
    }
}
