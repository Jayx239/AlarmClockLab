package interfaces;

public interface ITime {
	// Constant Attributes
	int SECONDS_PER_MINUTE = 60;
	int MINUTES_PER_HOUR = 60;
	int HOURS_PER_DAY = 24;
	int MINUTES_PER_SNOOZE = 9;
	
	int getSecond();
	int getMinute();
	int getHour();
	void setSeconds(int seconds);
	void setMinute(int minutes);
	void setHour(int hours);
	void printTime();
	
}
