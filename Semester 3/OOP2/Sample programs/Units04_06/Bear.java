/** models a cartoon bear, with variable happiness level */
public class Bear {
	private String name;
	private int size;
	private int happiness;
	
	/** 3-arg constructor 
	 *@param name The bear's name
	 *@param size The size of the bear, anything from 1 to 5 
	 *@param happiness The bear's level of happiness, between 1 and 10
	 **/
	public Bear(String name, int size, int happiness){
		setName(name);
		setSize(size);
		setHappiness(happiness);
	}
	
	public Bear(){
		this("No name", 0,5);
	}
	
	/** accessor for name attribute */
	public String getName(){
		return name;
	}
	
	/** accessor for size */
	public int getSize(){
		return size;
	}
	
	/** accessor for happiness */
	public int getHappiness() {
		return happiness;
	}
	
	/** bears can get happier */
	public void makeHappier(int extraHappiness){
		happiness += extraHappiness;
	}
	
	public String toString(){
		return "Bear " + getName() + " size " + getSize() + " happiness " + getHappiness();
	}
	
	/** mutator method for name attribute*/
	public void setName(String name){
		this.name = name;
	}
	
	/** mutator for size attribute */
	public void setSize(int size){
		if (size >= 0 )
			this.size = size;
	}
	
	public void setHappiness (int happiness){
		if (happiness >=0)
			this.happiness = happiness;
	}
}