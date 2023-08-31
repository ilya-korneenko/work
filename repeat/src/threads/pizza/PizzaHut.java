package threads.pizza;

import org.junit.platform.commons.util.PackageUtils;
import threads.pizza.api.*;
import threads.pizza.exceptions.OrderNotFound;
import threads.pizza.exceptions.PizzaNotTasty;
import threads.pizza.job.CookPizzaJob;

import java.time.LocalDateTime;
import java.util.*;

public class PizzaHut implements IPiceria {

    private List<IMenuRow> menu = new ArrayList<>();
    protected Map<ITicket,Order> orders = new HashMap<>();


    public PizzaHut(){
        this.menu.add(new MenuRow("Грибная",10));
        this.menu.add(new MenuRow("Ананасовая",10));
        this.menu.add(new MenuRow("Пепперони",10));
        this.menu.add(new MenuRow("Мясная",10));
        this.menu.add(new MenuRow("Грушевая",10));
        this.menu.add(new MenuRow("Фруктовая",10));
        this.menu.add(new MenuRow("Несъедобная",10));
    }
    @Override
    public ITicket createOrder(IMenuRow row) {
        ITicket ticket = new Ticket(UUID.randomUUID().toString(),row);
        Order order = new Order(ticket);

        order.addLog(new ActionLog("Заказ принят", LocalDateTime.now()));

        this.orders.put(order.getTicket(), order);

        CookPizzaJob cook = new CookPizzaJob(order);
        cook.run();

        return ticket;
    }

    @Override
    public List<IMenuRow> takeMenu() {
        return Collections.unmodifiableList(menu);
    }

    @Override
    public IProcessLogger check(ITicket ticket) throws OrderNotFound {
        if(!this.orders.containsKey(ticket)){
            throw new OrderNotFound("Заказ с номером " + ticket.getNumber() + " не найден");
        };

        return this.orders.get(ticket).processLogger;
    }

    @Override
    public IPizza takeOrder(ITicket ticket) throws OrderNotFound, PizzaNotTasty {
        if(!this.orders.containsKey(ticket)){
            throw new OrderNotFound("Заказ с номером " + ticket.getNumber() + " не найден");
        };
        Order order = this.orders.get(ticket);
        if(order.isTake()){
            throw new OrderNotFound("Заказ с номером " + ticket.getNumber() + " уже забрали");
        }

        if(!order.getProcessLogger().isDone()){
            throw new PizzaNotTasty("Пицца по заказу " + ticket.getNumber() + " ещё не готова");
        }

        order.setTake();

        return this.orders.get(ticket).getPizza();
    }

    public static class Order{
        private ITicket ticket;
        private ProcessLogger processLogger;
        private IPizza pizza;
        private boolean take;

        public boolean isTake() {
            return take;
        }

        public Order(ITicket ticket) {
            this.ticket = ticket;
            this.processLogger = new ProcessLogger();
        }

        public ITicket getTicket() {
            return ticket;
        }

        public IProcessLogger getProcessLogger() {
            return processLogger;
        }

        public void addLog(IActionLog log){
            this.processLogger.addLog(log);
        }
        public void setDone(){
            this.processLogger.setDone(true);
        }

        public void setTake(){
            this.take = true;
        }

        public IPizza getPizza() {
            this.take = true;
            return pizza;
        }

        public void setPizza(IPizza pizza) {
            this.pizza = pizza;
        }
    }
}
