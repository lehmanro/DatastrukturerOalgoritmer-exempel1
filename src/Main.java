public class Main {
    public static void main(String[] args) {


        Shirt armani = new Shirt("Armani", "black", 59.50);
        Shirt superdry = new Shirt("Superdry", "blue", 49.90);
        Shirt nike = new Shirt("Nike", "white", 29.90);
        Shirt adidas = new Shirt("Adidas", "purple", 29.90);
        Shirt tigerofsweden = new Shirt("Tiger of Sweden", "gray", 129.90);

        Shoes converse = new Shoes("Converse", 45, 100.00);
        Shoes puma = new Shoes("Puma", 44, 110.00);
        Shoes reebok = new Shoes("Reebok", 43, 120.00);
        Shoes vans = new Shoes("Vans", 46, 130.00);
        Shoes sketchers = new Shoes("Sketchers", 42, 140.00);


        adidas.setColor("yellow");
        tigerofsweden.setPrice(135.50);
        reebok.setSize(38);
        System.out.println("Shirts: \n");
        System.out.println(armani.getBrand() + " " + armani.getColor() + " " + armani.getPrice() + " €");
        System.out.println(superdry.getBrand() + " " + superdry.getColor() + " " + superdry.getPrice() + " €");
        System.out.println(nike.getBrand() + " " + nike.getColor() + " " + nike.getPrice() + " €");
        System.out.println(tigerofsweden.getBrand() + " " + tigerofsweden.getColor() + " " + tigerofsweden.getPrice() + " €");
        System.out.println(adidas.getBrand() + " " + adidas.getColor() + " " + adidas.getPrice() + " €");

        System.out.println("Shoes: \n");
        System.out.println(converse.getBrand() + " " + converse.getSize() + " " + converse.getPrice() + " €");
        System.out.println(puma.getBrand() + " " + puma.getSize() + " " + puma.getPrice() + " €");
        System.out.println(reebok.getBrand() + " " + reebok.getSize() + " " + reebok.getPrice() + " €");
        System.out.println(vans.getBrand() + " " + vans.getSize() + " " + vans.getPrice() + " €");
        System.out.println(sketchers.getBrand() + " " + sketchers.getSize() + " " + sketchers.getPrice() + " €");



    }
}