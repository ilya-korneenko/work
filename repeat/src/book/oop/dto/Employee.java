package book.oop.dto;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

    private double salary;
    private String name;
    private LocalDate birthday;

    public Employee(double salary, String name, LocalDate birthday) {
        this.salary = salary;
        this.name = name;
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void raiseSalary(double byPercent){
        salary= salary+ (salary*byPercent/100);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
