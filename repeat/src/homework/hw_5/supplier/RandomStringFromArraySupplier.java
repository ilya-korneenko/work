package homework.hw_5.supplier;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class RandomStringFromArraySupplier implements Supplier<String> {
    Random random = new Random();
    public RandomStringFromArraySupplier(String[] names){
        this.names = names;
    }
    private String [] names = {"Алеся", "Антон", "Кирил", "Гондо", "Карго", "ДэдинсайдБлядьСэтойТаской"};
    @Override
    public String get() {
        return names[random.nextInt(names.length)];
    }
}
