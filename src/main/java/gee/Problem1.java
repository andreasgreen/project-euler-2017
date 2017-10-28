package gee;

import java.util.logging.Logger;

/**
 * Created by andreas on 2017-10-28.
 */
public class Problem1 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0 ; i < 1000 ; i++) {
            if (i % 3 == 0) {
                sum += i;
                continue;
            }

            if(i % 5 == 0) {
                sum += i;
            }
        }

        logger.info(Integer.toString(sum));
    }

}
