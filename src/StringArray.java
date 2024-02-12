import java.util.Arrays;

public class StringArray {

    String[] values;


    public StringArray(String[] values) {

        this.values = values;


    }


    public void add(String value) {

        //Skapa ny array
        String[] newValues = new String[values.length + 1];
        //newValues[values.length] = value;

        //values = newValues;
        int i = 0;
        //Kopiera över innehållet
        for (i = 0; i < values.length; i++) {

            newValues[i] = values[i];

        }
        //lägg till värdet på slutet
        newValues[values.length] = value;
        values = newValues;

    }
    public void  add(int index, String value){
        add(null);//lägg till null på slutet av values

        for (int i = values.length -1;i > index; i--) {

            values[i] = values[i-1];

        }
        values[index] = value;
    }
    public String toString() {
        return Arrays.toString(values);
    }

    public  int size() {
        return values.length;
    }


    public void reverse() {
        String[] reverseArray = new String[values.length];
        int newI = values.length-1;
        for (int i = 0; i < values.length; i++) {

            reverseArray[i] = values[newI];
            newI--;


        }
        values = reverseArray;

    }

}