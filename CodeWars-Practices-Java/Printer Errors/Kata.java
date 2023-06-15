public class Printer {
    
    public static String printerError(String s) {
        // your code
      int aTom=0;
      int beyondM=0,denominator=s.length();
      for(int i=0;i<denominator;i++){
        if(s.charAt(i)>'m' && s.charAt(i)<='z')beyondM++;
      }
      String num=String.valueOf(beyondM);
      num=num+"/"+String.valueOf(denominator);
      return num;
    }
}
