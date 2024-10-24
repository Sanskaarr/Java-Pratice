package Pattern;

import java.util.Scanner;

public class pattern_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows: ");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){ //rows 
            for(int j=1;j<=i;j++){ //columns
            System.out.print("*");
        }
        System.out.println("");
        sc.close();
    }
}
}