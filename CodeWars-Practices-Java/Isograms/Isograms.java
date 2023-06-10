public class isogram {
    public static boolean  isIsogram(String str) {
        // ...
      if(str==null || str.length()==0){
        return true;
      }
      for(int i=0;i<str.length();i++){
        for(int j=i+1;j<str.length();j++){
          char c1 = Character.toLowerCase(str.charAt(i));
          char c2 = Character.toLowerCase(str.charAt(j));
          if(c1==c2){
            return false;
          }
        }
      }
      return true;
    } 
}