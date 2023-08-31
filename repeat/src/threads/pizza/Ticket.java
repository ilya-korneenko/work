package threads.pizza;

import threads.pizza.api.IMenuRow;
import threads.pizza.api.ITicket;

import java.util.Objects;

public class Ticket implements ITicket {
    private String number;
    private IMenuRow selectedRow;

    public Ticket(String number, IMenuRow selectedRow) {
        this.number = number;
        this.selectedRow = selectedRow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(number, ticket.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public IMenuRow getSelectedRow() {
        return selectedRow;
    }
}
