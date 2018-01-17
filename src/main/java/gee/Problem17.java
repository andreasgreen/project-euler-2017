package gee;

import java.io.IOException;
import java.math.BigInteger;
import java.util.logging.Logger;


public class Problem17 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        long sum = 0;

        for(int i = 1 ; i <= 1000 ; i++) {
            String s = getWording(i);
            logger.info(s + " [" + i + "]");
            if(s == null) {
                logger.warning("Got null for " + i);
            } else {
                s = s.replace(" ", "");
                s = s.replace("-", "");
                sum += s.length();
            }

        }

        logger.info("Sum " + sum);
    }

    private static String getWording(int n) {
        if(n <= 20) {
            switch(n) {
                case 0 : return "";
                case 1 : return "one";
                case 2 : return "two";
                case 3 : return "three";
                case 4 : return "four";
                case 5 : return "five";
                case 6 : return "six";
                case 7 : return "seven";
                case 8 : return "eight";
                case 9 : return "nine";
                case 10 : return "ten";
                case 11 : return "eleven";
                case 12 : return "twelve";
                case 13 : return "thirteen";
                case 14 : return "fourteen";
                case 15 : return "fifteen";
                case 16 : return "sixteen";
                case 17 : return "seventeen";
                case 18 : return "eighteen";
                case 19 : return "nineteen";
                case 20 : return "twenty";
            }
        } else if(n < 100) {
            String s = Integer.toString(n);
            int ten = Integer.parseInt(Character.toString(s.charAt(0)));
            int single = Integer.parseInt(Character.toString(s.charAt(1)));

            switch (ten) {
                case 2 : return "twenty " + getWording(single);
                case 3 : return "thirty " + getWording(single);
                case 4 : return "forty " + getWording(single);
                case 5 : return "fifty " + getWording(single);
                case 6 : return "sixty " + getWording(single);
                case 7 : return "seventy " + getWording(single);
                case 8 : return "eighty " + getWording(single);
                case 9 : return "ninety " + getWording(single);
            }
        } else if(n < 1000) {
            String s = Integer.toString(n);
            int hundred = Integer.parseInt(Character.toString(s.charAt(0)));
            int ten = Integer.parseInt(s.substring(1));

            if(ten == 0) {
                return getWording(hundred) + " hundred";
            } else {
                return getWording(hundred) + " hundred and " + getWording(ten);
            }



        } else {
            return "one thousand";
        }

        return null;
    }

}
