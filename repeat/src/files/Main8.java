
package files;

import homework.hw_5.dto.Person;
import homework.hw_5.supplier.TruePersonSupplier;

import java.io.*;
import java.util.function.Supplier;

public class Main8 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"))) {
            Person p = (Person) ois.readObject();
            System.out.println(p);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}



