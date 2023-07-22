package homework.hw_6.utils;

import homework.hw_6.FileToString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegExSearchTest {


    private final RegExSearch regExSearch = new RegExSearch();
    @Test
    void search() {
        Assertions.assertEquals(0,regExSearch.search("Мама мыла раму", "мыл"));
    }

    @Test
    void search1() {
        FileToString fileToString = new FileToString();
        fileToString.fileToString("WarAndPeace.txt");
        String str = String.valueOf(fileToString.getStr());
        Assertions.assertEquals(0,regExSearch.search(str, "мыл"));
    }

    @Test
    void search2() {
        FileToString fileToString = new FileToString();
        fileToString.fileToString("WarAndPeace.txt");
        String str = String.valueOf(fileToString.getStr());
        Assertions.assertEquals(23,regExSearch.search(str, "прав"));
    }

    @Test
    void search3() {
        FileToString fileToString = new FileToString();
        fileToString.fileToString("WarAndPeace.txt");
        String str = String.valueOf(fileToString.getStr());
        Assertions.assertEquals(12,regExSearch.search(str, "сад"));
    }
}