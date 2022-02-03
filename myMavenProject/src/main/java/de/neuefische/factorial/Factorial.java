package de.neuefische.factorial;

public class Factorial {

    public static int facFor(int input) {
        var result = 1;
        for (int i=1; i<=input; i++) {
            result *= i;
        }
        return result;
    }

    public static int facWhile(int input) {
        int result = 1;
        while (input > 0) {
            result *= input;
            --input;
        }
        return result;
    }

}
