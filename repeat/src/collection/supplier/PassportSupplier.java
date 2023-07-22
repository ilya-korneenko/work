package collection.supplier;

import collection.dto.Passport;
import collection.dto.PassportBuilder;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class PassportSupplier implements Supplier<Passport> {

    private ThreadLocalRandom rnd = ThreadLocalRandom.current();

    @Override
    public Passport get() {
        return PassportBuilder.create()
                .setHumanId(String.valueOf(rnd.nextDouble()))
                .setNumber(String.valueOf(rnd.nextDouble(0,100)))
                .setExpiresDate(LocalDate.now())
                .setIssueDate(LocalDate.now())
                .build();
    }
}
