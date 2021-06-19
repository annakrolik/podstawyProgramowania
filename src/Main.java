import java.util.ArrayList;

public class Main {
    public static void main (String args[]){

    Car Opel = new Car(2, 3.2, 5 );
    Car Renault = new Car("Megane", "blue", 2000, "petrol");
    Car Toyota = new Car ("Rav4", "white", 2010, "diesel");
    Car Honda = new Car ("Civic", "grey", 2004, "petrol");

        ArrayList<Car> carsTable = new ArrayList<>();
        carsTable.add(Toyota);
        carsTable.add(Honda);
        carsTable.add(Renault);
        carsTable.add(Opel);

        carsTable.remove(0);


//    Opel.calculateMaximumSpeed();
//
//    Renault.checkiffrom2000();
//
//    Motorcycle Kawasaki = new Motorcycle(8000, "Ninja", 0.3,2015, 'M');
//    Kawasaki.getPrice();
//    Kawasaki.setPrice(12000);
//    Kawasaki.getPrice();
//
//    Kawasaki.printMotorcycleInformation();
//    Kawasaki.checkIfBMW();
//
//    Kawasaki.setModel("BMW");
//
//    Kawasaki.checkIfBMW();
//
//    Kawasaki.checkIfMotorcycleIsInTheRange();

//    Kawasaki.changeCurrencyToUSD(4.5);
//    Kawasaki.getPrice();



    }
}
