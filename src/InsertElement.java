import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {5, 10, 15, 20, 25};
        System.out.println("Enter the Element");
        int ele = scanner.nextInt();

        System.out.println("Enter your desire position between 1 and " + a.length);
        int pos = scanner.nextInt();
        for (int i = a.length - 1; i > pos - 1; i--) {
               a[i]=a[i-1];
        }
        a[pos-1]=ele;
        System.out.println(Arrays.toString(a));

    }
}
