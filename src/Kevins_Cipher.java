import java.util.Arrays;
import java.util.ArrayList;

public class Kevins_Cipher {
    private ArrayList<String> message = new ArrayList<String>();
    private ArrayList<Integer> asciiList = new ArrayList<Integer>();
    private ArrayList<String> binaryList = new ArrayList<String>();

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
        for (String s : message){
            //Convert string to char
            char ch = s.charAt(0);
            //Convert char to ASCII value (Java internal)
            int ascii = ch;
            asciiList.add(ascii);
        }
        System.out.println(asciiList);
        //Then convert to 8-Bit Binary
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
        System.out.println(binaryList);
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