package Task2;

public class DiscountedProduct extends PromotionalProduct {
    public String reason;   //причина скидки

    @Override
    public String toString() {
        return name  +
                ", Цена - " + price +
                ", Скидка - " + percentageDiscount + "%," +
                " Причина уценки - " + reason + "\n"
                ;
    }
}
