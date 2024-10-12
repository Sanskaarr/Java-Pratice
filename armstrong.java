public class armstrong {
    public static void main(String[] args){
        System.out.println("Armstrong number between 100 and 2,000,000,000");

        // Iterate through the range of numbers
        for(int i =100;i<=2000000000;i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }


// Method to check if a number is Armstrong number
public static boolean isArmstrong(int n){
 int original = n;
 int sum =0;
 int digits = String.valueOf(n).length(); // Count the number of digits

//  Calculate the sum of the digits raised to the power of the number of digits
 while(n!=0){
  int remainder = n % 10;
  sum += Math.pow(remainder, digits);
  n /= 10;
 }
 return sum==original;

}
}