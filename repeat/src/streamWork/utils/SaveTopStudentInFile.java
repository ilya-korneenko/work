package streamWork.utils;

import streamWork.dto.Student;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class SaveTopStudentInFile {
    private final Scanner scanner = new Scanner(System.in);

    public File saveSortedListInFile(List<Student> students){
        File file = new File(fileAddress());
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getAbsolutePath(),true))){
            for (Student student : students) {
                bufferedWriter.append(student.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }

    private String fileAddress(){
        System.out.println("Введите адрес для сохранения отсортированного топ N студентов");
        return scanner.nextLine();
    }
}
