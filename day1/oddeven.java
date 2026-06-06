//odd and even without module 



// import java.util.Scanner;
// public class abc{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         if((n/2)*2==n){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
// }


//other solution for it is 

class oddeven{
    public static void main(String[]args){
        int a=5;
        if((a&1)==0){
            System.out.println("Even");

        }
        else{
            System.out.println("odd");
        }
    }
}