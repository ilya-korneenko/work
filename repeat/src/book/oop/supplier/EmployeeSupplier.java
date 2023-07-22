package book.oop.supplier;

import book.oop.dto.Employee;
import book.oop.dto.EmployeeBuilder;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class EmployeeSupplier implements Supplier<Employee> {
    private ThreadLocalRandom rnd = ThreadLocalRandom.current();
    private LocalDate localDate;

    @Override
    public Employee get() {
        return EmployeeBuilder.
                create().
                setBirthday(LocalDate.now()).
                setName("Илья").
                setSalary(rnd.nextInt(100,800)).
                build();
    }
}
