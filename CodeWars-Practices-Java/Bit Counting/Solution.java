public class BitCounting {

	public static int countBits(int n){
		// Show me the code!
    int count=0;
    while(n>0){
      if(n%2==1) count++;
      n/=2;
    }
    return count;
	}
	
}
