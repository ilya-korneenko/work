package lamda;

import streamWork.comparator.ComparatorAssessment;
import streamWork.dto.Student;

import java.util.Comparator;

public class LambdaMain1 {
    public static void main(String[] args) {

        final UserName userName = new UserName();
        userName.setName("Наташа");
        ICall device = new ICall() {
            @Override
            public boolean call(String number) {
                System.out.println("Набираем из анон класса. " + userName.getName());
                return false;
            }
        };
        ICall device2 = new Phone();
        ICall device3 = (num) -> {
            System.out.println("Включаем прослушку. Набираем " + num + "......." + userName.getName());
            return true;
        };
        System.out.println(callToNumber(device, "+32222255521135"));
        System.out.println(callToNumber(device2, "+375555555555555"));
        System.out.println(callToNumber(device3, "+999 999 999"));
        Comparator<Student> cmp = (student1, student2) -> {
            if (student1.getAssessment() - student2.getAssessment() < 0) {
                return -1;
            } else if (student1.getAssessment() - student2.getAssessment() > 0) {
                return 1;
            } else {
                return 0;
            }
        };
        compare(Sort::compareFIO);
        compare2(Sort::compareScore);
    }

    public static boolean callToNumber(ICall device, String number) {
        return device.call(number);
    }

    public static boolean compare(Comparator<String> comparator){
        return true;
    }

    public static boolean compare2(Comparator<Double> comparator){
        return true;
    }
}
