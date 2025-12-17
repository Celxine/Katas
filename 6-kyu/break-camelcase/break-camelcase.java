class Solution {
  public static String camelCase(String input) {
   
   String result = "";
​
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
​
      if (Character.isUpperCase(ch)) {
        result += " ";
      }
​
      result += ch;
    }
​
    return result;
  }
}