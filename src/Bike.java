public class Bike extends Vehicle{

    private double price;

    public Bike(String name) {
        super(name, "Pedaled");

    }
    public  Bike(String name, double price){
        super(name, "Pedaled");
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public void soundWarning() {
        System.out.println("Pling-pling");
    }
}
