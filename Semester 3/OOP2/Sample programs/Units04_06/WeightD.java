/** Metric version of the Weight class
 *  Written with different private attributes and internal methods
 *  But the same public interface
 */
public class WeightD {

    private double kg;
    
    public double getKilos(){
		return kg;
	}
	  	
	public int getStones() { 
		return (int) getUSWeight() / 14; // entire stones
    }
	
	public int getPounds() { 
	    return (int) getUSWeight() % 14; // residual lbs
	}
	
	public void setWeight (double kg){
	  if (kg >=0)
		this.kg = kg;
	}
	
	
	public void setWeight(int stones, int pounds) {
	  if (stones >=0 && pounds >=0 && pounds <=14)
		  kg = (stones * 14 + pounds) / 2.2;
	}
	
		
	public WeightD() {
		this(0,0);
	}
	
	public WeightD(int stones,int pounds) {
		setWeight(stones,pounds);
	}

    public WeightD(double kg){
    	setWeight(kg);
    }
		
	// 
	public double getUSWeight() {
		return (int) (kg * 2.2);
	}

	// current version gives weight in stones and lbs
	public String getStonesPounds() {
			return getStones() + " st " +  getPounds() + " lbs";
	}
	
	public String toString() {
		return getKilos() + " kg";
	}
	
}