public class Car extends Vehicle {




    private double discount = 0.9;
    public double price = 1000;
    private int fuel = 0;

    //Klassvariable, samma värde för ala klasser
    static int carsCreated = 0;

    public Car(String name) {

        super(name , "Motorized");
        carsCreated++;

        System.out.println("cars created: " + carsCreated);

    }

    public static int getcarsCreated() {
        return carsCreated;
    }

    @Override
    public void soundWarning() {
        System.out.println("Tut-tut");
    }

    @Override
    public double getPrice() {
        return price * discount;
    }

    public void refuel() {
        this.fuel = 100;
    }

    public void setPrice(double price) {
        //if (price < 0) throw  Error;
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


}

