import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person pejk = new Person("pejk");
        Person leif = new Person("leif", pejk);
        Person seppo = new Person("seppo", leif);

        Person current = leif;
        //Person last = seppo;

        /*do {
            System.out.println(current.getName());
            current = current.next;
        }
        while (current != null);*/

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