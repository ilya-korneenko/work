package streamWork.serializables;

import streamWork.comparator.ComparatorAssessment;
import streamWork.comparator.ComparatorNameStudent;
import streamWork.dto.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSerializationWithField {
//    private String serializFileName = "D:\\ideaProjects\\repeat\\src\\streamWork\\Students.bin";
    public List<Student> reverseFromSerializationFile(String nameSerealizFile, int countStudent ){
        ComparatorNameStudent cmpNameStudent = new ComparatorNameStudent();
        ComparatorAssessment cmpAssessmentStudent = new ComparatorAssessment();
        List<Student> studentList = new ArrayList<>();

        List<Student> sortedTopStudent = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nameSerealizFile))){

            while (ois.available() != 0)    //если конец файла метод available() вернёт 0
            {
                    Student student = new Student();
                    student.setName(ois.readUTF());
                    student.setSecondName(ois.readUTF());
                    student.setMidleName(ois.readUTF());
                    student.setFIO(ois.readUTF());
                    student.setAssessment(Double.parseDouble(ois.readUTF()));
                    studentList.add(student);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n\n\n" + studentList.toString());
        sortedTopStudent = studentList.stream().sorted(cmpAssessmentStudent.thenComparing(cmpNameStudent)).limit(countStudent).collect(Collectors.toList());

        return sortedTopStudent;
    }
}
