import java.util.Scanner;

public class unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of units:");
        double n = sc.nextInt();

        double fixed = 50;
        double bill = 0;

        if (n <= 100) {
            bill = n * 1.5 + fixed;
        }
        else if (n <= 200) {
            bill = 100 * 1.5 + (n - 100) * 2.5 + fixed;
        }
        else {
            bill = 100 * 1.5 + 100 * 2.5 + (n - 200) * 5 + fixed;
        }

        if (bill >= 2000) {
            bill = bill + (bill * 0.10); 
        }

        System.out.println("The unit bill is: " + bill);

        sc.close();
    }
}