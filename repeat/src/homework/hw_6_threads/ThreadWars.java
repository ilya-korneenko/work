package homework.hw_6_threads;

import homework.hw_6.FileToString;
import homework.hw_6.utils.EasySearch;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadWars implements Runnable{
    private final ThreadPoolExecutor executor;
    private final EasySearch easySearch = new EasySearch();
    private final Scanner scanner = new Scanner(System.in);
    private final FileToString fileToString = new FileToString();
    private String nameOfFile;

    public ThreadWars() {
        this.executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
    }

    @Override
    public void run() {
        String res = job();
        saveResultFile(res);
    }

    private String job(){
        StringBuilder builder = new StringBuilder();
        String address = addressDirectory();
        builder.append(address).append(" ");
        long countInTxt;
        File[] files = new File(addressDirectory()).listFiles();
        if(openDirectory(addressDirectory())) {
            for (File file : files) {
                countInTxt = search(file.getAbsolutePath(), builder);
                builder.append(countInTxt).append("\n");
            }
        }
        executor.shutdown();
        return String.valueOf(builder);
    }

    private String addressDirectory(){
        System.out.println("Введите название директории:\t");
        return scanner.nextLine();
    }

    private boolean openDirectory(String addressDir){
        File file = new File(addressDir);
        return file.isDirectory();
    }

    private long search(String nameFile, StringBuilder builder){
        System.out.print("Введите слово, которое желаете найти: ");
        String word = scanner.nextLine();
        String fileString = fileToString.fileToString("fff.txt");
        builder.append(word).append(" ");
        return easySearch.search(fileString,word);
    }

    public void saveResultFile(String str){
        File resFile = new File("resultThread.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resFile))){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
