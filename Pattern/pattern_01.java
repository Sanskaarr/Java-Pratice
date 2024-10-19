package Pattern;
import java.util.Scanner;

public class pattern_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("the number of columns is :");
        int c = sc.nextInt();
        System.out.println("the number of rows is :");
        int r = sc.nextInt();


        for (int i = 1; i<=c;i++){
            for (int j =1;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

