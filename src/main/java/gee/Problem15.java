package gee;

import java.io.IOException;
import java.util.logging.Logger;


public class Problem15 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        /*
            The number of lattice paths from (0,0) -> (n,k) is
             the binomial coefficient ( n + k / n)

             in this case (20 + 20 / 20)
             =
             40 / 20
             =
             40! / (20!*(40-20)!)
             =
             40! / 20! * 20 !
             =

             40 * 39 * ... 20 * 19  18
             /
             20 * 19 .. * 20 * 19

             =
             40 * 39 * 38 * 37 * 36 * 35 * 34 * 33 * 32 * 31 * 21
             /
             20 * 19 .. * 1
             =

             2 * 39 * 2 * 37 * 2 * 35 * 2 * 33 * 2 * 31 * 2 * 29 * 2 * 27 * 2 * 25 * 2 * 23 * 2 * 21
              /
              10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
              =

                * 39 *  * 37 *  * 35 *  * 33 * 2 * 31 * 2 * 29 * 2 * 3 * 2 * 5 * 2 * 23 * 2 * 3
              /
              10 *  *  * 6 * 4 * 3 *  * 1

              137846528820



        * */
    }




}
