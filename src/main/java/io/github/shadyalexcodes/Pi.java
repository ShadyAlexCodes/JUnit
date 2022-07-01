package io.github.shadyalexcodes;

public class Pi {

    public static char GetDigitOfPi(int intPiDigit) {
        String s;
        final double PI = Math.PI;

        s = Double.toString(PI);
        return s.charAt(intPiDigit);
    }
}
