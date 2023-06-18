import java.util.HashMap;
public class Greed{
  public static int greedy(int[] dice){
    //code here
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int key:dice){
      map.put(key,map.getOrDefault(key,0)+1);
    }
    int sum=0;
    for(int key:map.keySet()){
      int value=map.get(key);
      if(key==5 && (value==1 || value==2)){
        if(value==1) sum+=50;
        if(value==2) sum+=100;
      }
      if(key==1 && (value==1 || value==2)){
        if(value==1) sum+=100;
        if(value==2) sum+=200;
      }
      if(key==1 && value>=3){
        sum+=1000;
        int rem=value%3;
        if(rem==1) sum+=100;
        else if(rem==2) sum+=200;
        else continue;
      }
      else if(key==6 && value>=3) sum+=600;
      else if(key==5 && value>=3){
        sum+=500;
        int rem=value%3;
        if(rem==1) sum+=50;
        else if(rem==2) sum+=100;
        else continue;
      }
      else if(key==4 && value>=3) sum+=400;
      else if(key==3 && value>=3) sum+=300;
      else if(key==2 && value>=3) sum+=200;
      else continue;
    }
    return sum;
  }
}
