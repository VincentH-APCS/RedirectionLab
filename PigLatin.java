import java.util.*;
public class PigLatin{
  public static String pigLatinSimple(String s){
    String output = s.toLowerCase();
    String first = output.substring(0,1);
    if(first.equals("a") || first.equals("e") || first.equals("i") ||
    first.equals("o") || first.equals("u")) {
      output = output + "hay";
    }
    else {
      output = output.substring(1, output.length()) + first + "ay";
    }
    s = output;
    return output;
    }

    public static String pigLatin(String s){
      String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr",
       "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl",
       "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
       String output = s.toLowerCase();
       if(s.length() == 1){
         return pigLatinSimple(s);
       }
       String first2 = output.substring(0,2);
       int valid = 0;
       for(int i = 0; i < digraphs.length; i++){
         if(digraphs[i].equals(first2)){
           valid = valid + 1;
         }
       }
       if(valid == 1){
         output = output.substring(2, output.length()) + first2 + "ay";
         s = output;
         return output;
       }
       else return pigLatinSimple(s);
    }

    public static String pigLatinBest(String s){
      String output = s.toLowerCase();
      Character first = output.charAt(0);
      Character last = output.charAt(output.length() - 1);
      if(Character.isLetter(first) &&
      (Character.isLetter(last) || Character.isDigit(last)) ) {
        return pigLatin(s);
      }
      else if(Character.isLetter(first)){
          output = pigLatin(s.substring(0, output.length() - 1)) + last;
        }

        return output;

    }

    public static void main(String[] args){
      Scanner n = new Scanner(System.in);
      String theline = "";
      while(n.hasNextLine()){
        theline = n.nextLine();
        Scanner p = new Scanner(theline);
        while(p.hasNext()){
          String word = p.next();
          System.out.print(pigLatinBest(word));
          if(p.hasNext()){
            System.out.print(" ");
          }
    }
    System.out.println();
  }
}
}
