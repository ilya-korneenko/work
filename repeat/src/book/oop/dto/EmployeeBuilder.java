package book.oop.dto;

import java.time.LocalDate;

public class EmployeeBuilder {

    private String name;
    private LocalDate birthday;
    private double salary;

    private EmployeeBuilder(){

    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public static EmployeeBuilder create(){
        return new EmployeeBuilder();
    }

    public Employee build(){
        return new Employee(salary,name,birthday);
    }
}
