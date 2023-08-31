package threads;

import threads.pizza.PizzaHut;
import threads.pizza.PizzaHutWithAdditionalThread;
import threads.pizza.api.*;
import threads.pizza.exceptions.OrderNotFound;
import threads.pizza.exceptions.PizzaNotTasty;

import java.util.List;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) throws OrderNotFound, PizzaNotTasty {

        pizza(new PizzaHut());
        pizza(new PizzaHutWithAdditionalThread());
    }

    public static void pizza(IPiceria piceria) throws OrderNotFound, PizzaNotTasty {
//        IPiceria piceria ;

        //получаем меню
        List<IMenuRow> iMenuRows = piceria.takeMenu();

        //печатаем меню
        for (IMenuRow row : iMenuRows) {
            System.out.println(row);
        }

        //выбираем пиццу
        Random rnd = new Random();
        int choice = rnd.nextInt(iMenuRows.size());

        //заказываем пиццу
        ITicket ticket = piceria.createOrder(iMenuRows.get(choice));

        IProcessLogger check;

//        do {
//            check = piceria.check(ticket);
//            if(!check.isDone()){
//
//            }
//        }while (!check.isDone());

        //верхний и нижний блок
        //взаимозаменяемы

        //ожидаем готовности пиццы
        while (!(check = piceria.check(ticket)).isDone()){
            List<IActionLog> actions = check.getLogs();
            for (IActionLog action : actions) {
                System.out.println(action);
            }
            System.out.println("Ещё не готово");
            System.out.println("________________________");
        }

        //пицца готова, забираем её
        IPizza pizza = piceria.takeOrder(ticket);

        //конец
        System.out.println("Получили " + pizza);
        System.out.println("Очень вкусно");

    }
}
