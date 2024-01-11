public class Main {
    public static void main(String[] args) {

        // Instansiering av objekt


        //Funkar ej med abstract: Clothing hat = new Clothing();

        Clothing shirt = new Shirt("Gant");
        shirt.setPrice(100);
        System.out.println(shirt.getBrand() + " Skjortan kostar " + shirt.getPrice());

        Shirt shirt2 = new Shirt("Dressman", 30);
        System.out.println(shirt2.getBrand() + " Skjortan kostar " + shirt2.getPrice());

        Shirt shirt3 = new Shirt();
        System.out.println(shirt3.getBrand() + " Skjortan kostar " + shirt3.getPrice());


        Car car = new Car("Tesla");

        car.refuel();

        Bike bike = new Bike("Nishiki");



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




    }
}