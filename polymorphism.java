public class polymorphism{
    void First(int a){
        System.out.println("Value of A is :" + a);
    }

    void First(String b, int a){
        System.out.println("My College Name is :" + b);
        System.out.println("My roll Number is :"+ a);
    }

    public static void main(String[] args){
        polymorphism obj = new polymorphism();
        obj.First(12);
        obj.First("Amity", 154);
    }
}