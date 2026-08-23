import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            sum = sum + num;
        }

        float average = sum / numbers.length;

        System.out.println("The average of the numbers is: " + average);
    }
}