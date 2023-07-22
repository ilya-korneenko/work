package Task2;

public class PromotionalProduct extends Products {
    public int percentageDiscount; //скидка в процентах

    @Override
    public String toString() {
        return name +
                ", Цена - " + price + "," +
                " Скидка - " + percentageDiscount + "%\n"
                ;
    }
}
