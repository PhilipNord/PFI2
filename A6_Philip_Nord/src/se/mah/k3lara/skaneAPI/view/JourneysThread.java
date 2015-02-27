package se.mah.k3lara.skaneAPI.view;

import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class JourneysThread  extends Thread{
	
	private Parser parser;
	private SearchJourneyGUI gui;
	
	public JourneysThread( Parser pars, SearchJourneyGUI sjgui ){
		
		this.parser = pars;
		this.gui = sjgui;
				
	}
	
	public void run(){
		
		
		gui.searchResultJourneyTextArea.setText(null);
		String searchURL = Constants.getURL(gui.searchFieldFrom.getText(), gui.searchFieldTo.getText(), 1);
		
		
		Journeys journeys = Parser.getJourneys(searchURL);
		for (Journey journey : journeys.getJourneys()) {
			gui.searchResultJourneyTextArea.setText(null);
			gui.searchResultJourneyTextArea.append(journey.getStartStation()+" - " +journey.getEndStation() + "\n" );
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
			gui.searchResultJourneyTextArea.append("Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. \nAnd it is "+journey.getDepTimeDeviation()+" min late");
		}
	}		
}
