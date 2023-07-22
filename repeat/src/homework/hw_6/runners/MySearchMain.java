package homework.hw_6.runners;

import homework.hw_6.utils.MySearch;

public class MySearchMain {
    public static void main(String[] args) {
        MySearch simpleSearch = new MySearch();

        String txt = " Привет , меня зовут кот . и кот это лучшее имя для кота . кот хороший и умный .";

        System.out.println(simpleSearch.search(txt, "и"));
    }
}
