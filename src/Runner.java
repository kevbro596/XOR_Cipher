import java.util.Scanner;

public class Runner {

    public static void main(String args[]) {
        Drews_Class test = new Drews_Class();
        //System.in allows you to read input from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Desired Message:: ");
        String str = scanner.nextLine();
        test.assign(str);
        test.randomKey();

        //Encryption Process
        test.StringToBit();
        test.compareToKey();
        test.BitToString();
        System.out.println("Encrypted Message: " + test.toString());

        //Decryption Process
        test.StringToBit();
        test.compareToKey();
        test.BitToString();
        System.out.println("Decrypted Message: " + test.toString());
    }
}