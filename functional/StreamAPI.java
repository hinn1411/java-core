package functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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

        long size = lst.stream().skip(2).map(element -> {
            wasCalled();
            return element.substring(0, 3);
        }).skip(2).count();

        System.out.println(List.<String>of("1", "2", "2").
                stream().collect(Collectors.joining(", ", "[", "]")));

        List<Integer> intList = List.of(1,2,3);
        intList.parallelStream().forEach(System.out::println);
    }
}
