package threads.pizza;

import threads.pizza.api.IActionLog;

import java.time.LocalDateTime;

public class ActionLog implements IActionLog {
    private final String name;
    private final  LocalDateTime timeStart;
    private  LocalDateTime timeStop;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDateTime getTimeStart() {
        return timeStart;
    }


    public ActionLog(String name, LocalDateTime timeStart) {
        this.name = name;
        this.timeStart = timeStart;
    }


    @Override
    public String toString() {
        return "ActionLogger{" +
                "name='" + name + '\'' +
                ", timeStart=" + timeStart +
                '}';
    }
}
