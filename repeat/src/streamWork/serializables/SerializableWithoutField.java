package streamWork.serializables;

import streamWork.dto.Student;

import java.io.*;
import java.util.List;

public class SerializableWithoutField {
    private String FILENAME = "D:\\ideaProjects\\repeat\\src\\streamWork\\Students.bin";
    public void serialize(List<Student> studentList){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))){
//            for (Student student : studentList) {
                oos.writeObject(studentList);
//            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
