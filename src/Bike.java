public class Bike extends Vehicle{


    public Bike(String name) {
        super(name, "Pedaled");

    }
    @Override
    public void soundWarning() {
        System.out.println("Pling-pling");
    }
}
