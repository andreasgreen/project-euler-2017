package gee;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;


public class Problem47 {
    private static final Logger logger = Logger.getAnonymousLogger();


    public static void main(String[] args) throws IOException {
        long l = 647;
        Boolean[] arr = new Boolean[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = false;
        }

        while (!found(arr)) {
            List<Long> factors = Common.getPrimeFactors(l);
            Set<Long> sFactors = new HashSet<>(factors);
            shift(arr, sFactors.size() == 4);
            l++;
        }

        logger.info((l-4) + " -> " + (l-1));

        //INFO: 134043 -> 134046

       /* List<Long> factors = Common.getPrimeFactors(134046);
        Set<Long> sFactors = new HashSet<>(factors);

        logger.info("factors " + factors);
        logger.info("sFactors " + sFactors);*/


    }

    private static void shift(Boolean[] arr, boolean b) {
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = b;
    }

    private static boolean found(Boolean[] arr) {
        for (Boolean aBoolean : arr) {
            if(!aBoolean) {
                return false;
            }
        }
        return true;
    }


}
