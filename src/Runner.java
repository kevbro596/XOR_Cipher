import java.util.Scanner;

public class Runner {

    public static void main (String args[]){
        Drews_Class test = new Drews_Class();
        //System.in allows you to read input from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter desired message:: ");
        String str = scanner.nextLine();
        test.assignMessage(str);


        test.StringToBit();
        test.randomKey();
        test.compareToKey();
        test.BitToString();
    }
}
