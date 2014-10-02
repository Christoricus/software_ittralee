//Sam Dowling
public class Flipping {

    public static void main(String[] args){
        int[] x = {1,4,6,2,9}; //Example given
        int j=0;
        System.out.println("The K values:");
        while(!isOrdered(x)) {
            int largestIndex = 0;
            int largestNum = 0;
            for (int i = 0; i < x.length-j; i++) {
                if (x[i] > largestNum) {
                    largestIndex = i+1;
                    largestNum = x[i];
                }
            }
            if(largestIndex==1)
            	x = flip(x,x.length-j);
            else if(largestIndex!=(j+1)&&largestIndex!=x.length)
            	x = flip(flip(x,largestIndex),x.length-j);    
            j++;
        }
        printArray(x);
    }

    public static void printArray(int[] x){
    	System.out.println("\n\nThe Sorted Array:");
            for(int i=0;i<x.length;i++)
                System.out.print(x[i]+" ");
        System.out.print("\n");
    }
    
    public static int[] flip(int[] x,int k){
    	System.out.print(k+" ");
    	
        for(int i=0;i<k/2;i++) {
            int temp = x[i];
            x[i] = x[k-i-1];
            x[k-i-1] = temp;
        }
        return x;
    }

    public static boolean isOrdered(int[] x){
        for(int i=0;i<x.length-1;i++)
            if(x[i]>x[i+1])
                return false;
        return true;
    }
}
