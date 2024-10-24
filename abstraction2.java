interface A{
    void first();
    void Second();
    void third();
    default void fourth(){
        System.out.println("This is the Default Method in the Interface A");
    }
}

class abstraction2 implements A{
    public void first(){

        int a =77;
        System.out.println("Value of a in Inteface A is : " + a);
    }

   public void Second(){
        System.out.println("This is the Second Method from the Interface A");
    }

    public void third(){
        System.out.println("This is the Third Method from the Interface A");
    }

    public static void main(String[] args){
        abstraction2 obj = new abstraction2();
        obj.first();
        obj.Second();
        obj.third();
        obj.fourth(); // Calls the Default Method from the Interface A
    }
}