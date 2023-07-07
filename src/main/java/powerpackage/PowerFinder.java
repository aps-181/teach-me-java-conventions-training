package powerpackage;

public class PowerFinder {
    public static int OF(int base, int exponent) {
        int pow = 1;
        for (int i = 1; i<=exponent; i++) {
            pow *= base;
        }
        return pow;
    }
}
