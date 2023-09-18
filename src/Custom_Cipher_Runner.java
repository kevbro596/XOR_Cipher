import java.util.Scanner;

public class Custom_Cipher_Runner {
    public static void main(String args[] )
    {
        Custom_Cipher test = new Custom_Cipher();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Desired Message:: ");
        String str = scanner.nextLine();

        test.assignMessage(str);
        test.changeLetters();
        test.changeOthers();
    }
}
