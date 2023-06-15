public class Kata {
    public static int findShort(String s) {
     String[] input = s.split(" ");
      int ans=Integer.MAX_VALUE;
     for(String str:input){
       int length=str.length();
       if(length<ans) ans=length;
     }
      return ans;
    }
}
