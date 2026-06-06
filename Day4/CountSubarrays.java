public class CountSubarrays {

    public static long countSubarrays(int[] arr, long k) {
        int left = 0;
        long sum = 0;
        long count = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            
            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,-2,5,-1,2,-3,6,-2,4};
        long k = 7;

        System.out.println(countSubarrays(arr, k));
    }
}