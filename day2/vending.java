import java.util.Scanner;
public class vending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Choose from the machine :- \nTray1=Snacks \nTray2=Beverages \nTray3=chocolates");
        int number =sc.nextInt();
        switch(number){
            case 1:
                System.out.println("Tray1");
                break;
            case 2:
                 System.out.println("Tray2");
                break;   
            case 3:
                System.out.println("Tray3");
                break;
            default:
                System.out.println("No tray available");
                
            
        }
    }
}
