package com.plurasight;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership(
                "D & B Used Cars", "111 Old Benbrook Rd", "817-555-5555");

        Vehicle vehicle = new Vehicle(
                10112, 1993, "Ford", "Explorer", "SUV", "Red", 525123, 995.00);

        dealership.addVehicle(vehicle);

        for (Vehicle car : dealership.getAllVehicles()) {
            System.out.println(car.getYear() + " " + car.getMake() + " " + car.getModel());
        }
    }
}
