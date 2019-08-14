import java.util.Scanner;

public class TotalString {
   public static void main(String []args){

       Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Name");
    String name = scanner.nextLine();
    char c ='a';
    System.out.println("Total number of 'a' in Name");
    int a =0;
    for(int i=0;i<name.length();i++)
    { if(c==name.charAt(i))
       a++;
    }
       System.out.println(a);
   }


}
