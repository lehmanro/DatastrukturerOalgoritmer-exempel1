import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static final double GAME_VERSION = 1.0;
    public static void main(String[] args) {

    Random random = new Random();

        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);




        //String stuff = strInput.nextLine();

        while (true) {
            try {
                System.out.println("Skriv Enter för att fortsätta q för att avsluta");

                System.out.println("Slumptal: " + random.nextInt(1,100));
                //String stuff = strInput.nextLine();



                if (strInput.nextLine().equals("q")) {
                    //String stuff2 = strInput.nextLine();
                    System.out.println("Hejdå! ");
                    System.exit(0);

                }

            }
            catch (NumberFormatException e) {
                System.out.println("Skriv tal");

            }
        }



    }
}