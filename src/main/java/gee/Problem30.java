package gee;

import java.io.IOException;
import java.util.DoubleSummaryStatistics;
import java.util.logging.Logger;


public class Problem30 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        int max = 1000000;   // approx
        int sum = 0;
        for (int i = 10; i < max ; i++) {
            if(i == getPowerSum(i, 5)) {
                logger.info(Integer.toString(i));
                sum += i;
            }
        }
        logger.info("sum: " + sum);

    }

    private static long getPowerSum(int base, int exp) {
        String s = Integer.toString(base);
        long sum = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            Double b = Double.parseDouble(Character.toString(s.charAt(i)));
            double part = Math.pow(b, exp);
            sum += part;
        }
        return sum;
    }
}
