import java.util.Scanner;

public class Sumofdigit {
    public static void main (String[]args){
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter five digit number");
     int rem;
     int sum=0;
     int number = scanner.nextInt();

     while(number>0)
     {rem = number % 10;
         sum = sum + rem;
         number = number / 10;
     }
     System.out.println("Sum of the digits " + sum );

    }
}
