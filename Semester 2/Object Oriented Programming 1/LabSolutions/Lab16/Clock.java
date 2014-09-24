//Clock.java
/*This class emulates the behaviour of a hardware clock. It has three instance 
 *attributes to store hours, minutes, and seconds and various methods to implement 
 *operations on time*/

public class Clock
{
    private int hr;  
    private int min;
    private int sec;

    public Clock()
    {
        setTime(0, 0, 0);
    }

    public Clock(int hours, int minutes, int seconds)
    {
        setTime(hours, minutes, seconds);
    }

    public void setTime(int hours, int minutes, int seconds)
    {
        if (hours >= 0 && hours < 24)
            hr = hours;
        else
            hr = 0;

        if (minutes >= 0 && minutes < 60)
            min = minutes;
        else
            min = 0;

        if (seconds >= 0 && seconds < 60)
            sec = seconds;
        else
            sec = 0;
    } 


    public void setHours(int hours)
    {
        if (hours >= 0 && hours < 24)
            hr = hours;
        else
            hr = 0;
    } 


    public void setMinutes(int minutes)
    {
        if (minutes >= 0 && minutes < 60)
            min = minutes;
        else
            min = 0;
    } 


    public void setSeconds(int seconds)
    {
        if (seconds >= 0 && seconds < 60)
            sec = seconds;
        else
            sec = 0;
    } 

    public int getHours()
    {
        return hr;
    } 

    public int getMinutes()
    {
        return min;
    } 


    public int getSeconds()
    {
        return sec;
    } 

    public void incrementSeconds()
    {
        sec++;

        if (sec > 59)
        {
            sec = 0;
            incrementMinutes(); 
        }
    } 
     
    public void incrementMinutes()
    {
        min++;

        if (min > 59)
        {
            min = 0;
            incrementHours(); 
        }
    } 

 
    public void incrementHours()
    {
        hr++;

        if (hr > 23)
            hr = 0;
    } 


    public boolean equals(Clock otherClock)
    {
         return (hr == otherClock.hr && min == otherClock.min && sec == otherClock.sec);
    } 


    public String toString()
    {
        String str = "";

        if (hr < 10)
             str = "0";
        str = str + hr + ":";

        if (min < 10)
             str = str + "0" ;
        str = str + min + ":";

        if (sec < 10)
             str = str + "0";
        str = str + sec;

        return str;
    } 


    public void makeCopy(Clock otherClock)
    {
        hr = otherClock.hr;
        min = otherClock.min;
        sec = otherClock.sec;
    } 

    public Clock getCopy()
    {
        Clock temp = new Clock(hr, min, sec);

        return temp;
    }
}


