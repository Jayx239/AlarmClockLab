package test;
import static org.junit.Assert.*;

import org.junit.*;

import clock.AlarmClock;
import clock.Time;
public class AlarmClockTest {

	@Test
	public void testAlarmClockRadioTick() {
		AlarmClock alarmClock = new AlarmClock(12,2,46);
		
		assertEquals(46, alarmClock.getSecond());
		assertEquals(2, alarmClock.getMinute());
		assertEquals(12, alarmClock.getHour());
		
		
		alarmClock.tick();
		assertEquals(47, alarmClock.getSecond());
		assertEquals(2, alarmClock.getMinute());
		assertEquals(12, alarmClock.getHour());
		
	}
	
	@Test
	public void testAlarmClockAlarm() {
		AlarmClock alarmClock = new AlarmClock(12,2,46);
		
		alarmClock.setAlarm(new Time(12,2,48));
		
	}
}
