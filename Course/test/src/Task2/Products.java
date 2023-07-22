package Task2;

public class Products {

    public String name;
    public double price;

    @Override
    public String toString() {
        return name  +
                ", Цена - " + price + "| \n";
    }
}
