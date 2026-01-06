import java.util.Arrays;
​
public class Kata {
  public static String[] sort(String[] names) {
  Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);   
    
    return names;
  }
}