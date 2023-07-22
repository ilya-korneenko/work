package homework.hw_6.utils;

import homework.hw_6.FileToString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasySearchTest {
    private final EasySearch easySearch = new EasySearch();
    @Test
    void search() {
        Assertions.assertEquals(0,easySearch.search("Мама мыла раму", "мыл"));
    }

    @Test
    void search1() {
        FileToString fileToString = new FileToString();
        fileToString.fileToString("WarAndPeace.txt");
        //String str = String.valueOf(fileToString.getStr());
        //Assertions.assertEquals(0,easySearch.search(str, "мыл"));
    }
    @Test
    void search2() {
        FileToString fileToString = new FileToString();
        fileToString.fileToString("WarAndPeace.txt");
//        String str = String.valueOf(fileToString.getStr());
//        Assertions.assertEquals(23,easySearch.search(str, "прав"));
    }

    @Test
    void search3() {
        FileToString fileToString = new FileToString();
        fileToString.fileToString("WarAndPeace.txt");
//        String str = String.valueOf(fileToString.getStr());
//        Assertions.assertEquals(12,easySearch.search(str, "сад"));
    }
}