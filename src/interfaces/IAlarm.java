package interfaces;
import clock.Time;


public interface IAlarm {

	int MAX_SNOOZE_TIME = 9;
	
	// Alarm functional methods
	void setAlarm(Time time);
	void shutOffAlarm();
	void turnAlarmOn();
	boolean isAlarmSet();
	void snooze();
	void triggerAlarm();
}
