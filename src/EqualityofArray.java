import java.util.Arrays;

public class EqualityofArray {
    public static boolean equals(int []array1 ,int[]array2){

      if (array1.length!=array2.length)
      return false;
      for (int i=0;i<array1.length;i++)
      {if (array1[i] !=array2[i])
                               return false;}

      return true;
    }

    public static void main(String args[]){

        int[] array1 = {3,6,9,12,15};

        int [] array2 ={3,6,9,12,15};

        if (equals(array1,array2)){System.out.println("Same Arrays");}
        else{System.out.println("Different Arrays");}
    }

    }

