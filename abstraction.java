abstract class first {
    abstract void firstmethod();
    void secondmethod(){
        System.out.println("This is the Second Method from Abstact Class ");
    }
}

class abstraction extends first{
    void firstmethod(){
        System.out.println("This is the First Method from the Derived Class");
    }

    public static void main(String[] args){
        abstraction obj = new abstraction();
        obj.firstmethod();
        obj.secondmethod();
    }
}
