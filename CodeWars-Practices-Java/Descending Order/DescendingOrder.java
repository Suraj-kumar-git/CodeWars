import java.util.Arrays;
public class DescendingOrder {
  public static int sortDesc(final int num) {
    //Your code
    String numberString = String.valueOf(num);
    char[] number = numberString.toCharArray();
    Arrays.sort(number);
    for(int i=0,j=number.length-1;i<number.length/2;i++){
      char temp=number[i];
      number[i]=number[j];
      number[j]=temp;
      j--;
    }
    String ans = new String(number);
    int realAns= Integer.parseInt(ans);
    return realAns;
  }
}