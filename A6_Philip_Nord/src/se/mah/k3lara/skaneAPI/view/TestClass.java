package se.mah.k3lara.skaneAPI.view;

import java.util.ArrayList;
import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class TestClass {

	public static void main(String[] args) {
		String searchURL = Constants.getURL("81216", "80000",20); //Malm� C = 80000,  Lund C, 81216 Malm� Gatorg 80100, H�ssleholm C 93070
		System.out.println(searchURL);
		System.out.println("// Results when searching:");
		
		Journeys journeys = Parser.getJourneys(searchURL); // Den h�mtar alla m�jliga resem�l och l�gger dem i Arraylisten "journeys"
		for (Journey journey : journeys.getJourneys()) {
			System.out.print(journey.getStartStation()+" - ");
			System.out.print(journey.getEndStation());
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
			System.out.println(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late");
		} 
		
	   System.out.println("// Stations when searching for stations containing \"Malm\"");
		ArrayList<Station> searchStations = new ArrayList<Station>(); // Skapar en ArrayList  d�r dem s�kta staionerna ska l�ggas in i 
		searchStations.addAll(Parser.getStationsFromURL("Malm")); // Den h�mtar alla stationerna som inneh�ller str�ngen "Malm" ocl�gger den i Arraylisten "searchStations
		for (Station s: searchStations){
			System.out.println(s.getStationName() +" number:" +s.getStationNbr());
		}
	}
}

