package clock;
import interfaces.ITime;


public class Time implements ITime {

	public Time() {
		
	}
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time(int hour, int minute, int second) {
		this.hours = hour;
		this.minutes = minute;
		this.seconds = second;
	}
	
	@Override
	public int getSecond() {
		return seconds;
	}

	@Override
	public int getMinute() {
		return minutes;
	}

	@Override
	public int getHour() {
		return hours;
	}

	@Override
	public void setSeconds(int seconds) {
		this.seconds = seconds;
		
	}

	@Override
	public void setMinute(int minute) {
		this.minutes = minute;
		
	}

	@Override
	public void setHour(int hour) {
		this.hours = hour;
		
	}
	
	public void tick() {
		this.seconds++;
		
		if(this.seconds >= SECONDS_PER_MINUTE) {
			this.minutes++;
			this.seconds = 0;
		}
		
		if(this.minutes >= MINUTES_PER_HOUR) {
			this.hours++;
			this.minutes = 0;
		}
		
		if(this.hours >= HOURS_PER_DAY) {
			this.hours = 0;
		}
	}

	@Override
	public void printTime() {
		
		String ampm = hours >= 12 ? "PM" : "AM";
		int adjustedHour = this.hours > 12 ? this.hours - 12 : this.hours;
		if(this.hours == 0)
			adjustedHour = 12;
		System.out.println(Integer.toString(adjustedHour) + " : " + Integer.toString(minutes) + " : " + Integer.toString(seconds) + " " + ampm);
		
	}
	
	public boolean equals(Time compTime) {
		if(compTime.getHour() == this.getHour() && compTime.getMinute() == this.getMinute() && compTime.getSecond() == this.getSecond())
			return true;
		return false;
	}

}
