

public class ClockLogic implements ClockInterface {

	private DigitalClockGUI clockGUI;
	private int alarmHour;
	private int alarmMinute;

	public ClockLogic(DigitalClockGUI clockGUI) {
		this.clockGUI = clockGUI;
		
		Thread t = new ClockThread(this);
		t.run();
	}

	public void setAlarm(int currHours, int currMinutes) {

		this.alarmHour = currHours;
		this.alarmMinute = currMinutes;
		clockGUI.setAlarmText(String.valueOf(alarmHour) + ":" + String.valueOf(alarmMinute));
		

	}

	public void clearAlram() {

	}

	public void update(int currHours, int currMinutes, int currSeconds) {

		clockGUI.setTimeOnLabel(String.valueOf(currHours) + ":"
				+ String.valueOf(currMinutes) + ":" + String.valueOf(currSeconds));

	}
}