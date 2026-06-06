import java.util.Scanner;

public class parking{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of hours");
        double hours=sc.nextInt();
    if(hours<=2){
    double bill=hours*100;
    System.out.println("The parking bill is: "+bill);

    }
    else if(2<=hours && hours<=5){
    double bill=2*100+(hours-2)*50;
    System.out.println("The parking bill is: "+bill);

    }
    else if(hours>5){
        double bill=2*100+3*50+(hours-5)*10;
        System.out.println("The parking bill is: "+bill);
    }
}
}