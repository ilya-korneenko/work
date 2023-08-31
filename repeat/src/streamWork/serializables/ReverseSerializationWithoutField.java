package streamWork.serializables;

import streamWork.comparator.ComparatorAssessment;
import streamWork.comparator.ComparatorNameStudent;
import streamWork.dto.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSerializationWithoutField {
//    private String serializFileName = "D:\\ideaProjects\\repeat\\src\\streamWork\\Students.bin";
    public List<Student> reverseFromSerializationFile(String nameSerealizFile, int countStudent ){
        ComparatorNameStudent cmpNameStudent = new ComparatorNameStudent();
        ComparatorAssessment cmpAssessmentStudent = new ComparatorAssessment();
        List<Student> studentList = new ArrayList<>();

        List<Student> sortedTopStudent = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nameSerealizFile))){
//            studentList.add((Student) ois.readObject());
//            studentList = (List<Student>) ois.readObject();
                studentList =((List<Student>)ois.readObject());
//                Student student = new Student();
//                student = (Student) ois.readObject();
//                System.out.println("\n\n");
//                System.out.println();
//                System.out.println(student);
//                studentList = (Stream<Student>)ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n\n\n" + studentList.toString());
        sortedTopStudent = studentList.stream().sorted(cmpAssessmentStudent).sorted(cmpNameStudent).limit(countStudent).collect(Collectors.toList());

        return sortedTopStudent;
    }
}
