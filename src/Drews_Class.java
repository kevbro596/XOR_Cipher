import java.util.Arrays;
import java.util.ArrayList;

public class Drews_Class {
    private ArrayList<String> message = new ArrayList<String>();
    private ArrayList<Integer> asciiList = new ArrayList<Integer>();
    private ArrayList<String> originalBinaryList = new ArrayList<String>();
    private String key = "";
    private ArrayList<String> newBinaryList = new ArrayList<String>();

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
            originalBinaryList.add(binaryValue);
        }
        System.out.println(originalBinaryList);
    }

    public void BitToString(){

    }

    public void randomKey() {
        for(int i = 0; i < 8; i++) {
            //Random generates to be a 1 or a 0
            int random = (int)(Math.random() * 2);
            key += random;
        }
        System.out.println(key);
    }

    public void compareToKey(){
        //For loop to traverse each element of the ArrayList
        for (int i = 0; i < originalBinaryList.size(); i++){
            String str = "";
            //For loop to traverse each letter in an element
            for (int j = 0; j < 8; j++){
                String letter = originalBinaryList.get(i).substring(j,j+1);
                if (letter.equals(key.substring(j,j+1))){
                    str += "0";
                }
                else{
                    str += "1";
                }
            }
            newBinaryList.add(str);
        }
        System.out.println(newBinaryList);
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
