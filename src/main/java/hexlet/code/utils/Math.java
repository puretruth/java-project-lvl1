package hexlet.code.utils;

import java.util.Arrays;

public class Math {

    public static int gcd(int operand1, int operand2) {
        int tmp;

        while (operand2 != 0) {
            tmp = operand2;
            operand2 = operand1 % operand2;
            operand1 = tmp;
        }

        return operand1;
    }
    public static boolean[] primes(int endNumber) {
        var primes = new boolean[endNumber + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i * i < endNumber; i++) {
            if (primes[i]) {
                for (int j = i * i; j < endNumber; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }

}
