import java.util.Arrays;
import java.util.ArrayList;

public class XOR_Cipher {
    private ArrayList<String> message = new ArrayList<String>();
    private ArrayList<Integer> asciiList = new ArrayList<Integer>();
    private ArrayList<String> binaryList = new ArrayList<String>();
    private ArrayList<String> key = new ArrayList<String>();

    public void assign(String str){
        //Split string w/ no space in between
        String[] split = str.split("");
        Arrays.asList(split);
        //Assign message correct values
        for (String s : split){
            message.add(s);
        }
        //Fill asciiList and binaryList with placeholders
        for (int i = 0; i < message.size(); i++){
            asciiList.add(0);
            binaryList.add("00000000");
        }
    }

    public void StringToBit(){
        //Convert to ASCII Values first
        for (int i = 0; i < message.size(); i++){
            //Convert string to char
            char ch = message.get(i).charAt(0);
            //Convert char to ASCII value (Java internal)
            int ascii = ch;
            asciiList.set(i, ascii);
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
            binaryList.set(i, binaryValue);
        }
        System.out.println(binaryList);
    }

    public void BitToString(){
        //Converts Binary to ASCII values
        for (int i = 0; i < binaryList.size(); i++){
            int value = 0;
            if (binaryList.get(i).substring(0, 1).equals("1")){
                value += 128;
            }
            if (binaryList.get(i).substring(1, 2).equals("1")){
                value += 64;
            }
            if (binaryList.get(i).substring(2, 3).equals("1")){
                value += 32;
            }
            if (binaryList.get(i).substring(3, 4).equals("1")){
                value += 16;
            }
            if (binaryList.get(i).substring(4, 5).equals("1")){
                value += 8;
            }
            if (binaryList.get(i).substring(5, 6).equals("1")){
                value += 4;
            }
            if (binaryList.get(i).substring(6, 7).equals("1")){
                value += 2;
            }
            if (binaryList.get(i).substring(7, 8).equals("1")){
                value += 1;
            }
            asciiList.set(i, value);
        }
        //Converts ASCII values to String
        for (int i = 0; i < asciiList.size(); i++) {
            int value = asciiList.get(i);
            char asciiCode = (char) value;
            String str = "" + asciiCode;
            message.set(i, str);
        }
    }

    public void randomKey() {
        for (int i = 0; i < message.size(); i++){
            String value = "";
            for (int j = 0; j < 8; j++) {
                //Random generates to be a 1 or a 0
                int randomNum = (int) (Math.random() * 2);
                String digit = "" + randomNum;
                value += digit;
            }
            key.add(value);
        }
        System.out.println(key);
    }

    public void compareToKey(){
        //For loop to traverse each element of the ArrayList
        for (int i = 0; i < binaryList.size(); i++){
            String str = "";
            //For loop to traverse each letter in an element
            for (int j = 0; j < 8; j++){
                String letter = binaryList.get(i).substring(j,j+1);
                String value = key.get(i).substring(j,j+1);
                if (letter.equals(value)){
                    str += "0";
                }
                else{
                    str += "1";
                }
            }
            binaryList.set(i, str);
        }
        System.out.println(binaryList);
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
