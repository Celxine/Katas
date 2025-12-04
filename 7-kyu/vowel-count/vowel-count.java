public class Vowels {
  public static int getCount(String str) {
    String vowels = "aeiou";
    int count = 0;
    
    for(char c : str.toCharArray()) {
      if(vowels.contains(String.valueOf(c))) { 
        count++;
      }
    }
    
    return count;
  }
}