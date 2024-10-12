abstract class example {
    abstract void m1();
    abstract void m2();   
    abstract void m3();
}

class newclass extends example {
    void m1(){
        System.out.println("Method 1");
    }

    void m2(){
        System.out.println("Method 2");
    }

    void m3(){
        System.out.println("Method 3");
    }

    public static void main(String[] args){
        newclass obj = new newclass();
        obj.m1();
        obj.m2();
        obj.m3(); 
    }

}