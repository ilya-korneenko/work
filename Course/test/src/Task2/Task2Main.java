package Task2;

import java.util.ArrayList;

public class Task2Main {
    public static void main(String[] args) {
        ArrayList<Products> listProduct = new ArrayList<>();        //лист всех товаров
        ArrayList<String> baskets= new ArrayList<>();               //корзина (товары записываем сюда)
        Shop shop = new Shop(listProduct);
        shop.addProduct();
        int []count;
        int [] countInBasket;
        Basket basket = new Basket(listProduct, baskets);
        basket = shop.createBasket();

    }
}
