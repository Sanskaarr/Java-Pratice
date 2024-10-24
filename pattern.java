import java.util.Scanner;

public class pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Printing the Stars by column and rows
        System.out.println("Enter the Colums ");
        int c = sc.nextInt();
        System.out.println("Enter the Rows: ");
        int r = sc.nextInt();

        for(int i=1; i<=c;i++){
            for(int j=1;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        // Printing the Pattern in the Correct Order
        // System.out.println("Enter the number ");
        // int n = sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Printing the Pattern in the Reverse order
        // for (int i = n-1; i>0; i--) {
        //     for (int j = i; j > 0; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }
    }
}
