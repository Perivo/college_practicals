import java.util.Arrays;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of strings
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to store the names
        String[] names = new String[n];

        // Input names
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Sort the names in ascending order
        Arrays.sort(names);

        // Display the sorted names
        System.out.println("Sorted names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }

        // Close the scanner
        scanner.close();
    }
}
