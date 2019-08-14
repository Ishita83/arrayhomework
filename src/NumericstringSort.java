import java.util.Arrays;

public class NumericstringSort {
    public static void main(String args[]) {
        String [] c = {"rajkot", "london", "mumbai", "agra", "baroda"};
        System.out.println("Original order of city" + Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("After sorting the cities" + Arrays.toString(c));

        System.out.println();

        int [] d = {5,78,89,25,16};
        System.out.println("Original order of number" + Arrays.toString(d));
        Arrays.sort(d);
        System.out.println("After sorting the number" + Arrays.toString(d));


}}







