package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        Map<String, Integer> n = new TreeMap<String, Integer>();
        Integer v = 1;
        String k = "Hien";
        m.put(k, v);

        System.out.println(m.containsKey("Hahaha"));
        System.out.println(m.containsValue(1));
        m.compute("Giang", (key, value) -> value == null ? null : 1);
        m.computeIfAbsent("123", key -> 2);
        System.out.println(m.get("123"));
    }
}
