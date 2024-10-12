public class Parent {
    int a = 55;
    void First(){
        System.out.println("Parent Says Hi To the Child");
    }
}

class Inheritance extends Parent{
    int b = 77;
    void Second(){
        System.out.println("Child Says Hello To the Parent");
    }

    public static void main(String[] args){
        Inheritance obj = new Inheritance();
        obj.First(); // Calls Parent's First Method
        obj.Second(); // Calls Child's Second Method
        System.out.println(obj.a); // Prints Parent's a
        System.out.println(obj.b); // Prints Child's b
    }
}