import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        Set a = new HashSet();
        Set b = new TreeSet();
        Set<String> c = new LinkedHashSet<String>();
        Set<Integer> d = Set.<Integer>of(1,2,3);

        a.add("Giang");
        a.add("Tuan");
        a.add("Hien");
        a.stream().forEach(element -> {
           System.out.println(element);
        });
        a.remove("Giang");
    }
}
