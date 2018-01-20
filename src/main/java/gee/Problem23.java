package gee;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;


public class Problem23 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {

        // Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
        // it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers

        List<Long> abundant = new ArrayList<>();

        // find abundant numbers

        for (long i = 0; i <= 28123 ; i++) {
            if(isAbundant(i)) {
                abundant.add(i);
            }
        }

        logger.info(abundant.toString());

        long notSum = 0;

        for (long i = 0; i <= 28123 ; i++) {

            List<Long> subList = getSubList(i, abundant);

            boolean could = false;
            outerloop:
            for (int j = 0; j < subList.size(); j++) {
                for (int k = 0; k < subList.size(); k++) {

                    long var1 = subList.get(j);
                    long var2 = subList.get(k);

                    if(var1 + var2 == i) {
                        // could write i as sum of abundant numbers
                        //logger.info(var1 + " + " + var2 + " = " + i );
                        could = true;
                        break outerloop;
                    }
                }
            }
            // couldn't write as sum of abundant numbers
           // logger.info("Couldn't write " + i);
            if(!could) {
                notSum += i;
            }

        }

        logger.info("not sum " + notSum);

    }

    private static List<Long> getSubList(long number, List<Long> abundant) {
        List<Long> list = new ArrayList<>();
        for(Long l : abundant) {
            if(l < number) {
                list.add(l);
            } else {
                break;
            }
        }

        return list;
    }

    private static boolean isAbundant(long l) {
        long divSum = Common.getProperDivisorsSum(l);
        return divSum > l;
    }

}
