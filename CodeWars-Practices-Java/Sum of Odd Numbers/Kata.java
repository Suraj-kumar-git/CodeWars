class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        //TODO
      int sum=0;
      if(n==1){
        return 1;
      }
      int multiply=0;
      for(int i=2;i<n;i++){
        multiply+=i;
      }
      for(int i=0;i<n;i++){
        int num=2*(multiply+i+1)+1;
        sum+=num;
      }
      return sum;
    }
}
