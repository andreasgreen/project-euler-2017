package gee;

import java.util.*;
import java.util.logging.Logger;

/**
 * Created by andreas on 2018-02-27.
 */
public class Fraction {
    private static final Logger logger = Logger.getAnonymousLogger();

    private final long numerator;
    private final long denominator;

    public Fraction(long numerator, long denominator) {
        if(denominator == 0) {
            throw new IllegalArgumentException();
        }

        this.denominator = denominator;
        this.numerator = numerator;
    }


    public boolean isProblem33Simplifiable() {

        if(numerator % 10 == 0 && denominator % 10 == 0) {
            return false;
        }

        if(numerator == denominator) {
            return false;
        }

        String den = Long.toString(getDenominator());
        String num = Long.toString(getNumerator());

        return den.contains(Character.toString(num.charAt(0))) ||
                den.contains(Character.toString(num.charAt(1)));

    }

    public Fraction getProblem33SimplifiedForm() {

        if(!isProblem33Simplifiable()) {
            return this;
        } else {
            String den = Long.toString(getDenominator());
            String num = Long.toString(getNumerator());

            //logger.info("Looking at " + this.toString());
            long n, d;
            if(den.contains(Character.toString(num.charAt(0)))) {
                n = Long.parseLong(num.substring(1));
                d = Long.parseLong(den.replaceFirst(Character.toString(num.charAt(0)), ""));
            } else {
                n = Long.parseLong(Character.toString(num.charAt(0)));
                d = Long.parseLong(den.replaceFirst(Character.toString(num.charAt(1)), ""));
            }

            return new Fraction(n, d);

        }

    }

    public long getDenominator() {
        return denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public int getGCD() {
        List<Integer> numCands = new ArrayList<>();
        List<Integer> denCands = new ArrayList<>();


        for (int i = 1; i < getNumerator() + 1 ; i++) {
            if(getNumerator() % i == 0) {
                numCands.add(i);
            }
        }

        for (int i = 1; i < getDenominator() + 1 ; i++) {
            if(getDenominator() % i == 0) {
                denCands.add(i);
            }
        }

        numCands.retainAll(denCands);

        Collections.sort(numCands);

        //logger.info("Candidates " + numCands);

        if(numCands.size() > 0) {
            return numCands.get(numCands.size()-1);
        } else {
            return 0;
        }
    }

    public Fraction reduce() {

        int gdc = getGCD();

        if(gdc == 0) {
            return new Fraction(getNumerator(), getDenominator());
        } else {
            long newNum = getNumerator() / gdc;
            long newDen = getDenominator() / gdc;
            return new Fraction(newNum, newDen);
        }
    }

    @Override
    public String toString() {
        return "Fraction " + numerator + " / " + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fraction f = (Fraction) obj;
        return numerator == f.getNumerator() && denominator == f.getDenominator();
    }
}
