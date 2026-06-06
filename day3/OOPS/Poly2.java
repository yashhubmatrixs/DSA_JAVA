class Parent{
    void greet(){
        System.out.println("Hi i am from Parent");
    }


}
class Child extends Parent{
    void greet(){
        System.out.println("Hi i am from Child");
        super.greet();
    }
}
public class Poly2 {
    public static void main(String[] args) {
        Parent b=new  Child();
        b.greet();
    }
}
