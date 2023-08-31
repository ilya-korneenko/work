package threads.pizza;

import threads.pizza.api.*;
import threads.pizza.exceptions.OrderNotFound;
import threads.pizza.exceptions.PizzaNotTasty;
import threads.pizza.job.CookPizzaJob;

import java.time.LocalDateTime;
import java.util.*;

public class PizzaHutWithAdditionalThread extends PizzaHut {

    @Override
    public ITicket createOrder(IMenuRow row) {
        ITicket ticket = new Ticket(UUID.randomUUID().toString(), row);
        Order order = new Order(ticket);

        order.addLog(new ActionLog("Заказ принят", LocalDateTime.now()));

        this.orders.put(order.getTicket(), order);

        CookPizzaJob cook = new CookPizzaJob(order);

        Thread th = new Thread(cook);
        th.start();

        return ticket;
    }
}
