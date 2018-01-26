package gee;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.logging.Logger;


public class Problem27 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        int max = Integer.MIN_VALUE;

        for (int a = -999; a < 1000 ; a++) {
            for (int b = -1000; b <= 1000 ; b++) {

                boolean stillPrime = true;
                int n = 0;

                while (stillPrime) {
                    long l = (long)Math.pow(n,2) + a*n + b;

                    if(!Common.isPrime(l)) {
                        stillPrime = false;
                    }

                    n++;
                    if(n > max) {
                        logger.info("n^2 " + a + "n" + b + " n = " + n);
                        max = n;
                    }
                }
            }
        }
    }



}
