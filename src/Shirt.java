

public class Shirt extends Clothing {

    // Överlagring (overload)
    public Shirt(String brand, double price) {

        super.brand = brand;
        super.price = price;

    }

    public Shirt(String brand) {

        super.brand = brand;

    }
    public Shirt(double price){
        super.price = price;
    }
    public Shirt() {

        super.brand = "no.name";

    }

    @Override
    void mend() {
        System.out.println("shirt is mended!");
    }
}
