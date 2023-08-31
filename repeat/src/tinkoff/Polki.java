package tinkoff;

import java.util.ArrayList;
import java.util.Scanner;

public class Polki {
    public StringBuilder polki(int m) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        ArrayList<Integer> polki = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            scanner = new Scanner(System.in);
            String str = null;
            System.out.println("Введи:");
            if(scanner.hasNextLine()) {
                str = scanner.nextLine();
            }

            if (str.contains("+")) {
                int numberDetail = Integer.parseInt(str.substring(1));
                if(polki.isEmpty()) {
                    polki.add(numberDetail);
                    stringBuilder.append((polki.indexOf(numberDetail)+1)).append("\n");
                }else {
                    boolean flag = false;
                    int index =0;
                    for (Integer detail : polki) {
                        if(detail==0){
                            polki.set(index,numberDetail);

                            flag = true;
                            stringBuilder.append((polki.indexOf(numberDetail)+1)).append("\n");
                        }
                        index++;
                    }
                    if(!flag){
                        polki.add(numberDetail);
                        stringBuilder.append((polki.indexOf(numberDetail)+1)).append("\n");
                    }
                }
            } else if (str.contains("-")) {
                int num = Integer.parseInt(str.substring(1));
                int index=0;
                for (Integer numberDetail : polki) {
                    if (numberDetail.equals(num)) {
                        polki.set(index,0);
                    }
                    index++;
                }
            }

        }
    return stringBuilder;
    }

}
class PolkiMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество операций");
        int operation = scanner.nextInt();
        Polki polki = new Polki();
        String res = String.valueOf(polki.polki(operation));
        System.out.println(res);
    }
}