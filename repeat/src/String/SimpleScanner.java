package String;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        String str = "1 Java 2 Java 3 Java";
        Scanner scanner = new Scanner(str).useDelimiter("\\s*Java\\s*");

        while (scanner.hasNextInt()){
            System.out.println(scanner.nextInt());
        }
    }
}
