package gee;

import java.util.logging.Logger;

/**
 * Created by andreas on 2017-10-28.
 */
public class Problem2 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        long a = 1;
        long b = 2;

        long sum = 2;

        long next;

        do {
            next = getNextFibonacciTerm(a, b);

            if(Common.isEven(next)) {
                sum += next;
            }

            a = b;
            b = next;

        } while (next < 4000000);

        logger.info(Long.toString(sum));

    }

    private static long getNextFibonacciTerm(long a, long b) {
        return a + b;
    }


}
