public class Main {
    public static void main(String[] args) {
        // Testing Method Overloading
        Calculator calculator = new Calculator();
        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3));
        System.out.println("Sum of 2, 3, and 5: " + calculator.add(2, 3, 5));
        System.out.println("Sum of 2.5 and 3.5: " + calculator.add(2.5, 3.5));

        // Testing Method Overriding
        Animal myAnimal = new Animal();
        myAnimal.sound();  // Calls Animal's sound method

        Dog myDog = new Dog();
        myDog.sound();     // Calls Dog's overridden sound method
    }
}
