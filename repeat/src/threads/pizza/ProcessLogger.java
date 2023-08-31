package threads.pizza;

import threads.pizza.api.IActionLog;
import threads.pizza.api.IProcessLogger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProcessLogger implements IProcessLogger {
    private List<IActionLog> logs = new ArrayList<>();
    private boolean done;

    public List<IActionLog> getLogs() {
        return Collections.unmodifiableList(new ArrayList<>(logs));
    }

    public void addLog(IActionLog log){
        this.logs.add(log);
    }

    @Override
    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
