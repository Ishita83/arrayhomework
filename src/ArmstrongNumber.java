import java.util.Scanner;

public class ArmstrongNumber {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int number = 407;
                int check =0 ;int rem =0;
                int sum =0;
        System.out.println("Enter the number");
       number =scanner.nextInt();
       check = number;
       while(check!=0){
           rem = check%10;
           sum = sum +( rem*rem*rem);
           check =check/10;}
           if(sum==number)
               System.out.println("Given number is an armstrong number");
               else
                   System.out.println("Given number is not armstrong number");

           }






    }

