package basics;

public class Final {
    public static int functionWithFinalParams(final int x, final int z) {
        return x + z;
    }
    public static void main(String[] args) {
        int res = functionWithFinalParams(1, 2);
        System.out.println(res);
    }
}
