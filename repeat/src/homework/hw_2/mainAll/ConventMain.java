package homework.hw_2.mainAll;

import homework.hw_2.loops.task2.Algorithm;
import homework.hw_2.loops.task2.TrueCheckInput;

public class ConventMain {
    public static void main(String[] args) {
       TrueCheckInput trueCheckInput = new TrueCheckInput();
       Algorithm algorithm = new Algorithm();
        System.out.print(trueCheckInput.out());
        int result = algorithm.result(trueCheckInput.getArr());
        System.out.print(result);
    }
}
