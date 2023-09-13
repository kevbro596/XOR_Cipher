import java.util.ArrayList;

public class Custom_Cipher
{
    private ArrayList<String> message = new ArrayList<>();
    private int value = 0;
    private ArrayList<Integer> ASCII = new ArrayList<>();

    public void setValues(String str, int i){
        String[] split = str.split("");
        for (String s : split){
            message.add(s);
            //Also populates ASCII to prevent future issues
            ASCII.add(0);
        }
        value = i;
    }

    public void stringToAscii(){
        for (int i = 0; i < ASCII.size(); i++){
            char c = message.get(i).charAt(0);
            int ascii = c;
            ASCII.set(i, ascii);
        }
    }

    public void asciiToString(){
        for (int i = 0; i < ASCII.size(); i++){
            int val = ASCII.get(i);
            char asciiCode = (char) val;
            String s = "" + asciiCode;
            message.set(i, s);
        }
    }

    public void exponent(){
        for (int i = 0; i < ASCII.size(); i++){
            ASCII.set(i, ((int)Math.pow(ASCII.get(i), value)));
        }
        System.out.println(ASCII);
    }

    public void root(){

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
