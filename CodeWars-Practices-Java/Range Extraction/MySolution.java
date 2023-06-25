class Solution {
		public static String rangeExtraction(int[] arr) {
//     	StringBuilder sb = new StringBuilder();
      String ans = "";
      for(int i=0;i<arr.length;i++){
        int start=arr[i];
        if(i<arr.length-2 && start-arr[i+1]==-1 && arr[i+1]-arr[i+2]==-1){
          i+=2;
          int end=arr[i];
          while(i<arr.length-1 && arr[i] - arr[i+1]==-1){
            end=arr[i+1];
            i++;
          }
          String s = String.valueOf(start);
          String e = String.valueOf(end);
          ans+=s+"-"+e;
        }else{
          String s = String.valueOf(start);
          ans+=s;
        }
        if(i<arr.length-1){
            ans+=",";
          }
      }
      return ans;
    }
}
