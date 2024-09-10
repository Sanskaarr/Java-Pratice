class Parent{
    int a=10;
    void First(){
        System.out.println("Parent Says Hi to the Child");
    }
}

public class Child extends Parent{
    int b=20;
    void Second(){
        System.out.println("Child Says Hey, Parent");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("The Value of a: "+obj.a);
        System.out.println("The Value of b: "+obj.b);
        obj.First();
        obj.Second();
    }
}