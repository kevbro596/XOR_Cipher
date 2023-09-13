import java.util.Scanner;

public class Custom_Cipher_Runner {
    public static void main(String args[] )
    {
        Custom_Cipher kevin = new Custom_Cipher();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Desired Message:: ");
        String str = scanner.nextLine();

        System.out.print("Enter Exponent Value:: ");
        int value = scanner.nextInt();
    }
}
