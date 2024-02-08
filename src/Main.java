import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] testCharacters = {"a","b","c","d","e","f"};
        StringArray test = new StringArray(testCharacters);

        System.out.println("test size: " + test.size());
        //System.out.println(test.toString());
        System.out.println(test);
        test.add("g");
        System.out.println(test);
        test.add(5, "h");
        System.out.println(test);
        test.reverse();
        System.out.println(test);


        new BigO();

    }
}