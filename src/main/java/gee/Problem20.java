package gee;

import javafx.util.converter.BigIntegerStringConverter;

import java.io.IOException;
import java.math.BigInteger;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.logging.Logger;


public class Problem20 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        BigInteger fac = new BigInteger("1");

        for(int i = 2 ; i <= 100 ; i++) {
            fac = fac.multiply(new BigInteger(Integer.toString(i)));
        }

        logger.info(fac.toString());

        String s = fac.toString();

        long sum = 0;

        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            long l = Long.parseLong(Character.toString(c));
            sum += l;

        }

        logger.info(Long.toString(sum));
    }

}
