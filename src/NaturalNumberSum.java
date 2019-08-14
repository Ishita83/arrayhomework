import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[]args){
        System.out.println("Enter the Value: " );
        Scanner value=new Scanner(System.in);
        int num=value.nextInt();
        System.out.println("Natural numbers are : " +num);
        int sum=0;
        for(int i=1;i<=num;i++){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("sum of numbers : "+ sum);


}}



