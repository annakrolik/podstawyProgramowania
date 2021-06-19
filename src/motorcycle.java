public class motorcycle {
    private int price;
    private String model;
    private double capacity;
    private int productionYear;
    private char size;

    public motorcycle(int price, String model, double capacity, int productionYear, char size){
        this.price = price;
        this.model = model;
        this.capacity = capacity;
        this.productionYear = productionYear;
        this.size = size;
    }
    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    public void printMotorcycleInformation(){
        System.out.println("Price of the motorcycle is "+this.price);
        System.out.println("Model of the motorcycle is "+this.model);
        System.out.println("Capacity of this motorcycle is "+this.capacity);
        System.out.println("This motorcycle's year of production is "+this.productionYear);
        System.out.println("Size of the motorcycle is "+this.size);
    }
}
