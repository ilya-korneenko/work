package collection;

import collection.dto.Passport;
import collection.supplier.PassportSupplier;

import java.util.*;

public class Main14 {
    public static void main(String[] args) {
        Map<String, Passport> mapPassports = new HashMap<>();
        List<Passport> listPassports = new ArrayList<>();
        PassportSupplier generator = new PassportSupplier();

        Passport p = null;
        for (int i = 0; i < 1_000_000; i++) {
            Passport passport = generator.get();
            listPassports.add(passport);
            mapPassports.put(passport.getNumber(), passport);
            p = passport;

        }

        long start = System.currentTimeMillis();
        Passport passportFromMap = mapPassports.get(p.getNumber());
        long stop = System.currentTimeMillis();
        System.out.println("В Map за " + (stop-start) + " мс был найден паспорт: " + passportFromMap);

        Passport passportFromList = null;
        start = System.currentTimeMillis();
        for (Passport item : listPassports) {
            if(item.getNumber().equals(p.getNumber())){
                passportFromList = item;
            }
        }
        stop = System.currentTimeMillis();
        System.out.println("В ArrayList за " + (stop-start) + " мс был найден паспорт: " + passportFromList);

//        System.out.println(p);
//        System.out.println(listPassports.size());
//        System.out.println(mapPassports.size());


    }
}
