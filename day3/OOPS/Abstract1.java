abstract class Animal{
    int no_of_legs;
    String color;
    String modes_of_food;
    

    void eat(){
        System.out.println("Eating Time ..... Dont Distrub me!!!");

    }

    void sleep(){
        System.out.println("Sleeping........");

    }

    abstract void speak();
}
class Rabbit extends Animal{
    void speak(){
        System.out.println("Rabbitt is Saying........Something");
    }
    void jump(){
        System.out.println("Rabbit can jump.........");
    }
}
abstract class Bird extends Animal{
    void voice(){
        System.out.println("Voice of Birding are Good to hear in the morning......... ");


    }

    abstract void fly();
    void type(){
        System.out.println("Types of Bird - Parrot, etc......... ");
    }

    abstract void speak();
}
class koyal extends Bird{
    void speak(){
        System.out.println("koo........");
    }
    void displayName(){
        System.out.println("Koyal Ji...");
    }
    void fly(){
        System.out.println("Koyal is flying...");
    }
}
public class Abstract1{
    public static void main(String [] args){
        Rabbit a=new Rabbit();
        a.eat();
        a.color="White with Black Patches";
        System.out.println(a.color);
        a.jump();
        a.speak();
        Bird b=new koyal();
        b.speak();
        b.fly();
        b.eat();


        

            
    
    }
}