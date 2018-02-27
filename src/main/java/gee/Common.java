package gee;

import java.util.List;

/**
 * Created by andreas on 2017-10-28.
 */
public class Common {

    protected static boolean isEven(long a) {
        return a % 2 == 0;
    }

    protected static boolean isPrime(long n) {

        if (n < 2) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        long sqrtN = (long)Math.sqrt(n)+1;

        for (long i = 6L; i <= sqrtN; i += 6) {
            if (n % (i-1) == 0 || n % (i+1) == 0) {
                return false;
            }
        }

        return true;

    }

    public static long getProperDivisorsSum(long n) {
        long sum = 0;

        for(long l = 1 ; l < n / 2 + 1 ; l++) {
            if(n % l == 0) {
                sum += l;
            }
        }

        return sum;
    }

    public static void getPermutations(String prefix, String s, List<String> permutations) {
        if (s.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < s.length(); i++) {
                String letter = s.substring(i, i + 1);
                String otherLetters = s.substring(0, i) + s.substring(i + 1);
                getPermutations(prefix + letter, otherLetters, permutations);
            }
        }
    }

    public static long getFac(long digit) {
        long prod = 1;

        for (long l = digit; l > 0; l--) {
            prod = prod * l;
        }

        return prod;
    }
}
