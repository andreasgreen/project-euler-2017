package gee;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by andreas on 2017-10-28.
 */
public class Problem11 {
    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException {
        Path p = Paths.get("src/resources/problem11.txt");
        List<String> lines = Files.readAllLines(p, StandardCharsets.UTF_8);
        Long[][] matrix = new Long[20][20];
        for(int i = 0 ; i < lines.size() ; i++) {
            String[] chars = lines.get(i).split(" ");
            for(int j = 0 ; j < chars.length ; j++) {
                matrix[i][j] = Long.parseLong(chars[j]);
            }
        }

        long max = 0;

        for(int i = 0 ; i < matrix.length ; i++) {
            for(int j = 0 ; j < matrix[i].length ; j++) {
                //logger.info("Starting with " + matrix[i][j] + "@" + i + " " + j + " current max " + max);
                long l = getDown(i, j, matrix);
                max = Math.max(max, l);
                l = getRight(i, j, matrix);
                max = Math.max(max, l);
                l = getDiagonalLeft(i, j, matrix);
                max = Math.max(max, l);
                l = getDiagonalRight(i, j, matrix);
                max = Math.max(max, l);
            }
        }
        logger.info("Max: " + max);
    }

    private static long getDown(int i, int j, Long[][] matrix) {
        if (i + 3 > matrix.length - 1) {
            return 0;
        } else {
            return matrix[i][j] * matrix[i+1][j] * matrix[i+2][j] * matrix[i+3][j];
        }
    }

    private static long getRight(int i, int j, Long[][] matrix) {
        if (j + 3 > matrix[i].length - 1) {
            return 0;
        } else {
            return matrix[i][j] * matrix[i][j+1] * matrix[i][j+2] * matrix[i][j+3];
        }
    }

    private static long getDiagonalRight(int i, int j, Long[][] matrix) {
        if (i + 3 > matrix.length - 1 || j + 3 > matrix[i].length - 1) {
            return 0;
        } else {
            return matrix[i][j] * matrix[i+1][j+1] * matrix[i+2][j+2] * matrix[i+3][j+3];
        }
    }

    private static long getDiagonalLeft(int i, int j, Long[][] matrix) {
        if (i + 3 > matrix.length - 1 || j - 3 < 0) {
            return 0;
        } else {
            return matrix[i][j] * matrix[i+1][j-1] * matrix[i+2][j-2] * matrix[i+3][j-3];
        }
    }
}
