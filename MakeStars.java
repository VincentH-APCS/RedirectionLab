import java.util.*;
public class MakeStars{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while(n.hasNextLine()){
      String line = n.nextLine();
      Scanner p = new Scanner(line);
      while(p.hasNext()){
        System.out.print("*");
      }
      System.out.println();
     }

  }
}
