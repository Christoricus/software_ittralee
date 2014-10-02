/** models a cartoon rabbit */
public class Rabbit{
	private String name;
	private int size;
	
	/** when a rabbit hugs a bear, the bear gets happier */
	public void hug(Bear b){
		b.makeHappier(3);
	}
	
	/** 2-arg constructor */
	public Rabbit(String name, int size){
		setName(name);
	  	setSize(size);
	}
	
	/** no-args constructor */
	public Rabbit(){
		this("Noname",0);
	}
	
	/** accessor for name attribute */
	public String getName(){
		return name;
	}
	
	public int getSize(){
		return size;
	}
	
	public String toString(){
		return "Rabbit " + getName() + " size " + getSize();
	}
	/** mutator for name */
	public void setName(String name){
		this.name = name;
	}
	/** mutator for size */
	public void setSize(int size){
		if (size >= 0 )
			this.size = size;
	}
}