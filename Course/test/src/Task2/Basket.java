package Task2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Basket {
    public ArrayList<Products> listProduct;

    public Basket(int[] count, int[] countInBasket) {
        this.count = new int[listProduct.size() - 1];
        this.countInBasket = new int[listProduct.size() - 1];
    }

    public int[] count;     //изначальное кол-во товаров в магазине

    public int[] countInBasket;     //количество товаров в корзине

    public Basket(ArrayList<Products> listProduct, ArrayList<String> baskets) {
        BasketList = new ArrayList<String>();
        this.listProduct = listProduct;

        int[] count = new int[listProduct.size()];
        int[] countInBasket = new int[listProduct.size()];
        this.count = countProd(count);
    }

//    {
//        assert false;
//        countInBasket = new int[listProduct.size()-1];
//        assert false;
//        count = new int[listProduct.size()-1];
//    }

    private int[] countProd(int[] count) {
        Random random = new Random();
        for (int i = 0; i < listProduct.size(); i++) {
            count[i] = random.nextInt(10) + 1;
        }
        return count;
    }


    public ArrayList<String> getBasketList() {
        return BasketList;
    }


    public ArrayList<String> BasketList;


//    public ArrayList<Products> getListProduct() {
//        return listProduct;
//    }

    public void add() {

        Scanner console = new Scanner(System.in);
        String choice;
        System.out.println();
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.print(" Наличие товара в магазине(штук): " + count[i] +
                    "| " + listProduct.get(i).toString());

        }
        do {
            System.out.println("Выберите товар и напишите его название:" + "\n||||для выхода нажмите 0||||");
            choice = console.nextLine();
            for (Products products : listProduct) {
                if (choice.equalsIgnoreCase(products.name)) {
                    BasketList.add(products.name);
                }
            }
        } while (!choice.contentEquals("0"));
        for (int i = 0; i < BasketList.size(); i++) {
            for (int j = 0; j < listProduct.size(); j++) {
                if (BasketList.get(i).equalsIgnoreCase(listProduct.get(j).name)) {
                    int temp;
                    do {
                        System.out.println(BasketList.get(i) + " Укажите количество: ");
                        console = new Scanner(System.in);
                        temp = console.nextInt();
                        if (temp > count[j] || temp < 1) {
                            System.out.println("Неверно!" +
                                    " Попробуй еще раз");

                        }else {
                            countInBasket[i]=temp;
                            count[j]-=temp;
                        }
                    } while (temp > count[j] || temp < 1);
            }
//            if (BasketList.get(i).equalsIgnoreCase(listProduct.get(j).name)) {
//                int temp;
//                do {
//                    System.out.println(BasketList.get(j) + " Укажите количество: ");
//                    console = new Scanner(System.in);
//                    temp = console.nextInt();
//                    if (temp > count[i] || temp < 1) {
//                        System.out.println("Неверно!" +
//                                " Попробуй еще раз");
//
//                    }
//                } while (temp > count[i] || temp < 1);
            }
        }
        System.out.println(BasketList.toString());
    }

    public String out() {
        return listProduct.toString();
    }
}

