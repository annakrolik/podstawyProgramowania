public class Main {
    public static void main (String args[]) {
        System.out.println("Hello World");
        System.out.println("Cześć Anna");


        Car Opel = new Car();
        Car Renault = new Car("Megane", "blue","petrol");

        Renault.startEngine();
        Renault.stopEngine("50");
    }
}
