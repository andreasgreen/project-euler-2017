package gee;

import java.util.logging.Logger;

/**
 * Created by andreas on 2017-10-28.
 */
public class Problem10 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        long sum = 0;

        for(long i = 0 ; i < 2000000 ; i++) {
            if(Common.isPrime(i)) {
                sum += i;
                //logger.info("Adding " + i + " for total sum " + sum);
            }
        }

        logger.info("Sum: " + sum);
    }

}
