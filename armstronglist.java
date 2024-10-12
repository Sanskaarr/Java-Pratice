import java.util.ArrayList;

public class armstronglist {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 to 2000000000");
        ArrayList<Integer> armstrongNumbers = new ArrayList<>();
        for (int i = 100; i <= 2000000000; i++) {
            if (armstrong1(i)) {
                armstrongNumbers.add(i);
            }
        }
        System.out.println("Armstrong numbers: " + armstrongNumbers);
    }

    public static boolean armstrong1(int number) {
        int temp = number;
        int sum = 0;
        int power = String.valueOf(number).length();
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, power);
            temp /= 10;
        }
        return sum == number;
    }
}