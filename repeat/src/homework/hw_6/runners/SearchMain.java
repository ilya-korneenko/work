package homework.hw_6.runners;

import homework.hw_6.utils.EasySearch;


public class SearchMain {
    public static void main(String[] args) {
        EasySearch easySearch = new EasySearch();

        String txt = " Привет , меня зовут кот . и кот это лучшее имя для кота . кот хороший и умный . кот";

        System.out.println(easySearch.search(txt, "и"));
    }
}
