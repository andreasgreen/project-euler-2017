package gee;

import java.io.IOException;
import java.util.logging.Logger;


public class Problem41 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        // 8 and 9 figure numbers are divisible by 3
        for (int i = 1; i < Math.pow(10, 7) ; i = i+2) {
            if(Common.isPandigital(i, Integer.toString(i).length()) && Common.isPrime(i)) {
                logger.info("Found: " + i);
            }
        }

        logger.info("Done");

    }


}
