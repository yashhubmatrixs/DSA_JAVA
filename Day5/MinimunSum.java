
import java.util.HashMap;



public class MinimunSum {
    public static void main(String[] args) {
        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        int k=6;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int min=0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                int len=i-map.get(sum-k);
                min=min<len?len:min;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        
        }
        System.out.println(min);
    }
}
