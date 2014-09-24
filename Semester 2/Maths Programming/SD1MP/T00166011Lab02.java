/**
 */
public class T00166011Lab02 {
    public static void main(String[] args) {

        float floatNum = 0.1666666667f;

        System.out.println("\nResult Floats:\n" + floatNum + "\n" + (10*floatNum) +
                "\n" + (100*floatNum) + "\n" + (1000*floatNum) + "\n" + (100000+floatNum) +
                "\n" + (floatNum/10) + "\n" + (floatNum/100) + "\n" + (floatNum/1000) + "\n" +
                (floatNum/10000) + "\n" + (100000+(floatNum/10000)) + "\n\n\nResult Doubles:\n" +
                (double)floatNum + "\n" + (10*(double)floatNum) +
                "\n" + (100*(double)floatNum) + "\n" + (1000*(double)floatNum) + "\n" + (100000+(double)floatNum) +
                "\n" + ((double)floatNum/10) + "\n" + ((double)floatNum/100) + "\n" + ((double)floatNum/1000) + "\n" +
                ((double)floatNum/10000) + "\n" + (100000+((double)floatNum/10000)));

        /* Using floats to round of numbers, a lot of times this rounding off number is
         *  incorrect.  As we can see in the third float below (16.666668), that last digit (8)
         *  is incorrect.
         *
         *  As for using doubles to round off, the case seems to be even worst, another incorrect
         *  answer to a certain point e.g (1.666666716337204), the last few number after the sixth 6 are
         *  incorrect in terms of rounding off.
         */
    }
}