public class Main {
    public static void main (String args[]){

    Car Opel = new Car(2, 3.2, 5 );
    Car Renault = new Car("Megane", "blue", 2000, "petrol");

    Opel.calculateMaximumSpeed();

    Renault.checkiffrom2000();

    motorcycle Kawasaki = new motorcycle(8000, "Ninja", 0.3,2015, 'M');
    Kawasaki.getPrice();
    Kawasaki.setPrice(12000);
    Kawasaki.getPrice();

    Kawasaki.printMotorcycleInformation();

    }
}
