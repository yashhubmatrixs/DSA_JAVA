import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("marks of maths: ");
        int m1=sc.nextInt();
        System.out.println("weights of maths: ");
        double w1=sc.nextDouble();

        System.out.println("marks of science: ");
        int m2=sc.nextInt();
        System.out.println("weights of maths: ");
        double w2=sc.nextDouble();
        
        
        System.out.println("marks of sst: ");
        int m3=sc.nextInt();
        System.out.println("weights of maths: ");
        double w3=sc.nextDouble();
        

        double  wa=((m1*w1)+(m2*w2)+(m3*w3));
        if(wa>=90){
            System.out.println("Graded A");

        }
        else if(wa>=80 && wa<90){
            System.out.println("Graded B");
        }
        else if(wa>=70 && wa<80){
            System.out.println("Graded C");
        }
        else if(wa>=60 && wa<70){
            System.out.println("Graded D");
        }
        else{
            System.out.println("Graded F");
        }
        
    }
}
