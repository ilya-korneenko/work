package EqualsAndHashCode;

public class EqualsAndHashCodeExample {
    public static void main(String[] args) {
        System.out.println(new Simpson("Homer", 35, 120).
                equals(new Simpson("Homer", 35, 120)));
        System.out.println(new Simpson("Bart", 10, 120).
                equals(new Simpson("El Barto", 10, 45)));
        System.out.println(new Simpson("Lisa", 54, 60).
                equals(new Object()));
    }
}
