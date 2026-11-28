package com.plurasight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<>();
    }

    //return all the vehicles by price
    public ArrayList<Vehicle> getVehicleByPrice(BigDecimal min, BigDecimal max){
        ArrayList<Vehicle> vehiclesByPrice = new ArrayList<>();
        for (Vehicle v: vehicles){
            if(v.getPrice().compareTo(min) >= 0 && v.getPrice().compareTo(max) <= 0){
                vehiclesByPrice.add(v);
            }
        }
        return vehiclesByPrice;
    }

    //return all the vehicles by make or model
    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model){
        ArrayList<Vehicle> vehiclesByMakeOrModel = new ArrayList<>();
        for (Vehicle v: vehicles){
            if(v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)){
                vehiclesByMakeOrModel.add(v);
            }
        }
        return vehiclesByMakeOrModel;
    }

    //return all the vehicles by year
    public ArrayList<Vehicle> getVehicleByYear(int min, int max){
        ArrayList<Vehicle> vehiclesByYear = new ArrayList<>();
        for (Vehicle v: vehicles){
            if(v.getYear() >= min && v.getYear() <= max){
                vehiclesByYear.add(v);
            }
        }
        return vehiclesByYear;
    }

    //return all the vehicles by color
    public ArrayList<Vehicle> getVehicleByColor(String color){
        ArrayList<Vehicle> vehiclesByColor = new ArrayList<>();
        for (Vehicle v: vehicles){
            if(v.getColor().equalsIgnoreCase(color)){
                vehiclesByColor.add(v);
            }
        }
        return vehiclesByColor;
    }

    //return all the vehicles by Mileage
    public ArrayList<Vehicle> getVehicleByMileage(int min,int max){
        ArrayList<Vehicle> vehiclesByMileage = new ArrayList<>();
        for (Vehicle v: vehicles){
            if(v.getOdometer() >= min && v.getOdometer() <= max){
                vehiclesByMileage.add(v);
            }
        }
        return vehiclesByMileage;
    }

    //return all the vehicles by VehicleType
    public ArrayList<Vehicle> getVehicleByType(String vehicleType){
        ArrayList<Vehicle> vehiclesByVehicleType = new ArrayList<>();
        for (Vehicle v: vehicles){
            if(v.getVehicleType().equalsIgnoreCase(vehicleType)){
                vehiclesByVehicleType.add(v);
            }
        }
        return vehiclesByVehicleType;
    }

    //return all the vehicles
    public ArrayList<Vehicle> getAllVehicles(){
        return vehicles;
    }


    //add new vehicle
    public void addVehicle(Vehicle v){
        vehicles.add(v);
    }

    public void removeVehicle(Vehicle v){
        vehicles.remove(v);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}