import java.util.*;

class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {
        // your code
      List<Long> ans = new ArrayList<>();
      for(long i=a;i<=b;i++){
        if(isEureka(i)){
          ans.add(i);
        }
      }
      return ans;
    }
  public static boolean isEureka(long num){
    long temp=num;
    long sum=0;
    if(num>=1 && num<10 ){
      return true;
    }else{
      String s = String.valueOf(num);
      int len = s.length();
      while(num>0){
        long rem=num%10;
        sum+=Math.pow(rem,len--);
        num/=10;
      }
    }
    return temp==sum;
  }
}
