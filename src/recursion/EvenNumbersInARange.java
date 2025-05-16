package recursion;

public class EvenNumbersInARange {
    public static void printEvens(int start, int end) {
        if (start%2 == 0 && start >= end) {
            System.out.println(start);
            printEvens(start - 2, end);
        }
    }

    public static void main(String[] args) {
        printEvens(50, 20);
    }
}
