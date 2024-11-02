import java.util.Scanner;
public class stringmatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character = sc.nextLine().charAt(0);
        System.out.println(character);

        
        String str = "HelloWorld! ";
        String str2 = " ";
        String st=str.concat("sneha");
        System.out.println(st);
        System.out.println(str.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println();
        System.out.println(str.trim()+str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(2));
        sc.close();
    }
    
}
