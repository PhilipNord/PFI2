import java.util.Calendar;	

public class ClockThread extends Thread{

	private ClockInterface ci;
	public ClockThread(ClockInterface ci){
		this.ci = ci;
		
	}
	
@Override
	public void run(){
		
		while(true){
			Calendar calendar = Calendar.getInstance();
			int currHours = calendar.get(Calendar.HOUR_OF_DAY);
			int currMinutes = calendar.get(Calendar.MINUTE);		
			int currSeconds = calendar.get(Calendar.SECOND);

			ci.update(currHours, currMinutes, currSeconds);
			System.out.println(currHours);

			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}



}