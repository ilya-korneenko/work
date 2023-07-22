
package files;

import homework.hw_5.dto.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main10 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dataField.bin"))) {
            Person p = new Person();

            p.setName(ois.readUTF());
            p.setNick(ois.readUTF());
            p.setPassword(ois.readUTF());

            System.out.println(p);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}



