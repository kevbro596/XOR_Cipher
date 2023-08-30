import java.util.Arrays;
import java.util.ArrayList;

public class Drews_Class {
    private ArrayList<String> message = new ArrayList<String>();

    public void assignMessage(String str){
        //Split string w/ no space in between
        String[] split = str.split("");
        Arrays.asList(split);
        for (String s : split){
            message.add(s);
        }
    }

    public void StringToBit(){
        //Convert to ASCII Values first
        ArrayList<Integer> asciiList = new ArrayList<Integer>();
        for (String s : message){
            //Convert string to char
            char ch = s.charAt(0);
            //Convert char to ASCII value (Java internal)
            int ascii = ch;
            asciiList.add(ascii);
        }
        //Then convert to 8-Bit Binary
        ArrayList<String> binaryList = new ArrayList<String>();
        for (int i = 0; i < asciiList.size(); i++){
            int asciiValue = asciiList.get(i);
            String binaryValue = "";
            //Converts ASCII value to Binary
            while (asciiValue != 0){
                binaryValue = (asciiValue % 2) + binaryValue;
                asciiValue /= 2;
            }
            //Verifies Binary is 8 Digits
            while (binaryValue.length() < 8){
                binaryValue = "0" + binaryValue;
            }
            binaryList.add(binaryValue);
        }
    }

    public void BitToString(){

    }

    public String toString(){
        String output = "";
        //Populates output with messages' values
        for (String s : message){
            output += s;
        }
        return output;
    }
}
