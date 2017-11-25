package gee;

import java.util.logging.Logger;
import java.util.regex.Matcher;

/**
 * Created by andreas on 2017-10-28.
 */
public class Problem9 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        // a, b, c < 1000
        // a < b < c

        for (int a = 0 ; a < 1000 ; a++) {
            for(int b = 1 ; b < 1000 ; b++) {
                for(int c = 2 ; c < 1000 ; c++) {
                    if(a < b && a < c && b < c) {
                        //logger.info("Cand: " + a + " " + b + " " + c);
                        if (a+b+c == 1000 && isPythagoreanTriplet(a, b, c)) {
                            logger.info (a + " x " + b + " x " + c + " = " + a*b*c);
                        }
                    }
                }
            }
        }
    }

    private static boolean isPythagoreanTriplet(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

}
