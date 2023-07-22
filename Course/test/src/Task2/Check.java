package Task2;

import java.util.ArrayList;

public class Check {
    /**
     * countInBasket[] - массив количества
     * basketList - лист количества товаров
     */
    public int[] countInBasket;
    public ArrayList<Products> listProduct;
    public ArrayList<String> basketList;

    //public Basket<String> basketList;
    @Override
    /**
     * @return - возвращает весь чек
     */
    public String toString() {
        int[] index = new int[basketList.size()];
        int k = 0;
//        //for (int i = 0; i < basketList.size(); i++) {
//            System.out.print("\n" + basketList.get(i)+", ");
//            boolean b;
//            for (int j = 0; j < listProduct.size(); j++) {
//                if (listProduct.get(j).name.equalsIgnoreCase(basketList.get(i))) {
//                    b = true;
//                    index = j;
//                }
//
//            }
//            //         listProduct.get(i).name.equalsIgnoreCase(basketList.get(i))
//            System.out.print("Цена: " + listProduct.get(index).price);
//            System.out.print("Количество: " + countInBasket[i]);
//        }

        for (String s : basketList) {
            for (int j = 0; j < listProduct.size(); j++) {
                if (listProduct.get(j).name.equalsIgnoreCase(s)) {
                    index[k] = j;
                    k++;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        double tempSum;
        double allSum = 0;
        for (int i = 0; i < basketList.size(); i++) {
            result.append(listProduct.get(index[i]));
            result.append(" Количество ").append(countInBasket[i]);
            tempSum = (listProduct.get(index[i]).price * countInBasket[i]);
            result.append(", Сумма ").append(tempSum).append("\n");
            allSum += tempSum;
            if (i == basketList.size() - 1) {
                result.append("\n Итого надо заплатить:").append(allSum);
            }
        }
        return result.toString();
    }
}
