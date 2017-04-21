package radio;

public class RadioStation {
	RadioStation(String stationName, double frequency) {
		this.frequency = frequency;
		this.name = stationName;
	}
	
	private String name;
	private double frequency;
	
	public String getName() {
		return name;
	}
	
	public double getFrequency() {
		return frequency;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	
	public void prettyPrint() {
		System.out.println(this.frequency + " : " + this.name);
	}
	
}
