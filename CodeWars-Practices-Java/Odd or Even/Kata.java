public class Codewars {
  public static String oddOrEven (int[] array) {
  // your code
    int sum=0;
    if(array.length==0){
      return "even";
    }
    for(int i:array){
      sum+=i;
    }
    if(sum%2==0){
      return "even";
    }
    return "odd";
  }
}
