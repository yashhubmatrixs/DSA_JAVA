
public class LongestSubArray {
    public static void main(String[] args) {
        int[]arr={1,2,1,0,1,0,3};
        int k=4;
        int left=0;
        int sum=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            maxLen=Math.max(maxLen,i-left+1);
            
        }
        System.out.println("Longest Length = "+maxLen);
    }
}
