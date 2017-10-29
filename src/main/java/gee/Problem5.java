package gee;

import java.util.logging.Logger;

/**
 * Created by andreas on 2017-10-29.
 */
public class Problem5 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        long a = 2520;
        boolean found = false;

        while (!found) {
            a += 1;
            if(divisible(a)) {
                break;
            }
        }
        logger.info(Long.toString(a));
    }

    private static boolean divisible(long a) {
        int max = 20;
        for(int i = 1 ; i <= max ; i++) {
            if(a % i != 0) {
                return false;
            }
        }

        return true;
    }
}
