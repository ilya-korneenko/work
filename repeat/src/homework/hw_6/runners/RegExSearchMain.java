package homework.hw_6.runners;

import homework.hw_6.utils.RegExSearch;


public class RegExSearchMain {
    public static void main(String[] args) {
        RegExSearch regExSearch = new RegExSearch();

        String txt = " Привет , меня зовут кот. и кот это лучшее имя для кота. кот хороший и умный. кот..";

        System.out.println(regExSearch.search(txt, "кот"));
    }
}
