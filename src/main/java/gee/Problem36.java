package gee;

import java.io.IOException;
import java.util.logging.Logger;


public class Problem36 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        long sum = 0;

        for (int i = 1; i < 1000000; i++) {
            if(Common.isPalindromic(Integer.toString(i))) {
                String bin = Common.getBinaryString(i);
                if(Common.isPalindromic(bin)) {
                    logger.info("this " + i + " " + bin);
                    sum += i;
                }
            }
        }
        logger.info("sum: " + sum);
    }





}


