import java.util.Scanner;

public class FindIndex {
 public static void main(String[]args){
  Scanner scanner = new Scanner(System.in);
   int[]a ={10,20,30,40,50};
   System.out.println("Enter the Number");
  int b = scanner.nextInt();
   int i;

  for(i=0; i<a.length; i++){
   if(b==a[i]){
    System.out.println("Index is " +  i);
    }
 }
 }
}
