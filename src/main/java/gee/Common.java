package gee;

/**
 * Created by andreas on 2017-10-28.
 */
public class Common {

    protected static boolean isEven(long a) {
        return a % 2 == 0;
    }

    protected static boolean isPrime(long a) {
        long ceil = (long) Math.ceil(Math.sqrt(a)) + 1; // verify, took from memory

        if(a == 2) {
            return true;
        }

        if (a % 2 == 0) {
            return false;
        }

        for(long l = 3 ; l < ceil ; l+=2) {
            if (a % l == 0) {
                return false;
            }
        }

        return true;
    }
}
