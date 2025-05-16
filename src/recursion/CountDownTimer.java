package recursion;

public class CountDownTimer {
    public static void countDown(int n) {
        // solution here
        System.out.println(n);
        if (n != 1) {
            countDown(n-1);
        }
    }

    public static void main(String[] args) {
        countDown(5); // Output: 5 4 3 2 1
    }
}