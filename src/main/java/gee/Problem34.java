package gee;

import java.io.IOException;
import java.util.logging.Logger;


public class Problem34 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        // find correct upper bound.
        for (long i = 3; i < Long.MAX_VALUE ; i++) {
            if(i == getDigitFac(i)) {
                logger.info("This: " + i);
            }
        }

    }

    private static long getDigitFac(long l) {
        String s = Long.toString(l);
        long sum = 0;

        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            long digit = Long.parseLong(Character.toString(c));
            sum += Common.getFac(digit);
        }

        return sum;
    }



}


