package Pattern;

import java.util.Scanner;

public class pattern_three {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the rows: ");
    int a = sc.nextInt();
    for(int i =1;i<=a;i++){ 
        for(int j=5;j>=1;j--){
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
}
}
