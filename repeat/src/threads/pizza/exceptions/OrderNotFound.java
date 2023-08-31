package threads.pizza.exceptions;

/**
 * Используется, когда заказ не найден
 */
public class OrderNotFound extends Exception{
    public OrderNotFound() {
        super();
    }

    public OrderNotFound(String message) {
        super(message);
    }

    public OrderNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderNotFound(Throwable cause) {
        super(cause);
    }

    protected OrderNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
