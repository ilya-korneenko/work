package collection;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {

    }

    public static void fori(List<String> collection){
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
    }

    public static void foreach(List<String> collection){
        for (String str : collection) {
            System.out.println(str);
        }
    }
}
