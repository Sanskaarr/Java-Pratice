public class polymorphism{
    void first(){
        System.out.println("Static Method with no argument");
    }

    void first(int a){
        System.out.println("College Fees is : " + a+ " For the First Semester");
    }

    void first(String str){
        System.out.println("College Name is : " + str);
    }
    public static void main(String[] args){
        polymorphism obj = new polymorphism();
        obj.first();
        obj.first("Amity College");
        obj.first(150000);
    }
}