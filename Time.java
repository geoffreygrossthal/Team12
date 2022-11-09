package CSE360_SunDevilPizza;



public class Time {
	
	//24hr time format
	private int hour;	//0-23
	private int minute;	//0-59
	
	public Time(int h, int m) {
		
		hour = h;
		minute = m;
		
	}

	public void setTime(int h, int m) {
		
		hour = ((h >= 0)&&(h < 24)? h : 0);
		minute = ((m >= 0)&&(m < 60)? m : 0);
		
	}
	
	
	public int getHour() {
		
		return hour;
	}
	
	public int getMinute() {
		
		return minute;
	}
	
	
	public String toUniversalString() {
		
		//convert to HH:MM
		return String.format("%02d:%02d", hour, minute);
	}
	
	public String toString() {
		
		return String.format( "%d:%02d%s",
				((getHour() == 0 || getHour() == 12)? 12: getHour() % 12 ),
				getMinute(), (getHour() < 12? "AM" : "PM"));
				
	}
	
	
}
