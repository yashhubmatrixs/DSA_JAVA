class Student{
    private int rollNo;
    private String Name;
    private int age;
    private String Course;

    int getrollNo(){
        return this.rollNo;
    }

    void setrollNo(int r          ){
        this.rollNo=r;
    }



    String getName(){
        return this.Name;
    }

    void setName(String name){
        this.Name=name;
    }

    int getage(){
        return this.age;

    }

    void setage(int a){
        this.age=a;
    }

    String getCourse(){
        return this.Course;
    }

    void setCourse(String c){
        this.Course=c;
    }

    void eat(){
        System.out.println("Eating ....");

    }
    void study(){
        System.out.println("Study...");
    }
}


public class Encaps1 {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Yash");
        s.setage(21);
        s.setCourse("AIA");
        s.setrollNo(1344);
       
        System.out.println(s.getName());
        System.out.println(s.getCourse());
        System.out.println(s.getage());
        System.out.println(s.getrollNo());
    }
}
