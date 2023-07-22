package classWork.humanExample;

import java.util.Arrays;

public class HumanExam2 {
    public static void main(String[] args) {
        Human2 human = new Human2("Ivan", "Strelnikov");
        System.out.println(human.getFio());
        human.changeSecondName("Postnikov");
        System.out.println(human.getFio());
        human.changeSecondName("Borisov");
        System.out.println(human.getFio());
        System.out.println(Arrays.toString(human.getOldLastName()));

    }
}
