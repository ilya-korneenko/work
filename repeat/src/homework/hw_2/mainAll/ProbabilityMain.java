package homework.hw_2.mainAll;

import homework.hw_2.task5.two.Probability;

public class ProbabilityMain {
    public static void main(String[] args) {
        Probability probability = new Probability();
        double res = probability.probabilityOfNumbers(100000000);
        System.out.println(res + "%");
    }
}
