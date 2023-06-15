public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    // Insert brilliant code here
    if(walk.length != 10){
      return false;
    }
    int ahead=0;
    int side=0;
    for(char dir : walk){
      switch (dir){
          case 'n':
            ahead++;
            break;
          case 's':
            ahead--;
            break;
          case 'e':
            side++;
            break;
          case 'w':
            side--;
            break;
      }
    }
    return ahead==0 && side==0;
  }
}
