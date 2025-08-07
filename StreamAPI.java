import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPI {
    private static long counter;
    private static void wasCalled() {
        counter++;
    }
    public static void main(String[] args) {

        List<String> lst = Arrays.asList("abc1", "abc2", "abc3");
        Stream<String> stream = lst.stream().filter(element -> {
            wasCalled();
            return element.contains("2");
        });
        System.out.printf("counter = %s\n", counter); // 0 because no terminal operation

        Optional<String> terminalStream = lst.stream().filter(element -> {
            System.out.println("filter() was called");
            return element.contains("2");
        }).map(element -> {
            System.out.println("map() was called");
            return element.toUpperCase();
        }).findFirst();

    }
}
