​
public class Kata {
  public static String firstNonRepeatingLetter(String s){
    
    for(int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      String lowerS = s.toLowerCase();
      char lowerChar = Character.toLowerCase(currentChar);
​
      
      if(lowerS.indexOf(lowerChar) == lowerS.lastIndexOf(lowerChar)) {
        return String.valueOf(currentChar);
      }
    }
    
    return "";
  }
}