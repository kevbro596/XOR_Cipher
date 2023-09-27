import java.util.ArrayList;
import java.util.Arrays;

public class Custom_Cipher
{
    private String[] firstHalf = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m"};
    private String[] secondHalf = new String[]{"z","y","x","w","v","u","t","s","r","q","p","o","n"};
    private ArrayList<String> ASCII = new ArrayList<>();
    private ArrayList<String> message = new ArrayList<>();

    public void assignMessage(String str)
    {
        //Split string w/ no space in between
        String[] split = str.split("");
        //Assign message correct values
        for (String s : split){
            message.add(s);
            //Adds 0 as placeholder
            ASCII.add("0");
        }
    }

    public void changeLetters(){
        for (int i = 0; i < message.size(); i++){
            for (int j = 0; j < 13; j++){
                //Checks if letter is in first half of alphabet
                if (message.get(i).compareToIgnoreCase(firstHalf[j]) == 0){
                    message.set(i, secondHalf[j]);
                    break;
                }
                //Checks if letter is in second half of alphabet
                if (message.get(i).compareToIgnoreCase(secondHalf[j]) == 0){
                    message.set(i, firstHalf[j]);
                    break;
                }
            }
        }
        System.out.println(message);
    }

    public void changeOthers()
    {
        //Converting correct values to ASCII
        for(int i = 0; i < ASCII.size(); i++)
        {
            int j = 0;
            boolean tF = true;
            while (j < 13){
                //Checking if the index is in the alphabet
                if ((message.get(i).compareToIgnoreCase(firstHalf[j]) == 0) || (message.get(i).compareToIgnoreCase(secondHalf[j]) == 0)){
                    tF = false;
                }
                j++;
            }
            if (tF) {
                char ch = message.get(i).charAt(0);
                //Convert char to ASCII value (Java internal)
                int ascii = ch;
                String str = "" + ascii;
                ASCII.set(i, str);
            }
        }

        System.out.println(ASCII);
        //Reversing ASCII values
        for (int i = 0; i < ASCII.size(); i++){
            if (ASCII.get(i).equals("0")) {
                continue;
            }
            else{
                String normal = ASCII.get(i);
                String reversed = "";
                int count = normal.length();
                while (count > 0){
                    String str = normal.substring(count - 1);
                    reversed += str;
                    normal = normal.substring(0, count - 1);
                    count--;
                }
                ASCII.set(i, reversed);
            }
        }
        System.out.println(ASCII);
        //Converting to encrypted ASCII code
        for (int i = 0; i < ASCII.size(); i++){
            if (ASCII.get(i).equals("0")) {
                continue;
            }
            else{
                int value = Integer.valueOf(ASCII.get(i));
                char asciiCode = (char) value;
                String str = "" + asciiCode;
                message.set(i, str);
            }
        }
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