package weightpackage;
/** A class to model the weight of a person using stones and lbs
 *  Stored as part of the package 'weightpackage'
 */
public class WeightPackage {

	private int stones;
    private int pounds;
  	
	public int getStones() { return stones; }
	
	public int getPounds() { return pounds; }
	
	public void setWeight(int stones, int pounds) {
		setStones(stones);
		setPounds(pounds);
	}
	
	public void setWeight (double kg){
		int totPounds = (int) (kg * 2.2); // 2.2 lbs in 1 kg
		setStones(totPounds / 14);  // 14 lbs in 1 stone
		setPounds(totPounds % 14);  // % gives the remainder
	}
	
	// internal only, for use in setting the weight
	private void setStones(int stones) { 
		  if(stones>=0)
				this.stones = stones;
		 
	}
	
	// internal only
	private void setPounds(int pounds) { 
		  if(pounds>=0 && pounds <=13)
				this.pounds = pounds;
	
	}
		
	public WeightPackage() {
		this(0,0);
	}
	
	public WeightPackage(int stones,int pounds) {
		setStones(stones);
		setPounds(pounds);
	}

    public WeightPackage (double kg){
    	setWeight(kg);
    }
	
	public double getKilos(){
			//Convert to pounds and then to kilos
		return (stones*14+pounds)/2.2;
	}
	
	public double getUSWeight() {
		return getStones() * 14 + getPounds();
	}

	// current version gives weight in stones and lbs
	public String toString() {
			return getStones()+ " st " +  getPounds() + " lbs";
	}
	
}