import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main14 {

    private static Scanner scanner = new Scanner(System.in);

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";


    public static void main(String[] args) {

        Main14.assertExample();
        Main14.regexExample();
    }

    private static void assertExample() {
        int age;
        System.out.print("Please input your age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        assert age >= 18 : " Underage";
        System.out.println("Age is " + age);
    }

    private static void regexExample() {
        String email;
        System.out.print("Please input your email address: ");
        email = scanner.nextLine();
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        boolean status = matcher.matches();

        if (status) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is not valid");
        }
    }
}
