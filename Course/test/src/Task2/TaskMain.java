package Task2;

import java.util.ArrayList;

public class TaskMain {
    public static void main(String[] args) {
        ArrayList<Products> listProduct = new ArrayList<>();        //лист всех товаров
        ArrayList<String> baskets= new ArrayList<>();               //корзина (товары записываем сюда)

        RegularProduct product1 = new RegularProduct();
        product1.name = "Молоко";
        product1.price = 2.5;
        RegularProduct product2 = new RegularProduct();
        product2.name = "Хлеб";
        product2.price = 1.7;
        RegularProduct product3 = new RegularProduct();
        product3.name = "Соль";
        product3.price = 1.9;
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);

        PromotionalProduct prod1 = new PromotionalProduct();
        prod1.name = "Соевое Молоко";
        prod1.price = 8.5;
        prod1.percentageDiscount = 10;
        PromotionalProduct prod2 = new PromotionalProduct();
        prod2.name = "Учебник по тупости";
        prod2.price = 100;
        prod2.percentageDiscount = 70;
        PromotionalProduct prod3 = new PromotionalProduct();
        prod3.name = "Старый кавказ";
        prod3.price = 40;
        prod3.percentageDiscount = 20;
        listProduct.add(prod1);
        listProduct.add(prod2);
        listProduct.add(prod3);

        DiscountedProduct pr1 = new DiscountedProduct();
        pr1.name = "Телевизор";
        pr1.price = 1000;
        pr1.percentageDiscount = 15;
        pr1.reason = "Царапина на боковой поверхности";
        DiscountedProduct pr2 = new DiscountedProduct();
        pr2.name = "Стол";
        pr2.price = 600;
        pr2.percentageDiscount = 20;
        pr2.reason = "Отсутствие столешницы";
        DiscountedProduct pr3 = new DiscountedProduct();
        pr3.name = "Кофемолка";
        pr3.price = 1500;
        pr3.percentageDiscount = 70;
        pr3.reason = "Жернова неисправны";

        listProduct.add(pr1);
        listProduct.add(pr2);
        listProduct.add(pr3);

//        int[] count = new int[listProduct.size()-1];
//        int[] countInBasket = new int[listProduct.size()-1];
//        Basket basket = new Basket(count, countInBasket);

        System.out.println(listProduct.toString());


        Basket basket = new Basket(listProduct, baskets);
        basket.add();
        Shop shop = new Shop(listProduct);
        shop.addProduct();
    }
}
