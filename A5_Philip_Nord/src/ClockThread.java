import java.util.GregorianCalendar;
import java.util.Thread;	

public class ClockThread extends Thread{

	private ClockInterface ci ;
	GregorianCalendar calendar = new GregorianCalendar();
	Thread runningTime  = new Thread();


public ClockThread(ClockInterface ci){
	
	this.ci = ci;
	}

public void run(){
	
	try{
		while(true){
			
			int currHours = calendar.get(GregorianCalendar.HOUR_OF_DAY);
			int currMinutes = calendar.get(GregorianCalendar.MINUTE);		
			int currSeconds = calendar.get(GregorianCalendar.SECOND);
			
			
			sleep(900);
		}
	} catch (InterruptedExeception e)
}



}