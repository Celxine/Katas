public class Kata {
 
  public static boolean validPhoneNumber(String phoneNumber) {
   
    if (phoneNumber.length() != 14) {
        return false;
    }
    if (phoneNumber.charAt(0) != '(') return false;
    if (phoneNumber.charAt(4) != ')') return false;
    if (phoneNumber.charAt(5) != ' ') return false;
    if (phoneNumber.charAt(9) != '-') return false;
​
    int[] digitPositions = {1, 2, 3, 6, 7, 8, 10, 11, 12, 13};
    
    for (int pos : digitPositions) {
        if (!Character.isDigit(phoneNumber.charAt(pos))) {
            return false;
        }
    }
    
    return true;
}
}