package homework.hw_6.runners;

import homework.hw_6.FileToString;
import homework.hw_6.utils.EasySearch;
import homework.hw_6.utils.MySearch;
import homework.hw_6.utils.RegExSearch;

public class WithRegister {
    public static void main(String[] args) {
        FileToString fileToString = new FileToString();

        EasySearch easySearch = new EasySearch();
        RegExSearch regExSearch = new RegExSearch();
        MySearch mySearch = new MySearch();


        String str = String.valueOf(fileToString.fileToString("WarAndPeace.txt"));

        System.out.println(easySearch.search(str, "война"));
        System.out.println(regExSearch.search(str,"война"));
//        System.out.println(mySearch.search(str,"война"));

        System.out.println(easySearch.search(str, "и"));
        System.out.println(regExSearch.search(str,"и"));
//        System.out.println(mySearch.search(str,"и"));

        System.out.println(easySearch.search(str, "мир"));
        System.out.println(regExSearch.search(str,"мир"));
//        System.out.println(mySearch.search(str,"мир"));

    }
}
