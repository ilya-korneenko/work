package collection;

import collection.dto.Passport;
import collection.supplier.PassportSupplier;
import homework.hw_4.DataContainer;

import java.util.*;

public class Main15 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(date);
        System.out.println(date.getTime());

    }
}
