public class Kata {
​
  public static String solution(String str) {
  
       StringBuilder rev = new StringBuilder(str);
    rev.reverse();
    
    return rev.toString();
  }
​
}