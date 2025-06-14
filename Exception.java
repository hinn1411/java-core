class CustomException extends java.lang.Exception {
    private int a;
    CustomException(int a) {
        this.a = a;
    }
    public String toString() {
        return String.format("Exception number = %d", a);
    }
}
public class Exception {
    public static void main(String[] args) {
        try {
            String a = null;
            a.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("Input string is null!");
        }

        try {
            int b = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by 0!");
        }

        try {
            int a[] = new int[5];
            a[7] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound!");
        }

        try {
            throw new CustomException(1);
        } catch (CustomException e) {
            System.out.println(e);
        }
    }
}
