interface A{
    void Afirst();
    void Asecond();
}

interface B{
    void Bfirst();
    void Bsecond();
}

class C{
    void Cfirst(){
        System.out.println("THis is the C First Method");
    };
}

class abstractionprogram extends C implements A,B{
    public void Afirst(){
        System.out.println("This is the Afirst Method");
    }

    public void Asecond(){
        System.out.println("This is the Asecond Method");
    }

    public void Bfirst(){
        System.out.println("This is the Bfirst Method");
    }

    public void Bsecond(){
        System.out.println("This is the Bsecond Method");
    }

    public static void main(String[] args){
        abstractionprogram obj = new abstractionprogram();
        obj.Afirst();
        obj.Bfirst();
        obj.Asecond();
        obj.Bsecond();
        obj.Cfirst();
    }
}
