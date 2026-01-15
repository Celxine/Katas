public class TenMinWalk {
  public static boolean isValid(char[] walk) {
   
    if (walk.length != 10) {
      return false;
    }
    
    int vertical = 0;   
    int horizontal = 0; 
  
    for (char direction : walk) {
      switch (direction) {
        case 'n':
          vertical++;
          break;
        case 's':
          vertical--;
          break;
        case 'e':
          horizontal++;
          break;
        case 'w':
          horizontal--;
          break;
      }
    }
    
 
    return vertical == 0 && horizontal == 0;
  }
}