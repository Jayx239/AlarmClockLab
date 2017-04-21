package radio;
import interfaces.ITime;

import java.util.Scanner;

import clock.AlarmClock;
import clock.Time;


public class RadioTest {
	public static void main(String args[]) {
		AlarmClock alarmClock = new AlarmClock(12,13,54);
		
		alarmClock.printTime();
		alarmClock.setRadioStation(new RadioStation("Radio",104.5));
		
		Scanner reader = new Scanner(System.in);
		String command;
		
		
		alarmClock.setAlarm(new Time(12,14,0));
		
		for(int i=0; i<8; i++) {
			alarmClock.printTime();
			alarmClock.tick();
		}
		alarmClock.snooze();
		
		for(int i=0; i< alarmClock.MAX_SNOOZE_TIME*alarmClock.SECONDS_PER_MINUTE; i++) {
			alarmClock.printTime();
			alarmClock.tick();
		}
		
		alarmClock.printTime();
		alarmClock.tick();
		
		alarmClock.shutOffAlarm();
		alarmClock.printTime();
		
		alarmClock.displayRadioStation();
		alarmClock.setHour(24);
		
		alarmClock.setTime(new Time(23,59,55));
		for(int i=0; i< 5; i++) {
			alarmClock.printTime();
			alarmClock.tick();
		}
		alarmClock.printTime();
		alarmClock.tick();
		
		alarmClock.printTime();
		
		alarmClock.setTime(new Time(11,59,59));
		
		for(int i=0; i< 2; i++) {
			alarmClock.printTime();
			alarmClock.tick();
		}
		alarmClock.setMusicAlarm(true);
		alarmClock.tick();
		
		alarmClock.setVolume(5);
		alarmClock.tick();
		alarmClock.turnRadioOn();
		System.out.println("Is radio on: " + (alarmClock.isRadioOn()));
		alarmClock.turnRadioOff();
		System.out.println("Is radio on: " + (alarmClock.isRadioOn()));
		
		alarmClock.setAlarm(new Time(12,23,23));
		alarmClock.setTime(new Time(12,23,22));
		alarmClock.tick();
		alarmClock.snooze();

		for(int i=0; i< alarmClock.MAX_SNOOZE_TIME*alarmClock.SECONDS_PER_MINUTE; i++) {
			alarmClock.printTime();
			alarmClock.tick();
		}
		
		alarmClock.shutOffAlarm();
		alarmClock.turnAlarmOn();
		
		for(int i =0; i<ITime.HOURS_PER_DAY*ITime.MINUTES_PER_HOUR*ITime.SECONDS_PER_MINUTE - alarmClock.MAX_SNOOZE_TIME*alarmClock.SECONDS_PER_MINUTE;i++) {
			alarmClock.tick();
			alarmClock.printTime();
		}
		alarmClock.tick();
	}
}
