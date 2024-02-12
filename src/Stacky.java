import java.util.Arrays;

public class Stacky {

    int topOfStack = -1;
    String[] data;
    int stackSize;

    public Stacky(int stackSize) {
        this.stackSize = stackSize;
        data = new String[stackSize];
    }

    public void push(String value) {
        if (topOfStack+1 >= stackSize){
            //throw  new StackOverflowError("Stacken är full ");
            System.out.println("Stacken är full ");
            return;
        }
        topOfStack++;
        data[topOfStack] = value;
    }
    public String pop() {
        String ret = data[topOfStack];
        topOfStack--;
        return ret;
    }

    @Override
    public String toString() {

        String ret = "";

        for (int i = 0; i < topOfStack; i++) {
            ret += data[i] + " ";

        }
        return ret;
    }
}
