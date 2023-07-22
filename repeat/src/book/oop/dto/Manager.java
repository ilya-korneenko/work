package book.oop.dto;

import java.time.LocalDate;

public class Manager extends Employee{

    private double bonus;
    /**
     *
     * @param salary зарплата
     * @param name имя сотрудника
     * @param birthday день рождение
     */

    public Manager(double salary, String name, LocalDate birthday) {
        super(salary, name, birthday);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public LocalDate getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void raiseSalary(double byPercent) {
        super.raiseSalary(byPercent);
    }


}
