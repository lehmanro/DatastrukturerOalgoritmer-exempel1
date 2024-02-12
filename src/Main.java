import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person pejk = new Person("pejk");
        Person leif = new Person("leif");
        Person seppo = new Person("seppo");
        String[] testCharacters = {"a","b","c","d","e","f","p"};
        StringArray test = new StringArray(testCharacters);

        Graphy graphy = new Graphy();
        graphy.createNode("skj", "Skjorta");
        graphy.createNode("jea", "Jeans");
        graphy.createNode("sli", "Slips");
        graphy.createNode("cro", "Crocs");
        graphy.printGraph();

        Queuey queuey = new Queuey();
        queuey.enqueue(testCharacters[0]);
        queuey.enqueue(testCharacters[1]);
        queuey.enqueue(testCharacters[2]);
        queuey.enqueue(testCharacters[3]);
        queuey.dequeue();
        queuey.dequeue();

        Stacky stacky = new Stacky(5);
        stacky.push(testCharacters[0]);
        stacky.push(testCharacters[5]);
        stacky.push(testCharacters[6]);
        //stacky.push("foo");
        //stacky.push("bar");
        //stacky.push("boo");
        System.out.println("Stacky: " + stacky);
        System.out.println("pop: " + stacky.pop());
        System.out.println("Stacky " + stacky);

        Person current = leif;
        //Person last = seppo;

        Linky linky = new Linky();
        linky.add(pejk);
        linky.add(leif);
        linky.printLinky();

        System.out.printf("linky.size(): %d\n", linky.size());

        /*do {
            System.out.println(current.getName());
            current = current.next;
        }
        while (current != null);*/

        //String[] testCharacters = {"a","b","c","d","e","f"};
        //StringArray test = new StringArray(testCharacters);

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