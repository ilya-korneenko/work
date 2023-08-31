package threads.pizza;

import threads.pizza.api.IMenuRow;

import java.util.Objects;

public class MenuRow implements IMenuRow {
    private String name;
    private double price;

    public MenuRow(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuRow menuRow = (MenuRow) o;
        return Double.compare(menuRow.price, price) == 0 && Objects.equals(name, menuRow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "MenuRow{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
