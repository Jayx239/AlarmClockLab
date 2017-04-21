package clock;
import radio.Radio;
import radio.RadioStation;
import interfaces.IAlarm;
import interfaces.IRadio;


public class AlarmClock extends Clock implements IAlarm ,IRadio{

	public AlarmClock(int hour, int minute, int seconds) {
		super(hour, minute, seconds);
		alarmSet = false;
		snoozeTimeRemaining = 0;
		alarmTriggered = false;
		musicAlarm = false;
		radio = new Radio();
	}
	
	private Time alarmTime;
	private boolean alarmSet;
	private boolean alarmTriggered;
	private int snoozeTimeRemaining;
	private boolean musicAlarm;
	Radio radio;
	

	public void setAlarm(Time time) {
		this.alarmTime = time;
		alarmSet = true;
		snoozeTimeRemaining = 0;
	}

	public void shutOffAlarm() {
		alarmSet = false;
		alarmTriggered = false;
		snoozeTimeRemaining = 0;
	}

	public void snooze() {
		snoozeTimeRemaining = MAX_SNOOZE_TIME*SECONDS_PER_MINUTE;
	}

	public void triggerAlarm() {
		if(alarmTriggered && snoozeTimeRemaining <= 0) {
			if(musicAlarm) {
				System.out.println("Alarm Music playing from ");
				radio.displayRadioStation();
			}
			else
				System.out.println("Buzz Buzz Buzz");
			
			System.out.println("Volume: " + radio.getVolume());
		}
	}
	
	public void displayAlarmTime() {
		alarmTime.printTime();
	}
	
	public void tick() {
		super.tick();
		
		if(alarmTime == null)
			return;
		
		if(alarmTime.equals(super.getTime()) || (alarmTriggered && snoozeTimeRemaining == 0)) {
			alarmTriggered = true;
			this.triggerAlarm();
		}
		
		if(snoozeTimeRemaining > 0) {
			snoozeTimeRemaining--;
		}
		
	}

	@Override
	public void setVolume(int volume) {
		this.radio.setVolume(volume);
	}

	@Override
	public void turnRadioOn() {
		this.radio.turnRadioOn();
	}

	@Override
	public void turnRadioOff() {
		this.radio.turnRadioOff();
	}

	@Override
	public boolean isRadioOn() {
		return radio.isRadioOn();
	}
	
	@Override
	public void setRadioStation(RadioStation station) {
		this.radio.setRadioStation(station);
	}

	@Override
	public void displayRadioStation() {
		this.radio.displayRadioStation();
		
	}

	@Override
	public RadioStation getRadioStation() {
		return this.radio.getRadioStation();
	}
	
	public void setMusicAlarm(boolean musicOn) {
		musicAlarm = musicOn;
	}
	
	public boolean isMusicAlarmOn() {
		return musicAlarm;
	}

	@Override
	public int getVolume() {
		return radio.getVolume();
	}

	@Override
	public void turnAlarmOn() {
		alarmSet = true;
	}

	@Override
	public boolean isAlarmSet() {
		return alarmSet;
	}


}
