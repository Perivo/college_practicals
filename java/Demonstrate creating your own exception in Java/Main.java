import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            AgeValidator.validateAge(age); // Validate the entered age
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage()); // Handle the exception
        }

        scanner.close();
    }
}
