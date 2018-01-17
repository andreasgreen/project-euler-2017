package gee;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class Problem18And67 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        Path p = Paths.get("src/resources/problem67.txt");
        List<String> allLines = Files.readAllLines(p, StandardCharsets.UTF_8);

      //  print(allLines);

        List<List<Integer>> theRest = new ArrayList<>();

        for(String s : allLines) {
            theRest.add(getList(s.split(" ")));
        }

        while (theRest.size() > 1) {
            List<Integer> lastRow = theRest.get(theRest.size()-1);
            List<Integer> nextToLastRow = theRest.get(theRest.size()-2);

            //logger.info(lastRow.toString());

            List<Integer> newRow = new ArrayList<>();

            for(int idx = 0 ; idx < nextToLastRow.size() ; idx++) {
                int val = nextToLastRow.get(idx);
                int choice1 = lastRow.get(idx);
                int choice2 = lastRow.get(idx+1);

                if(choice1 > choice2) {
                    newRow.add(val + choice1);
                } else {
                    newRow.add(val + choice2);
                }
            }

            logger.info("new row " + newRow);

            // remove last line
            theRest.remove(theRest.size()-1);
            //replace last line
            theRest.set(theRest.size()-1, newRow);

        }

        //initial greedy approach, won't work..
        // in my structure i can go to same index or index + 1;


        /*
        long sum = 0;
        int idx = -1;

        String path = "";

        for(String s : lines) {
            String[] arr = s.split(" ");
            List<Integer> l = getList(arr);

            if(idx == -1) {
                // first row
                int i = l.get(0);
                idx = 0;
                sum = i;
                path += i + " -> ";
            } else {
                // all the rest
                int choice1 = l.get(idx);
                int choice2 = l.get(idx + 1);

                idx = (choice1 > choice2) ? idx : idx + 1;

                sum += (choice1 > choice2) ? choice1 : choice2;

                path += l.get(idx) + " -> ";
                //logger.info("Between " + choice1 + " and " + choice2 + " choose the one on idx " + idx);


            }
        }

        logger.info(path);
        logger.info("Sum " + sum);*/
    }

    private static List<Integer> getList(String[] arr) {
        List<Integer> list = new ArrayList<>();

        for(String s : arr) {
            int i = Integer.parseInt(s);
            list.add(i);
        }

        return list;
    }




}
