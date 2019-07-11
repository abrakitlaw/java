package varags;

public class VaragsExample {

    public static void main(String[] args) {
        operation("test1", "test2", "test3");
    }

    private static void operation(String... strings) {
        for (String value: strings) {
            System.out.println(value);
        }
    }
}
