import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Creating a List using ArrayList
        List<String> fruits = new ArrayList<>();

        // Adding elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Displaying the List
        System.out.println("Fruits List: " + fruits);

        // Adding an element at a specific index
        fruits.add(2, "Blueberry");
        System.out.println("After adding Blueberry: " + fruits);

        // Accessing elements from the List
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: " + firstFruit);

        // Updating an element
        fruits.set(1, "Blackberry");
        System.out.println("After updating Banana to Blackberry: " + fruits);

        // Removing an element
        fruits.remove("Date");
        System.out.println("After removing Date: " + fruits);

        // Checking the size of the List
        int size = fruits.size();
        System.out.println("Size of the list: " + size);

        // Iterating through the List
        System.out.println("Iterating through the List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if an element exists
        boolean hasCherry = fruits.contains("Cherry");
        System.out.println("Does the list contain Cherry? " + hasCherry);

        // Clearing the List
        fruits.clear();
        System.out.println("After clearing the List, size: " + fruits.size());
    }
}
