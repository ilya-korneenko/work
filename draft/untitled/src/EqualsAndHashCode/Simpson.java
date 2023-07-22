package EqualsAndHashCode;

import java.util.Objects;

public class Simpson {
    private String name;
    private int weight;
    private int age;

    public Simpson(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        //1
        if (this == o) return true;
        //2
        if (o == null || getClass() != o.getClass()) return false;
        //3
        Simpson simpson = (Simpson) o;
        return weight == simpson.weight && age == simpson.age && name.equals(simpson.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, weight, age);
//    }
}
