import java.util.*;
// import java.util.ArrayList;
public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int N) {
		//Code here ;)
//     int[] result = new int[elements.length];
    List<Integer> result=new ArrayList<>();
    Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : elements) {
            int count = countMap.getOrDefault(num, 0);
            if (count < N) {
                result.add(num);
                countMap.put(num, count + 1);
            }
        }
        int[] ans = new int[result.size()];
    int i=0;
        for(int e : result){
          ans[i++]=e;
        }
        return ans;
	}

}
