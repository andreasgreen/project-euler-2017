package gee;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class Problem19 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        LocalDate start = LocalDate.parse("1901-01-01");
        LocalDate end = LocalDate.parse("2001-01-01");

        int cnt = 0;

        while (start.isBefore(end)) {
            if(start.getDayOfWeek() == DayOfWeek.SUNDAY && start.getDayOfMonth() == 1) {
                cnt++;
                logger.info(start.toString() + " " + start.getDayOfWeek());
            }

            start = start.plusDays(1);
        }

        logger.info("cnt " + cnt);
    }

}
