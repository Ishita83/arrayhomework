import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}
