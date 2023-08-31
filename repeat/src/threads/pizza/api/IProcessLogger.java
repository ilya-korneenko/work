package threads.pizza.api;

import java.util.List;

public interface IProcessLogger {
    List<IActionLog> getLogs();

    boolean isDone();
}
