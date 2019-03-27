package ch01;

import java.math.BigInteger;

public class Ex6 {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(n + "! = " + factorial(n));
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            BigInteger j = BigInteger.valueOf(i);
            result = result.multiply(j);
        }
        return result;
    }
}
