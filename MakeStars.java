import java.util.*;
public class MakeStars{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    String theline = "";
    while(n.hasNextLine()){
      theline = n.nextLine();
      Scanner p = new Scanner(theline);
      while(p.hasNext()){
        String word = p.next();
        for(int i = 0; i < word.length(); i++){
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println();
     }

  }
}
