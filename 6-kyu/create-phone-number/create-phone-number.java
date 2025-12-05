public class Kata {
  public static String createPhoneNumber(int[] numbers) {
   
  
     StringBuilder sb = new StringBuilder();
    for (int num : numbers) {
        sb.append(num);
    }
    return sb.toString().replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
​
    
  }
}