package recursion;

public class DecimalToBinary {
    public static String toBinary(int n) {
        if (n > 1) {
            return toBinary(n / 2) + (n % 2);
        } else {
            return Integer.toString(n);
        }
    }

    public static void main(String[] args) {
        System.out.println(toBinary(10));
    }
}
