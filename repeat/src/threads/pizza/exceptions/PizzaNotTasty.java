package threads.pizza.exceptions;

/**
 * Используется, когда пицца ещё не готова
 */
public class PizzaNotTasty extends Exception{
    public PizzaNotTasty() {
    }

    public PizzaNotTasty(String message) {
        super(message);
    }

    public PizzaNotTasty(String message, Throwable cause) {
        super(message, cause);
    }

    public PizzaNotTasty(Throwable cause) {
        super(cause);
    }

    public PizzaNotTasty(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
