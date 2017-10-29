package gee;

import java.util.logging.Logger;

/**
 * Created by andreas on 2017-10-29.
 */
public class Problem6 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        long max = 100;

        long diff = getSquareSum(max) - getSumSquare(max);
        logger.info(Long.toString(diff));
    }

    private static long getSquareSum(long a) {
        // (a + (a+1) + ...)^2
        long sum = 0;
        for (long l = 1 ; l <= a ; l++) {
            sum += l;
        }

        return (long)Math.pow(((Long)sum).doubleValue(), 2);
    }

    private static long getSumSquare(long a) {
        // a^2 + (a+1)^2 + ...
        long sum = 0;

        for (long l = 1 ; l <= a ; l++) {
            sum += (long)Math.pow(((Long)l).doubleValue(), 2);
        }

        return sum;
    }
}
