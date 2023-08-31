package threads.pizza.api;

import threads.pizza.exceptions.OrderNotFound;
import threads.pizza.exceptions.PizzaNotTasty;

import java.util.List;

/**
 * Пиццерия
 */
public interface IPiceria {
    /**
     * создать заказ
     * @param row выбранная строка из меню
     * @return возвращает квиток, по которому можно отслеживать заказ
     */
    ITicket createOrder(IMenuRow row);

    /**
     * получить меню пиццерии
     * @return список с позициями меню
     */
    List<IMenuRow> takeMenu();

    /**
     * Получить информацию о процессе приготовления пиццы
     * @param ticket квиток, который получили при заказе
     * @return Информация о приготовлении нашего заказа
     * @throws OrderNotFound Если заказа никогда не существовало
     */
    IProcessLogger check(ITicket ticket) throws OrderNotFound;

    /**
     * получение пиццы
     * @param ticket квиток, который получили при заказе
     * @return пицца, которую заказывали
     * @throws OrderNotFound Если заказ уже забрали или его никогда не существовало
     * @throws PizzaNotTasty Если пицца находится в процессе приготовления
     */
    IPizza takeOrder(ITicket ticket) throws OrderNotFound, PizzaNotTasty;
}
