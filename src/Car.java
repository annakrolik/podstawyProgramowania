public class Car {
    public String model;
    public String color;
    public String makeYear;
    public String fuelType;
    public int engineCapacity;
    public double tirePressure;
    public int doorNumber;


    public Car(){

    }
    public Car(String manufacturer, String model, String color, String makeYear, String fuelType){
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

    public void startEngine(){
        System.out.println("The engine of " + this.model + " has started");
    }

    public void stopEngine(String percent){
        System.out.println("The engine has slowed down by " + percent+"%");
    }

    public void calculateMaximumSpeed(){
        System.out.println((this.engineCapacity*this.doorNumber)/this.tirePressure);
    }

}
