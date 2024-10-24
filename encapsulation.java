// public class encapsulation {
//     public static void main(String[] args) {
//         Integernumber obj = new Integernumber();
//         obj.setName(100);
//         System.out.println(obj.getName());
//     }
// }

// class Integernumber{
//     private int number;

// public int getName(){
//     return number;
// }

// public void setName(int no){
//     this.number = no;
// }
//  }



import java.util.Scanner;

class Number{
    private int no;

    public int getno(){
        return no;
    }

    public void setNo(int number){
        this.no = number;
    }
}

public class encapsulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Number obj = new Number();
        System.out.println("Enter the Number: ");
        int a = sc.nextInt();
        obj.setNo(a);
        System.out.println("The Number is: "+ obj.getno());
    }
}
