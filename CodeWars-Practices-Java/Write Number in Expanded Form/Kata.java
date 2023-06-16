public class Kata
{
    public static String expandedForm(int num)
    {
      //your code here
//       StringBuilder ans = new StringBuilder();
      String ans="";
      int pos=1;
      while(num>0){
        int rem=num%10;
        int temp=0;
        if(rem>0){
          temp=rem*pos;
          String s = String.valueOf(temp);
          if(pos==1) ans = s;
          else{
            if(ans.length()!=0){
              ans=s+" + "+ans;
            }else ans=s+ans;
            }
          }
        pos=pos*10;
        num/=10;
      }
      return ans;
    }
}
