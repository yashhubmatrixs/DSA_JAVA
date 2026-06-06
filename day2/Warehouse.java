import java.util.Scanner;
public class Warehouse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id of products: ");

        int n=sc.nextInt();
        sc.nextLine(); 
        
        int c=0;
        for(int i=1;i<n;i++){
            
            // String name="";
            System.out.print("Enter the name of the products :"  );
            String name=sc.nextLine();
            System.out.print("Enter the curs stock ");

        int current=sc.nextInt();
        System.out.print("Enter the required stock ");
        int minimum=sc.nextInt();
        if(current<minimum){
            System.out.println("INsufficent Stock ");
            System.out.println("The product number is :"+i);
            System.out.println("Total required stock: "+ (minimum-current));
            c++;
        }
        
        else{
            System.out.println("Stock is Sufficient");
        }
        System.out.println("Total number of insufficient  "+c);

        }

        

        
        sc.close();
    }
}
