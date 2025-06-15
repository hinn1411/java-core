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

//        System.out.println(Optional.ofNullable(null).orElseThrow(IllegalArgumentException::new));

        System.out.println(Optional.ofNullable(null).get());
    }
}
