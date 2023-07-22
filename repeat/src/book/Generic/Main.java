package book.Generic;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("reno");
        Vehicle vehicle1 = new Vehicle("pezo");
//
//        System.out.println(vehicle1 +" " + vehicle);
    Garage<Vehicle> vehicleGarage = new Garage<>();
        Garage<Vehicle> vehicleGarage2 = new Garage<>();


        vehicleGarage.setData(vehicle);
        System.out.println(vehicleGarage.getData());
    }
}
