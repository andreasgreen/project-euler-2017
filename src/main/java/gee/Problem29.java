package gee;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;


public class Problem29 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        Set<BigInteger> s = new HashSet<>();
        for (int a = 2; a <= 100 ; a++) {
            BigInteger base = new BigInteger(Integer.toString(a));
            for (int b = 2; b <= 100 ; b++) {
                BigInteger res = base.pow(b);
                s.add(res);
            }
        }

        logger.info(""+s.size());
    }



}
