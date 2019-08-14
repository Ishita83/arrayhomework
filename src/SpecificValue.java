import java.util.Scanner;

public class SpecificValue {
    public static void main(String args[]) {
   int[]a ={96,45,24,29,32,56};
   System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
   int b = scanner.nextInt();

   for(int i=0; i<a.length; i++)
        {
            if (b==a[i])
            {System.out.println("Array contains specific value");}

        }}}




