package hexlet.code.utils;

import java.util.Scanner;

public class Math {

    public static int GCD (int operand1, int operand2) {
        int tmp;

        while (operand2 != 0) {
            tmp = operand2;
            operand2 = operand1 % operand2;
            operand1 = tmp;
        }

        return operand1;
    }
}
