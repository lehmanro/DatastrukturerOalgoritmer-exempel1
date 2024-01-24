import java.util.Random;

public class Utils {

    static boolean isInteger(String val){
        return val.matches("-?\\d+");
    }
    static double getRandomPrice(){
        Random rnd = new Random();
        return rnd.nextDouble(100, 1000);
    }

}
