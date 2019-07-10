package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("text1");
        items.add("text2");
        items.add("test1");
        items.add("test2");
        items.add("test3");

        String prefix = "test";
        List<String> filteredList = items.stream().filter(e -> (e.startsWith(prefix))).collect(Collectors.toList());

        for (String value: filteredList) {
            System.out.println(value);
        }
    }
}
