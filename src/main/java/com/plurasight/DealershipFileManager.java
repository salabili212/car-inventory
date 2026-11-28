package com.plurasight;
import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;

public class DealershipFileManager {
    private String dealershipsFilePath = "src/main/resources/inventory.csv";
    public void getDealership(){
        Dealership dealership;
        ArrayList<Vehicle> vehiclesList = new ArrayList<>();
        Vehicle vehicle;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dealershipsFilePath));
            String dealershipInfoText = bufferedReader.readLine();
            if(dealershipInfoText != null){
                String[] dealershipInfo = dealershipInfoText.split("\\|");
                dealership = new Dealership(dealershipInfo[0],dealershipInfo[1],dealershipInfo[2]);

            }else{
                bufferedReader.close();
                return;
            }

            String vehiclesInfoString = bufferedReader.readLine();
            if (vehiclesInfoString != null){
                String[] vehiclesInfo =vehiclesInfoString.split("\\|");
                        vehicle = new Vehicle(Integer.parseInt(vehiclesInfo[0]),Integer.
                                parseInt(vehiclesInfo[1]),vehiclesInfo[2],vehiclesInfo[3],
                                vehiclesInfo[4],vehiclesInfo[5],Integer.parseInt(vehiclesInfo[6]),
                                new BigDecimal(vehiclesInfo[7]));

                dealership.addVehicle(vehicle);
            }else{
                bufferedReader.close();
                return;
            }



            while(vehiclesInfoString != null){
                vehiclesInfoString = bufferedReader.readLine();
                if (vehiclesInfoString != null){
                    String[] vehiclesInfo =vehiclesInfoString.split("\\|");
                    vehicle = new Vehicle(Integer.parseInt(vehiclesInfo[0]),Integer.
                            parseInt(vehiclesInfo[1]),vehiclesInfo[2],vehiclesInfo[3],
                            vehiclesInfo[4],vehiclesInfo[5],Integer.parseInt(vehiclesInfo[6]),
                            new BigDecimal(vehiclesInfo[7]));

                    dealership.addVehicle(vehicle);
                }else{
                    bufferedReader.close();
                    break;
                }

            }
        }catch (Exception e){
            System.out.println("Please check the dealershipsFilePath" + e);
        }


    }

    public void saveDealership(){

    }




}