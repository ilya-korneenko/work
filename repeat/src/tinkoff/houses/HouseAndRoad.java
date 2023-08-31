package tinkoff.houses;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
class ComparatorRoads implements Comparator<Road> {
    @Override
    public int compare(Road o1, Road o2) {
        return o1.getH()-o2.getH();
    }
}

public class HouseAndRoad {
    public void house(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи количество домов ");
        int house = scanner.nextInt();
        System.out.println("Введи количество дорог ");
        int roadNumber = scanner.nextInt();
        ArrayList<Road> allRoads = new ArrayList<>();
        for (int i = 0; i < roadNumber; i++) {
            Road road = new Road();
            System.out.println("Введи начало дороги");
            road.setFirst(scanner.nextInt());
            System.out.println("Введи конец дороги");
            road.setSecond(scanner.nextInt());
            System.out.println("Введи глубину");
            road.setH(scanner.nextInt());
            allRoads.add(road);
        }
        System.out.println(zatoplenie(allRoads)); ;
    }
    public int zatoplenie(ArrayList<Road> allRoad){
        allRoad.sort(new ComparatorRoads());
        int tempH = 0;
        int tempFirstRoad;

        for (int i = 0, j = 1; i < allRoad.size(); i++,j++) {
            tempH = allRoad.get(i).getH();
            tempFirstRoad = allRoad.get(i).getFirst();
            boolean flag = false;
            j=i+1;
            for ( ; j < allRoad.size(); j++) {
                if(tempFirstRoad==allRoad.get(j).getFirst()){
                    break;
                }
                if(j==allRoad.size()-1){
                    return tempH;
                }
            }
        }
        return tempH;
        }
}

class houseMain {
    public static void main(String[] args) {
        HouseAndRoad houseAndRoad = new HouseAndRoad();
        houseAndRoad.house();
    }
}



