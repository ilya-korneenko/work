package book.exceptions.runners;

import book.exceptions.Task43;

public class runner43 {
    public static void main(String[] args) {
        try {
            Task43 task43 = new Task43();
            System.out.println(task43.task());

        }catch (NullPointerException e){
            System.out.println("Ошибка. Вы обращаетесь к ссылке = null");
        }
    }

}
