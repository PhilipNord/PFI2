import java.util.GregorianCalendar;

public class ClockLogic implements ClockInterface {
	
	private DigitalClockGUI clockGUI;
	private int alarmHour;
	private int alarmMinute;
	GregorianCalendar calendar = new GregorianCalendar();
	
	public ClockLogic(DigitalClockGUI clockGUI){
		
		
	}
	
	public void setAlarm(int hours, int minutes){
		
		this.alarmHour = alarmHour;
		this.alarmMinute = alarmMinute;
		
		
	}
	
	public void clearAlram(){
		
		
		
	}
	

	public void update(int hours, int minutes, int seconds){
		

		GregorianCalendar calendar = new GregorianCalendar();
		
		int currHours = calendar.get(GregorianCalendar.HOUR_OF_DAY);
		int currMinutes = calendar.get(GregorianCalendar.MINUTE);		
		int currSeconds = calendar.get(GregorianCalendar.SECOND);
	}
}
