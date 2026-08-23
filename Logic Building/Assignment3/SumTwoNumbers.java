import java.util.Scanner;

public class SumTwoNumbers {

    public static int sumOfTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        return num1 + num2;
    }

    public static void main(String[] args) {
        int sum = sumOfTwoNumbers();
        System.out.println("The sum is " + sum);
    }
}