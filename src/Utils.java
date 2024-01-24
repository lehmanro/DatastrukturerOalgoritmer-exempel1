import java.util.Random;
import java.util.Scanner;

public class Utils {

    static boolean isInteger(String val){
        return val.matches("-?\\d+");
    }
    static double getRandomPrice(){
        Random rnd = new Random();
        return rnd.nextDouble(100, 1000);
    }
    static int getUserInput(){

        Scanner strInput = new Scanner(System.in);
        while (true) {
            try {

                System.out.printf("Skriv in ett tal\n");
                String userInput = strInput.nextLine();
                return Integer.parseInt(userInput);

            }
            catch (Exception e) {
                System.out.println("Du måste ge ett tal");

            }


        }





    }

}
