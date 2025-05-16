package recursion;

public class PowerFunction {
    public static int power(int base, int exponent) {
        int product = 0;
        product = base;
        if (exponent > 1) {
            product = product * power(base, exponent-1);
        }
        
        return product;
    }

    public static void main(String[] args) {
        System.out.println(power(6, 3));
    }
}