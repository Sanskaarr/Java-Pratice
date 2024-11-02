package Pattern;
import java.util.Scanner;

public class pattern_03 {
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=(n-1);j++){
                System.out.print(" ");
            }

            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n-1; i>0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
        
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
    }
    sc.close();
}
}