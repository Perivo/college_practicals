package Animals;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }

    @Override
    public void eat() {
        System.out.println("The dog eats meat");
    }
}
