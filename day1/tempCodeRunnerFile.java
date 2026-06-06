import java.util.Scanner;

public class unit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of units");
        double n=sc.nextInt();
        double fixed=50;
    if(n<=100){
    double bill=n*1.5+fixed;
    System.out.println("The unit bill is: "+bill);

    }
    else if(n>100 && n<=200){
    double bill=100*1.5+(n-100)*2.5+fixed;
    System.out.println("The unit bill is: "+bill);

    }
    else if(n>200){
        double bill=100*1.5+200*2.5+(n-200)*5+fixed;
        System.out.println("The unit  bill is: "+bill);
    }
    
}
}