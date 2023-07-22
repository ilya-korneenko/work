package book.Generic;

public class Garage <T extends Vehicle>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "Vehicle=" + data +
                '}';
    }
}
