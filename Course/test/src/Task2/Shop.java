package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    public ArrayList<Products> getListProduct() {   //получает список товаров
        return listProduct;
    }

    public ArrayList<Products> listProduct;     //список товаров

    public Shop(ArrayList<Products> listProduct) {
        this.listProduct = listProduct;
    }       //конструктор


    /**
     * @addProduct  - добавление любого из 3х товаров
     *                  акционный/уцененный/обычный
     */
    public void addProduct() {
        Scanner console = new Scanner(System.in);
        int choice;
        //String name;

        //добавление товара в список товаров
        do {

            System.out.print("\nКакой товар хотите внести:\n" +
                    "|1.Обычный|\n|2.Акционный|\n|3.Уцененный|\n" +

                    "|Для выхода введите 0|"+"\nВведите:\t");
            choice = console.nextInt();
            switch (choice) {
                case 1:
                    console = new Scanner(System.in);
                    Products pr = new Products();
                    System.out.print("\nВведите название: ");
                    //console.next();
                        pr.name = console.nextLine();

                    System.out.print("\nВведите цену: ");
                    //console.next();
                        pr.price = console.nextDouble();

                    listProduct.add(pr);
                    break;
                case 2:
                    console = new Scanner(System.in);
                    PromotionalProduct product = new PromotionalProduct();
                    System.out.print("\nВведите название: ");
                    //console.next();
                    product.name = console.nextLine();
                    System.out.print("\nВведите цену: ");

                    product.price = console.nextDouble();
                    System.out.print("\nВведите скидку(%): ");

                    product.percentageDiscount = console.nextInt();
                    listProduct.add(product);
                    break;
                case 3:
                    console = new Scanner(System.in);
                    DiscountedProduct prod = new DiscountedProduct();
                    System.out.print("\nВведите название: ");
                    //console.next();
                    prod.name = console.nextLine();
                    System.out.print("\nВведите цену: ");
                    //console.next();
                    prod.price = console.nextDouble();
                    System.out.print("\nВведите скидку(%): ");
                    //console.next();
                    prod.percentageDiscount = console.nextInt();
                    System.out.print("\nВведите причину наличия скидки: ");
                    //console.next();
                    //console.next();
                    console = new Scanner(System.in);
                    prod.reason = console.nextLine();
                    listProduct.add(prod);
                    break;
                default:
                    System.out.println("Error! Неверное значение!");
            }

        } while (choice != 0);
        System.out.println(listProduct.toString());
    }


    /**
     * createBasket - создание new корзины
     * @return basket - возвращение новой пустой корзины
     */
    public Basket createBasket(){
        int[] count = new int[listProduct.size()];
        int[] countOfBasket = new int[0];
        return new Basket(count, countOfBasket);
    }


}
