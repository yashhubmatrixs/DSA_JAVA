
import java.util.Scanner;
public class CinemaBooking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            else{
                
                max=count>max ? count:max;
                count=0;
            }

        }
        
        System.out.println(max);
    }
}
