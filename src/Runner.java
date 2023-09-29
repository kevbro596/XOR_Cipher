import java.util.Scanner;

public class Runner{
    public static void main (String args[] ){
        XOR_Cipher test = new XOR_Cipher();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Desired Message:: ");
        String str = scanner.nextLine();

        test.assign(str);
        test.randomKey();
        System.out.println();

        test.StringToBit();
        test.compareToKey();
        test.BitToString();
        System.out.println("Encrypted Message:" + test);
        test.StringToBit();
        test.compareToKey();
        test.BitToString();
        System.out.println("Decrypted Message:" + test);
    }
}