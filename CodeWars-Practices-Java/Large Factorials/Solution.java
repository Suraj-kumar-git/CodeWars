import java.math.BigInteger;
public class Kata
{

  public static String Factorial(int n) {
    if(n<0) return null;
    if(n==0) return "1";
    BigInteger fact = BigInteger.ONE;
    while(n>1){
      fact=fact.multiply(BigInteger.valueOf(n));
      n--;
    }
    String ans = fact.toString();
    return ans;
  }

}
