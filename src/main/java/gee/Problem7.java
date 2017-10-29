package gee;

import java.util.logging.Logger;

/**
 * Created by andreas on 2017-10-29.
 */
public class Problem7 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        int nrFoundPrimes = 0;
        int findNr = 10001;
        long candidate = 1;

        while (nrFoundPrimes < findNr) {
            candidate++;
            if(Common.isPrime(candidate)) {
                nrFoundPrimes++;
                //logger.info(Long.toString(candidate));
            }

        }

        logger.info(Long.toString(candidate));
    }
}
