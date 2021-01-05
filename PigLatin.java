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

  }
