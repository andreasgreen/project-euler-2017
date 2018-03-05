package gee;

import java.io.IOException;
import java.util.logging.Logger;


public class Problem40 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        //d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
        //      0.123456789101112131415161718192021...


        long d1 = 1;
        long d10 = 1;
        long d100 = 5;
        long d1000 = 3;
        long d10000 = 7;
        long d100000 = 2;
        long d1000000 = 1;


        logger.info(""+d1*d10*d100*d1000*d10000*d100000*d1000000);

      //  dummyCompare(2);

        String s = "";
        int start = 100000;
        int end = start*10;
        int correctedIdx = end - (488889);

        /*for (int i = start; i < correctedIdx + 10000; i++) {
            s += i;
            if(i%10000 == 0) {
                logger.info("" + i);
            }
        }*/

        logger.info("Corrected Idx " + correctedIdx);


        logger.info("Real value " + s.charAt(correctedIdx-1) + " -- " + s.substring(correctedIdx-2, correctedIdx+2));

       // dummyCompare(end);



        //printIndexes();

    }

    private static void dummyCompare(int idx) {
        String s = "";
        for (int i = 1; i < 40000; i++) {
            s += i;
        }

        //logger.info("Got in dummy compare " + s.charAt(idx) + " -- " + s.substring(idx-10, idx+10));
        logger.info("Got in dummy compare " + s.charAt(idx-1));


    }

    private static void printIndexes() {
        int idx = 0;
        int spaceTaken = 0;
        for (int i = 0; i < 8; i++) {

            int powerIdx = (int) Math.pow(10,i);

            //logger.info("i: " + i + "powerIdx" + powerIdx );

            int nrNumbers = powerIdx*9;
            int nrCharacters = Integer.toString(powerIdx).length();

            int localSpaceTaken = nrNumbers*nrCharacters;

            spaceTaken = spaceTaken + localSpaceTaken;

            idx = spaceTaken;
            int nextPowerIdx = (int) Math.pow(10,i+1);
            logger.info("power of " + (nextPowerIdx) + " starts at idx " + idx);
            //  "i=" + i + " powerIdx= " + powerIdx + " antal tal i serie " + nrNumbers +  " antal tecken i varje " + nrCharacters + " gives local space taken " + localSpaceTaken);

        }
    }


}
