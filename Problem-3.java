import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // If number is even, reduce by 1 to make it odd
        if (num % 2 == 0) {
            num = num - 1;
        }

        // Print the series of odd numbers
        for (int i = 1; i <= num * 2; i += 2) {
            System.out.print(i);
            if (i < num * 2 - 1) {
                System.out.print(", ");
            }
        }
    }
}
