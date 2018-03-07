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

    public static boolean isPalindromic(String s) {

        if(s == null || "".equals(s)) {
            return false;
        }

        String rev = getReverseString(s);

        return s.equals(rev);

    }

    public static String getReverseString(String s) {
        if(s == null || "".equals(s)) {
            return s;
        }

        String rev = "";

        for(int i = s.length() - 1 ; i >= 0 ; i--) {
            rev += s.charAt(i);
        }

        return rev;

    }

    public static String getBinaryString(long l) {
        return Long.toBinaryString(l);
    }

    public static boolean isPandigital(long number, int end) {
        return isPandigital(number, end, 1);
    }

    public static boolean isPandigital(long number, int end, int start) {
        String s = Long.toString(number);

        if(s.length() != (end-start)+1) {
            return false;
        }

        for(int i = start ; i <= end ; i++) {
            if(!s.contains(Integer.toString(i))) {
                return false;
            } else {
                int idx = s.indexOf(Integer.toString(i));
                s = s.substring(0, idx) + s.substring(idx+1);
            }
        }

        return s.length() == 0;

    }


}
