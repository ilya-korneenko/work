package streamWork.serializables;

import streamWork.dto.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializationWithField {
    private final String FILENAME = "D:\\ideaProjects\\repeat\\src\\streamWork\\Students.bin";
    public void serialization(List<Student> studentList){
        Student student = new Student();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))){
            for (Student studentFromList : studentList) {
                oos.writeUTF(studentFromList.getName());
                oos.writeUTF(studentFromList.getSecondName());
                oos.writeUTF(studentFromList.getMidleName());
                oos.writeUTF(studentFromList.getFIO());
                oos.writeUTF(String.valueOf(studentFromList.getAssessment()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
