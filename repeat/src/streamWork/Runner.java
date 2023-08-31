package streamWork;

import streamWork.dto.Student;
import streamWork.serializables.ReverseSerializationWithField;
import streamWork.serializables.SerializationWithField;
import streamWork.utils.Generate;
import streamWork.utils.ReadingFileAndOutputTopStudent;
import streamWork.utils.SaveTopStudentInFile;

import java.io.*;
import java.util.List;

public class Runner {
    public static void main(String[] args)  {

        Generate generate = new Generate();

        String nameFile = "D:\\ideaProjects\\repeat\\src\\streamWork\\Students.bin2";
        boolean checkFileExist = false;
        File file = new File(nameFile);

        if(file.exists()){
            System.out.println("ok");
        }else {
            file = new File("D:\\ideaProjects\\repeat\\src\\streamWork","Students.bin");

        }
        try {
            if(file.createNewFile()){
                System.out.println("ok2");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Student> studentList = generate.generate();
//        for (Student student : studentList) {
//            System.out.println(student);
//        }

        SerializationWithField serializationWithField = new SerializationWithField();
        serializationWithField.serialization(studentList);
        ReverseSerializationWithField reverseSerializationWithField = new ReverseSerializationWithField();
        List<Student> listSortedPerson = reverseSerializationWithField.reverseFromSerializationFile(
                "D:\\ideaProjects\\repeat\\src\\streamWork\\Students.bin",1000);

        SaveTopStudentInFile save = new SaveTopStudentInFile();
        File savingFile = save.saveSortedListInFile(listSortedPerson);

        ReadingFileAndOutputTopStudent reading = new ReadingFileAndOutputTopStudent();
        String res = reading.OutputStudent();
        System.out.println(res);

        //        SerializableWithoutField serializableWithoutField = new SerializableWithoutField();
//        serializableWithoutField.serialize(studentList);
//
//        ReverseSerialization reverseSerialization = new ReverseSerialization();
//        List<Student> listSortedPerson = reverseSerialization.reverseFromSerializationFile("D:\\ideaProjects\\repeat\\src\\streamWork\\Students.bin",10);
//        System.out.println("\n\n\n");
//        for (Student sortedPerson : listSortedPerson) {
//            System.out.println(sortedPerson);
//        }
    }
}
