import java.util.Scanner;

public class ReverseArray {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of Elements");
        int ele =scanner.nextInt();
        int a[]=new int[ele];
        System.out.println("Enter the elements in the array");
        for(int i =0;i<a.length;i++){
            a[i]=scanner.nextInt();}
        System.out.println("This is the Reverse Elements");
        for(int j =a.length-1;j>=0;j--){
            System.out.println((a[j]));
        }

    }

}
