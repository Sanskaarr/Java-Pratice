import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    static void thirdLargest(int arr[], int arr_size) 
        {
            if (arr_size < 3) {
                System.out.printf(" Invalid Input ");
                return;
            }
    
            // Sort the array in descending order
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            //int third =arr[arr_size -3];
            int sumofthirdlarge = arr[9] + arr[8] +arr[7];
            
            System.out.printf("The third Largest element is %d\n", sumofthirdlarge);
        }
    public static void main(String ar[])
    {
        int ar1[]=new int[10];
        int ar3[]=new int[10];
        int ar2[]=new int[10];
        int odd=0;
        int even=0;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<10;i++)
        {
            ar1[i]=sc.nextInt();
            
        }
        for (int i=0;i<10;i++)
        {
            if (ar1[i]%2==0)
            {
                ar2[even]=ar1[i];
                even++;
            }
            else{
                ar3[odd]=ar1[i];
                odd++;
            }

        }
        for(int j =0;j<even;j++)
        {
        System.out.println(ar2[j]);
       }
       thirdLargest(ar2, even);
       thirdLargest(ar3, odd);
}
    
}
