package gee;

import java.io.IOException;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.logging.Logger;


public class Problem25 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        BigInteger n2 = new BigInteger("1");
        BigInteger n3 = new BigInteger("2");
        int k = 2;

        String s = "0";

        while(s.length() < 800) {
            AbstractMap.SimpleEntry<BigInteger, BigInteger> entry = getFibDouble(n2, n3);
            k = k*2;
           // logger.info(k + " " +entry.getKey());
           // logger.info((k+1) + " " +entry.getValue());

            n2 = entry.getKey();
            n3 = entry.getValue();

            s = n2.toString();
        }

        logger.info("done step 1 ");

        k = k+1;

        while (true) {
            BigInteger next = getNextFib(n2, n3);
            k++;

            //logger.info(k + " term done " + next);

            if(next.toString().length() >= 1000) {
                logger.info(k + " " + next.toString());
                break;
            }

            n2 = n3;
            n3 = next;


        }

        long end = System.currentTimeMillis();

        logger.info("Done in " + (end-start) + " ms");


    }

    private static BigInteger getNextFib(BigInteger n1, BigInteger n2) {
        return n1.add(n2);
    }


    private static AbstractMap.SimpleEntry<BigInteger, BigInteger> getFibDouble(BigInteger n2, BigInteger n3) {
        BigInteger n4 = n2.multiply(n3.multiply(new BigInteger("2")).subtract(n2));
        BigInteger n5 = n3.pow(2).add(n2.pow(2));
        return new AbstractMap.SimpleEntry<>(n4,n5);
    }

}
