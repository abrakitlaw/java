package stringSwitchCase;

public class StringSupportedInSwitch {

    public static void main(String[] args) {

        System.out.println(getExpandedMessage("one"));
        System.out.println(getExpandedMessage("two"));
        System.out.println(getExpandedMessage("three"));
        System.out.println(getExpandedMessage("-"));

        //Underscores in numeric literals example
        int improvedInt = 100_000;
        float improvedFloat = 100_000f;
        long improvedLong = 100_000L;
        double improvedDouble = 100_000;

        System.out.println(improvedInt);
        System.out.println(improvedFloat);
        System.out.println(improvedLong);
        System.out.println(improvedDouble);
    }

    private static String getExpandedMessage(final String token) {

        String value = null;

        switch (token) {

            case ("one"):
                value = "Token one identified";
                break;

            case ("two"):
                value = "Token two identified";
                break;

            case ("three"):
                value = "Token three identified";
                break;

            case ("four"):
                value = "Token four identified";
                break;

            default:
                value = "No token was identified";
        }

        return value;
    }
}
