
package files;

import homework.hw_5.dto.Person;
import homework.hw_5.supplier.TruePersonSupplier;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.function.Supplier;

public class Main9 {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = new TruePersonSupplier();
        Person person = personSupplier.get();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dataField.bin"))) {
            oos.writeUTF(person.getName());
            oos.writeUTF(person.getNick());
            oos.writeUTF(person.getPassword());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


