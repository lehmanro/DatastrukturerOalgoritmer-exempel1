import java.util.HashMap;

public class Main {
    static final double GAME_VERSION = 1.0;
    public static void main(String[] args) {



        // Instansiering av objekt


        //Funkar ej med abstract: Clothing hat = new Clothing();


        // default-konstruktor
        Foo foo = new Foo();

        Bike bike = new Bike("Nishiki", 500);

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(bike);
        bikeShop.addBike(new Bike("Kona", 600));
        bikeShop.addBike(new Bike("Jopo", 400));

        for (int i = 0; i < bikeShop.getBikes().size(); i++) {

            System.out.printf("%d %s %.2f\n",
                    i,
                    bikeShop.getBikes().get(i).getName(),
                    bikeShop.getBikes().get(i).getPrice());


        }




        Shirt shirt = new Shirt("Gant");
        shirt.setPrice(100);
        shirt.getCondition();
        System.out.println(shirt.getCondition());
        System.out.println(shirt.getBrand() + " Skjortan kostar " + shirt.getPrice());

        Shirt shirt2 = new Shirt("Dressman", 30);
        System.out.println(shirt2.getBrand() + " Skjortan kostar " + shirt2.getPrice());

        Shirt shirt3 = new Shirt();
        System.out.println(shirt3.getBrand() + " Skjortan kostar " + shirt3.getPrice());


        Car car = new Car("Tesla");
        System.out.println(String.format("Brand: %s, it is  %s and it cocts %.2f",
                car.getName(),
                car.getType(),
                car.getPrice()));


        Car car2 = new Car("Fiat");

        HashMap<String,Car> drivers = new HashMap<>();
        drivers.put("Kalle", car2);
        drivers.put("Lisa", car);

        // put skriver också updatering.
        drivers.put("Lisa", new Car("Toyota"));

        System.out.printf("Kalle drives a %s and \nLisa drives a %s \n",
                drivers.get("Kalle").getName(),
                drivers.get("Lisa").getName()
                );

        System.out.printf("Brand: %s, it is  %s and it costs %.2f\n",
                car2.getName(),
                car2.getType(),
                car2.getPrice());

        car.refuel();





        Vehicle todaysRide = new Car("VW");

        System.out.println(todaysRide.getName());
        todaysRide = new Bike("Jopo");
        System.out.println(todaysRide.getName());

        // Obs objekt namn är referensser till samma objekt
        Vehicle tomorrowsRide = todaysRide; // Gotcha! Inte en kopia!
        tomorrowsRide.setName("tomorrow");
        System.out.println(tomorrowsRide.getName());
        System.out.println(todaysRide.getName());
        // Samma objektreferens!

        todaysRide.getPrice();


        // Skriv ut namnet via getter-metoden
        System.out.println(car.getName() + " (" + car.getType() + ")");
        car.soundWarning();
        System.out.println(car.getName() + " Kostar:" + car.price + "€ (FEL!)");
        System.out.println(car.getName() + " Kostar:" + car.getPrice() + "€ (Rätt!)");

        System.out.println(bike.getName() + " (" + bike.getType() + ")");
        bike.soundWarning();

        System.out.println("total cars created: " + car.getcarsCreated());




    }
}