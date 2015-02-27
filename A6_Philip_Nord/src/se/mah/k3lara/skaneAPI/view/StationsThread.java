package se.mah.k3lara.skaneAPI.view;

import java.util.ArrayList;

import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class StationsThread extends Thread{
	
	private Parser parser;
	private SearchJourneyGUI gui;
	
	public StationsThread(Parser pars, SearchJourneyGUI sjgui) {
		this.parser = pars;
		this.gui = sjgui;
	
	}
	
	public void run(){
		
		gui.searchStations = new ArrayList<Station>();
		
		gui. searchStations.clear();
		gui.searchResultTextArea.setText(null);
		gui.searchResultTextArea.setText("Searching... \n");
		gui.searchStations.addAll(Parser.getStationsFromURL(gui.searchField.getText()));
		gui.searchResultTextArea.setText(null);
	

		//gui.searchStations.addAll(Parser.getStationsFromURL(gui.searchField.getText())); 
	
	for (Station s : gui.searchStations) {
		gui.searchResultTextArea.append(s.getStationName() + "  number: "
				+ s.getStationNbr() + "\n");
		
		
		}
	}
}
