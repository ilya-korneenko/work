package homework.hw_6.booksFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class    SaveResultsInFile {
    private File resultFile;

    public void saveResult(String nameFile, String resultSearch){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("result.txt", true))){
            bufferedWriter.append(nameFile);
            bufferedWriter.append(" ");
            bufferedWriter.append(resultSearch);
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
