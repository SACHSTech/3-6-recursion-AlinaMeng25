package recursion;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        if (n > 9) {
            int num = n%10;
            return num + sumOfDigits(n/10);
        }
        else {
            return n;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
        System.out.println(sumOfDigits(555));
    }
}
