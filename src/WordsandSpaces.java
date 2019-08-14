import java.util.Scanner;

public class WordsandSpaces {
    public static void main(String[]args){
  Scanner scanner = new Scanner(System.in);
  int word = 1;

  System.out.println("Write a sentence");
  String name =scanner.nextLine();

  for(int i=0;i<name.length();++i){
      if (name.charAt(i)==' '){
          word++;
      }
  }
  System.out.println("Number of words = "+ word);
  System.out.println("Number of spaces = "+(word-1));
    }
}
