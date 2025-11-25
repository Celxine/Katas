class Solution {
  public static String camelCase(String input) {
  String result= "";
    
    for(int i = 0; i < input.length(); i++){
      char c= input.charAt(i);
      if( Character.isUpperCase(c)){
result += " ";
      }
      result += c;
    }
    return result;
  }
  
}