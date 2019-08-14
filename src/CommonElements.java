public class CommonElements {
    public static void main(String[]args){
        String arr1[]={"London,scotland,spain,greece,italy"};
        String arr2[]={"mumbai,goa,delhi,greece,italy"};
        System.out.println("Common String elements are");
        for(int i=0;i<arr1.length;i++){
           for(int j=0;j<arr2.length;j++){

               if (arr1[i]==arr2[j]){
                   System.out.println(arr1[i]);
               }
           }

        }

    }
}
