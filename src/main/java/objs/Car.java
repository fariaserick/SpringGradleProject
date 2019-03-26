package objs;

/**
 * @author Erick
 *
 */
public class Car {
	
	private String make;
	private int year;
	private int doors;
	private int wheels;
	private String model;
	private String enginee;
	private String colour;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("carrera") || validModel.equals("commodoro")) {
			this.model = model;
		}else {
			this.model = "Unknown";
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getEnginee() {
		return enginee;
	}
	public void setEnginee(String enginee) {
		this.enginee = enginee;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
