package radio;
import interfaces.IRadio;


public class Radio implements IRadio{

	public Radio() {
		
	}
	
	private RadioStation currentStation;
	private int volume;
	boolean on;
	
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public int getVolume() {
		return this.volume;
	}
	
	@Override
	public void turnRadioOn() {
		on = true;
	}

	@Override
	public void turnRadioOff() {
		on = false;
	}

	@Override
	public boolean isRadioOn() {
		return this.on;
	}
	
	@Override
	public void setRadioStation(RadioStation station) {
		currentStation = station;
	}

	@Override
	public void displayRadioStation() {
		currentStation.prettyPrint();
	}

	@Override
	public RadioStation getRadioStation() {
		return this.currentStation;
	}



}
