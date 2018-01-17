package gee;

import java.io.IOException;
import java.math.BigInteger;
import java.util.logging.Logger;


public class Problem16 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        BigInteger base = new BigInteger("2");

        BigInteger res = base.pow(1000);

        String s = res.toString();

        logger.info(s);

        long sum = 0;

        for(int i = 0 ; i < s.length() ; i++) {
            long l = Long.parseLong(Character.toString(s.charAt(i)));
            sum += l;
        }

        logger.info(Long.toString(sum));
    }




}
