import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        int a = scanner.nextInt();

        System.out.print("Enter coefficient b: ");
        int b = scanner.nextInt();

        System.out.print("Enter coefficient c: ");
        int c = scanner.nextInt();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Determine the nature of the roots
        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("The root is real and repeated.");
            System.out.println("Root: " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex and distinct.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

        // Close the scanner
        scanner.close();
    }
}
