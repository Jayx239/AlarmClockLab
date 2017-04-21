package interfaces;
import clock.Time;


public interface IClock {
	
	int MAX_SOUND_LEVEL = 10;
	int MIN_SOUND_LEVEL = 0;
	
	
	// Display methods
	void printTime();
	Time getTime();
	void setTime(Time time);
	
	
}
