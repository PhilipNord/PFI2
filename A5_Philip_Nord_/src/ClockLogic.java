
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
		String checkAlarmHour;
		String checkAlarmMinute;
		if (currHours < 10) {
			checkAlarmHour = "0" + String.valueOf(alarmHour);
		} else {
			checkAlarmHour = String.valueOf(alarmHour);
		}
		if (currMinutes < 10) {
			checkAlarmMinute = "0" + String.valueOf(alarmMinute);
		} else {
			checkAlarmMinute = String.valueOf(alarmMinute);

		}

		clockGUI.setAlarmText(checkAlarmHour + ":" + checkAlarmMinute);
		//clockGUI.lblLblalramicon.setVisible(true);
	}

	public void clearAlram() {

		alarmHour = 100;
		alarmMinute = 100;

	}

	@Override
	public void update(int currHours, int currMinutes, int currSeconds) {

		String checkTime;
		String checkMinute;
		String checkSecond;

		if (currMinutes < 10) {
			checkMinute = "0" + String.valueOf(currMinutes);
		} else {
			checkMinute = String.valueOf(currMinutes);
		}

		if (currSeconds < 10) {
			checkSecond = "0" + String.valueOf(currSeconds);
		} else {
			checkSecond = String.valueOf(currSeconds);
		}

		checkTime = String.valueOf(currHours) + ":" + checkMinute + ":"
				+ checkSecond;

		clockGUI.setTimeOnLabel(checkTime);

		if (this.alarmHour == currHours && this.alarmMinute == currMinutes) {
			System.out.println("Hejsan hoppsan, nu ringer det!");
			clockGUI.alarm(true);
		}
		
	}
	
	
}
