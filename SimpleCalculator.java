import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the operation
        System.out.println("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose operation: 1-Add, 2-Subtract, 3-Multiply, 4-Divide, 5-Modulus");
        int operation = scanner.nextInt();

        try {
            int result = 0;
            switch (operation) {
                case 1:
                    result = Math.addExact(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = Math.subtractExact(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = Math.multiplyExact(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;
                case 5:
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operation selected.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
