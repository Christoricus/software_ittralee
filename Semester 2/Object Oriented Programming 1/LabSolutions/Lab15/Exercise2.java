//Exercise2.java
/*This file contains a user-defined class called Exercise2 which is designed
 *to store the current, maximum and minimum temperatures for a particular day. This 
 *version modifies the toString() method so that it refers to the accessor methods*/

public class Exercise2
{
    private int maxTemp;
    private int minTemp;  
    private int currentTemp; 

    public Exercise2()
    {
        maxTemp = Integer.MIN_VALUE;
        minTemp = Integer.MAX_VALUE;
        currentTemp = 0;
    }

    public Exercise2(int cTemp)
    {
        currentTemp = cTemp;
        maxTemp = cTemp;
        minTemp = cTemp;
    }

    public void setTemperature(int cTemp)
    {
        currentTemp = cTemp;
        updateMaxMinTemp(currentTemp);
    }

   
    private void updateMaxMinTemp(int currentTemperature)
    {
        if (currentTemp > maxTemp)
            maxTemp = currentTemp;
            
        if (currentTemp < minTemp)
            minTemp = currentTemp;
    }

    public int getCurrentTemperature()
    {
        return currentTemp;
    }

 
    public int getMaxTemperature()
    {
        return maxTemp;
    }

    public int getMinTemperature()
    {
        return minTemp;
    }
   
    public String toString()
    {
        return "Current temperature: " + getCurrentTemperature() + "\n" +
               "Maximum temperature: " + getMaxTemperature() + "\n" +
               "Minimum temperature: " + getMinTemperature() + "\n";
    }
    
}

