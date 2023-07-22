package classWork.humanExample;

public class HumanExam {
    public static void main(String[] args) {
        Human human = new Human("Ivan", "Strelnikov");
        System.out.println(human.getFio());
        human.changeSecondName("Postnikov");
        human.changeSecondName("Borisov");
    }
}
