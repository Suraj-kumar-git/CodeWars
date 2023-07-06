public class NoBoring {
    public static int noBoringZeros(int n) {
      int rem=n%10;
      while(rem==0 && Math.abs(n)>0){
        n/=10;
        rem=n%10;
      }
      return n;
    }
}
