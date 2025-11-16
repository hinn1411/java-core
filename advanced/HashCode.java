package advanced;

class ComplexNumber {
    int real;
    int imaginary;

    public  ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof ComplexNumber other)) {
            return false;
        }

        return real == other.real && imaginary == other.imaginary;
    }

    @Override
    public int hashCode() {
        return real * imaginary;
    }
}

public class HashCode {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(1, 2);
        ComplexNumber second = new ComplexNumber(2, 1);
        ComplexNumber third = new ComplexNumber(1, 2);
        System.out.println(first.hashCode() == second.hashCode());
        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
    }
}
