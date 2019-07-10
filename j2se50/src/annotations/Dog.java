package annotations;

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Woof woof");
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
