import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

interface StateChangeListener {
    void addStateListener(int x, long y, double z);
    }

class Button {
    public void onStateChange(StateChangeListener listener) {
        listener.addStateListener(1, 2, 3);
    }
}

interface IPrintable {
    void printIt(String text);

    default void printUtf8To(String text, OutputStream outputStream) {
        try {
            outputStream.write(text.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException("Error writing String as UTF-8 to OutputStream", e);
        }
    }
}

interface MyOperator {
    boolean compare(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        // Lambda implements functional interface
        Button primaryButton = new Button();
        primaryButton.onStateChange(((x, y, z) -> System.out.printf("%s, %s, %s%n", x, y, z)));
        // Lambda implements interface with default and static methods
        IPrintable myInterface = System.out::println;
        // Type inference with var
        Function<String, String> toLower = (var input) -> input.toLowerCase();
        Function<String, String> toLowerCase = String::toLowerCase;
        // Lambda as Object
        MyOperator myOperator = (a, b) -> a > b;
        boolean compareResult = myOperator.compare(1, 2);
    }
}
