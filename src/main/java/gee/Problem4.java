package gee;

import java.util.logging.Logger;

/**
 * Created by andreas on 2017-10-29.
 */
public class Problem4 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        long largest = 0;

        for(int a = 100 ; a < 1000 ; a++) {
            for(int b = 100 ; b < 1000 ; b++) {
                long p = a*b;
                if(p > largest && isPalindrome(p)) {
                    logger.info(a + "x" + b + " = " + p + ", " + largest);
                    largest = p;
                }
            }
        }

        logger.info(Long.toString(largest));

    }

    private static boolean isPalindrome(long l) {
        String s = Long.toString(l);
        String r = "";

        for(char c : s.toCharArray()) {
            r = c + r;
        }

        return s.equals(r);

    }
}
