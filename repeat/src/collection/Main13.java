package collection;

import collection.dto.Passport;

import java.util.*;

public class Main13 {
    public static void main(String[] args) {

        Map<String, Passport> currentPassports = new HashMap<>();
//        currentPassports.put("asd", new Passport());
//        currentPassports.put("123", new Passport());

        Map<String, List<Passport>> oldPassports= new HashMap<>();

        Set<String> keySet = currentPassports.keySet();

        for (String s : keySet) {
            System.out.println(s);
        }

        Collection<Passport> passportCollection = currentPassports.values();

        for (Passport passport : passportCollection) {
            System.out.println(passport);
        }

        Set<Map.Entry<String, Passport>> entrySet = currentPassports.entrySet();

        for (Map.Entry<String, Passport> stringPassportEntry : entrySet) {
            System.out.println(stringPassportEntry);
        }
    }
}
