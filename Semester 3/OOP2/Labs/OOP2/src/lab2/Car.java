package lab2;

public class Car {
	private String brand;
	private String model;
	private String fuelType;
	private String transmission;
	private String colour;
	private double price;
	private double engineCapacity;
	
	public Car() {
		this("Unknown", "Unknown", "Unknown", "Unknown", "Unknown", 0.0, 0.0);
	}
	
	public Car(String brand, String model, String fuelType, String transmission, 
			String colour, double price, double engineCapacity) {
		
		setBrand(brand);
		setModel(model);
		setFuelType(fuelType);
		setTransmission(transmission);
		setColour(colour);
		setPrice(price);
		setEngineCapacity(engineCapacity);
	}
	
	//Setting the attributes
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	//Getting the attributes
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getFuelType() {
		return fuelType;
	}
	
	public String getTransmission() {
		return transmission;
	}
	
	public String getColour() {
		return colour;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getEngineCapacity() {
		return engineCapacity;
	}
}
