import java.sql.SQLOutput;

public class Car {
    public String model;
    public String color;
    public String makeYear;
    public String fuelType;


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

    public void startEngine(){
        System.out.println("The engine of " + this.model + " has started");
    }

    public void stopEngine(String percent){
        System.out.println("The engine has slowed down by");
    }
}
