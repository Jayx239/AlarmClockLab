package interfaces;
import radio.RadioStation;


public interface IRadio {
	void setVolume(int volume);
	int getVolume();
	void turnRadioOn();
	void turnRadioOff();
	boolean isRadioOn();
	void setRadioStation(RadioStation station);
	void displayRadioStation();
	
	RadioStation getRadioStation();
	
}
