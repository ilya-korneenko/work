
package files;

import homework.hw_5.dto.Person;
import homework.hw_5.supplier.TruePersonSupplier;

import java.io.*;
import java.util.function.Supplier;

public class Main7 {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = new TruePersonSupplier();
        Person person = personSupplier.get();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.bin"))) {
            oos.writeObject(person);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


