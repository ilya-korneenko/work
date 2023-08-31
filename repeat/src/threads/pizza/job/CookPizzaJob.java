package threads.pizza.job;

import threads.pizza.ActionLog;
import threads.pizza.PizzaHut;
import threads.pizza.api.IPizza;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * Приготовление пиццы
 */
public class CookPizzaJob implements Runnable {

    private PizzaHut.Order order;

    public CookPizzaJob(PizzaHut.Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        order.addLog(new ActionLog("Начинаем готовить пиццу", LocalDateTime.now()));
        sleep();
        order.addLog(new ActionLog("Упаковка пиццы", LocalDateTime.now()));
        sleep();
        order.addLog(new ActionLog("Проверка качества", LocalDateTime.now()));
        sleep();
        order.addLog(new ActionLog("Готово к выдаче", LocalDateTime.now()));
        sleep();
        order.setPizza(new IPizza() {
            @Override
            public String toString() {
                return getName();
            }

            @Override
            public String getName() {
                 return order.getTicket().getSelectedRow().getName();
            }
        });
        order.setDone();
    }

    public void sleep(){
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);      //TODO переделать
        }
    }
}
