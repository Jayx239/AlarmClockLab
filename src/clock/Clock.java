package clock;
import interfaces.IClock;
import interfaces.ITime;


public class Clock implements IClock, ITime{

	public Clock(int hour, int minute, int seconds) {
		clockTime = new Time(hour,minute,seconds);
	}
	
	private Time clockTime;
	
	public Time getTime() {
		return clockTime;
	}
	
	public void setTime(Time time) {
		this.clockTime = time;
	}
	
	public void tick() {
		this.clockTime.tick();
	}

	@Override
	public int getSecond() {
		return clockTime.getSecond();
	}

	@Override
	public int getMinute() {
		// TODO Auto-generated method stub
		return clockTime.getMinute();
	}

	@Override
	public int getHour() {
		return clockTime.getHour();
	}

	@Override
	public void setSeconds(int seconds) {
		clockTime.setSeconds(seconds);
	}

	@Override
	public void setMinute(int minutes) {
		clockTime.setMinute(minutes);
		
	}

	@Override
	public void setHour(int hours) {
		clockTime.setHour(hours);
		
	}

	@Override
	public void printTime() {
		clockTime.printTime();
	}
	
}
