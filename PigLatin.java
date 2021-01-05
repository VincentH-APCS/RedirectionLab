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

  }
