/**
 * Created by t00168198 on 27/01/14.
 */
public class T00168198Lab01 {
    public static void main(String[] args) {

        byte minValue = 0, maxValue = 1;

        long start_time = System.nanoTime();
        while(minValue < maxValue)
        {
            maxValue++;
            minValue++;

        }
        long end_time = System.nanoTime();
        System.out.println("Minimum Value: " + minValue + "\nMaximum Value: " + maxValue+"\nTime taken (ms) "+(end_time-start_time)/1e6);
    	
    	
    	
    	
       /* for (short i = 0; i < 256; i++) {
            System.out.println("i= " + i + " " + (byte) i);
        }
        System.out.println((byte) 128);*/
    }
}
