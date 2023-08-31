package tinkoff;

public class Class1 {
    /**
     * @param a aбонентская плата Кости составляет A рублей
     * @param b За эту стоимость Костя получает b мегабайт интернет-трафика.
     * @param c о каждый следующий мегабайт будет стоить ему C рублей.
     * @param d планирует потратить
     * @return стоимость
     */

    public int cesh(int a, int b, int c, int d) {
        int exceeded;
        int sum = 0;
        if (b - d >= 0) {
            return a;
        } else {
            exceeded = d - b;
            return exceeded * c + a;
        }

    }
}
