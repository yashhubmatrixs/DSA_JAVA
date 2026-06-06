interface A{
     void pay();
     default void display(){
        System.out.println("Hi from A");
     };
}
interface B{
    void pay();
    default void display(){
        System.out.println("Hi from B");
    }
}
class UPI implements A,B{
    public void pay(){
        System.out.println("Payment Done by UPI");
    }
    // public void display(){
    //     System.out.println("Hi from A");
    //     B.super.display(); //Super - it help to access the B as if we call display it runs from the class first then it checks the interfaces so we use super 
    // }
    public void display(){
        System.out.println("Hi i am from  UPI");
        A.super.display();
        B.super.display();
    }
}

public class Interface1 {
    public static void main(String[] args) {
        B user=new UPI();
        //user.pay();
        user.display();
    }
}
