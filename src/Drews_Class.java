public class Drews_Class {
    private ArrayList<String> message;

    public static void main (String args[]){
    }

    public void assignMessage(String str){
        for(int i = 0; i < str.length(); i++){
            message.add(str.substring(i, i+1));
        }
    }
}
