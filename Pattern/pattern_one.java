package Pattern;
import java.util.Scanner;

public class pattern_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows :");
        int a = sc.nextInt();
        System.out.println("Enter The Columns: ");
        int b = sc.nextInt();
        for(int i=1; i<=a; i++){  //rows Printing 
            for(int j = 1; j <= b; j++){ //columns Printing
                System.out.print("*");
    }
    System.out.println();
    sc.close();
}
}
}

