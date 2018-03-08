package gee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;


public class Problem45 {
    private static final Logger logger = Logger.getAnonymousLogger();


    public static void main(String[] args) throws IOException {

        long l = 286;
        boolean found = false;

        while (!found) {
            long tri = Common.getTriangleNumber(l);
            l++;
            if(isPentagonal(tri, l) && isHexagonal(tri, l)) {
                logger.info("Found: " + l + " " + tri );
                found = true;
            }
        }

    }

    private static boolean isPentagonal(long tri, long l) {
        //l is index in tri-series, penta index will be lower
        for (int i = 0; i < l; i++) {
            long penta = Common.getPentagonNumber(i);
            if(penta == tri) {
                return true;
            } else if(penta > tri) {
                break;
            }
        }

        return false;
    }

    private static boolean isHexagonal(long tri, long l) {
        //l is index in tri-series, hexa index will be lower
        for (int i = 0; i < l; i++) {
            long hexa = Common.getHexagonNumber(i);
            if(hexa == tri) {
                return true;
            } else if(hexa > tri) {
                break;
            }
        }

        return false;
    }


}
