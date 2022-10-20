package be.intecbrussel.classwerk10;

public class Vehicle {

    private String typeOfVehicle = "car";

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void honk() {
        System.out.println("Tuut tuut!");
    }


}
