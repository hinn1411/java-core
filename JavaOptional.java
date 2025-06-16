import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class JavaOptional {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        String name = "Hien Giang";
        Optional<String> optName = Optional.of(name);
        System.out.println(optName.isPresent());

        String nullName = null;
        try {
            Optional<String> nullOpt = Optional.of(nullName);
        } catch (NullPointerException e) {
            System.out.println("Cannot pass null as argument to Optional.of() function, use Optional.ofNullable() instead!");
            Optional<String> nullOpt = Optional.ofNullable(nullName);
            System.out.println(nullOpt.isPresent());
        }

        Optional<String> optFullName = Optional.of("Hien Giang");
        optFullName.ifPresent(myName -> System.out.println(myName.length()));
        System.out.println(optFullName.orElse("Dummy full name"));
        System.out.println(Optional.ofNullable(null).orElse("Dummny full name"));

        try {
            Optional.ofNullable(null).orElseThrow(IllegalArgumentException::new);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }

        try {
            Optional.ofNullable(null).get();
        } catch (NoSuchElementException e) {
            System.out.println(e.toString());
        }

        Integer year = 2025;
        System.out.println(Optional.of(year).filter(y -> y == 2025).isPresent());
        System.out.println(Optional.of(year).filter(y -> y == 2026).isPresent());

        Integer computerPrice = 20;
        boolean isInBudgetRange = Optional.of(computerPrice).filter(p -> 15 <= p && p <= 25).isPresent();
        System.out.println("Is in budget range: " + isInBudgetRange);

        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
        int totalOfFruits = Optional.of(fruits).map(List::size).orElseGet(() -> 0);
        System.out.println("total fruits = " + totalOfFruits);

        boolean isPasswordValid = Optional.of(" Hien Gianng ")
                .map(String::trim)
                .filter(p -> p.equals("Giang Tuan Hien"))
                .isPresent();
        System.out.println("Is password valid: " + isPasswordValid);

        String defaultStr = "default str";
        Optional<String> nullStr = Optional.empty();
        Optional<String> demoStr = Optional.of(defaultStr);
        Optional<String> resStr = nullStr.or(() -> demoStr);
    }
}
