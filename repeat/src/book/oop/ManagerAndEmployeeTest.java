package book.oop;

import book.oop.dto.Employee;
import book.oop.dto.EmployeeBuilder;
import book.oop.dto.Manager;
import book.oop.supplier.EmployeeSupplier;

import java.time.LocalDate;

public class ManagerAndEmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        Manager manager = new Manager(1200,"Anton", LocalDate.now());
        manager.setBonus(1000);
        manager.setSalary(manager.getSalary());

        EmployeeSupplier supplier = new EmployeeSupplier();

        for (int i = 0; i < staff.length-1; i++) {
            staff[i] = supplier.get();
        }
        staff[2] = manager;
        System.out.println(staff[2].getSalary());


        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i]);
        }
    }
}
