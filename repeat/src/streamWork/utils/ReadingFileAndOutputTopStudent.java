package streamWork.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFileAndOutputTopStudent {
    private final Scanner scanner = new Scanner(System.in);
    private final String FILENAME = "D:\\ideaProjects\\repeat\\src\\streamWork\\saveFile.txt";

    public String OutputStudent(){
        int countStudentsInFile = numberStudent();
        System.out.println("Введите Количество последних студентов, которое желаете вывести");
        System.out.printf("Диапазон от %d, до %d%n",0,countStudentsInFile);
        int countStudentForOutput = scanner.nextInt();
        int startOutput = countStudentsInFile - countStudentForOutput;
        StringBuilder studentsOutput = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))){
            String read;
            int countStudent = 0;
            while ((read = reader.readLine())!=null){
                if(countStudent == startOutput){
                    studentsOutput.append(read);
                }else {
                    if(countStudent == startOutput){
                        studentsOutput.append(read).append("\n");
                    }else{
                        countStudent++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return String.valueOf(studentsOutput);
    }

    private int numberStudent(){
        int countStudents = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILENAME))){
            String line;
            while ((line = bufferedReader.readLine())!=null){
                countStudents++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countStudents;
    }
}
