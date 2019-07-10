package defaultMethods;

public interface DefaultMethods {

    default void move() {
        System.out.println("Moving...");
    }
}
