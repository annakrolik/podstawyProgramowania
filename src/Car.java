import java.util.ArrayList;


public class Car {
    public String model;
    public String color;
    public int makeYear;
    public String fuelType;
    public int engineCapacity;
    public double tirePressure;
    public int doorNumber;


    public Car(){

    }
    public Car(String model, String color, int makeYear, String fuelType){
        this.model = model;
        this.makeYear = makeYear;
        this.fuelType = fuelType;
        this.color =  color;

    }
    public Car(String model, String color, String fuelType) {
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
    }

    public Car(int engineCapacity, double tirePressure, int doorNumber){
        this.engineCapacity = engineCapacity;
        this.tirePressure = tirePressure;
        this.doorNumber = doorNumber;

    }
    public void checkIfListIsEmpty(ArrayList<Car> tableParam){
        System.out.println(tableParam.isEmpty());


    }

    public void startEngine(){
        System.out.println("The engine of " + this.model + " has started");
    }

    public void stopEngine(String percent){
        System.out.println("The engine has slowed down by " + percent+"%");
    }

    public void calculateMaximumSpeed(){
        System.out.println((this.engineCapacity*this.doorNumber)/this.tirePressure);
    }

    public void checkiffrom2000(){
        if (this.makeYear > 2000){
            System.out.println("kupuje");
        }
        else {
            System.out.println("Nie kupuje");
        }
    }

}
