import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble(); // read first number

        System.out.print("Enter second number: ");
        double b = sc.nextDouble(); // read second number

        sc.nextLine(); 

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.nextLine().trim().toLowerCase(); 

        double result;
        switch (operation) {
            case "add":
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case "subtract":
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case "multiply":
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case "divide":
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation entered.");
        }

        sc.close();
    }
}
