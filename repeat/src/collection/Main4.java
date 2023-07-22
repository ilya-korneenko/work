package collection;

import generic.dto.Student;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Set<Student> data = new HashSet<>();

        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            Student s = new Student();
            s.setAge(rnd.nextInt(100));
            s.setName(String.valueOf(rnd.nextInt()));
            data.add(s);
        }

        System.out.println(data);
    }
}
