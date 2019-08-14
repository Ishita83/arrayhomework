import java.sql.SQLOutput;

public class TransposedMatrix {
    public static void main(String[] args) {
        //declaring and initializing 2D array
        int arr[][]={{1,2,3,4},{2,4,5,6},{4,4,5,6},{4,5,6,7}};

//printing 2D array
        System.out.println("Original Matrix");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
          System.out.println();

        }
        int t[][] = new int [arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++)
                 t[i][j]= arr[j][i];
        }
        System.out.println("Transposed Matrix");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}