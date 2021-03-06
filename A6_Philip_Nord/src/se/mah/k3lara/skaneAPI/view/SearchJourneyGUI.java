package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextArea;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JScrollPane;

public class SearchJourneyGUI extends JFrame {

	public JPanel contentPane;
	public JTextField searchField;
	public ArrayList<Station> searchStations;
	public JTextArea searchResultTextArea;
	public JTextField searchFieldFrom;
	public JTextField searchFieldTo;
	public JTextArea searchResultJourneyTextArea;
	
	SearchJourneyGUI g = this;
	
	private Parser p = new Parser();
	
	Thread tJ = new JourneysThread (p, this);
	Thread tS = new StationsThread (p, this);

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchJourneyGUI frame = new SearchJourneyGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchJourneyGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel searchStationPanel = new JPanel();
		searchStationPanel.setBounds(10, 11, 220, 299);
		contentPane.add(searchStationPanel);
		searchStationPanel.setLayout(null);

		searchField = new JTextField();
		searchField.setBounds(10, 35, 161, 20);
		searchStationPanel.add(searchField);
		searchField.setColumns(10);

		JLabel lblStation = new JLabel("S\u00F6k h\u00E5llplats");
		lblStation.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 12));
		lblStation.setBounds(10, 10, 150, 20);
		searchStationPanel.add(lblStation);

		JButton btnSearch = new JButton("S\u00F6k");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Thread tS = new StationsThread (p, g);
				tS.start();
					
				}
		});

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 100, 200, 188);
		searchStationPanel.add(scrollPane);

		searchResultTextArea = new JTextArea();
		scrollPane.setViewportView(searchResultTextArea);
		btnSearch.setBounds(10, 66, 89, 23);
		searchStationPanel.add(btnSearch);
		
		JButton btnRensa = new JButton("Rensa");
		btnRensa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnRensa.setBounds(109, 66, 89, 23);
		searchStationPanel.add(btnRensa);

		JPanel searchJourneyPanel = new JPanel();
		searchJourneyPanel.setBounds(256, 11, 227, 299);
		contentPane.add(searchJourneyPanel);
		searchJourneyPanel.setLayout(null);

		JLabel lblFrn = new JLabel("Fr\u00E5n");
		lblFrn.setBounds(10, 11, 46, 14);
		searchJourneyPanel.add(lblFrn);

		searchFieldFrom = new JTextField();
		searchFieldFrom.setBounds(10, 30, 167, 20);
		searchJourneyPanel.add(searchFieldFrom);
		searchFieldFrom.setColumns(10);

		JLabel lblTill = new JLabel("Till");
		lblTill.setBounds(10, 61, 46, 14);
		searchJourneyPanel.add(lblTill);

		searchFieldTo = new JTextField();
		searchFieldTo.setBounds(10, 77, 167, 20);
		searchJourneyPanel.add(searchFieldTo);
		searchFieldTo.setColumns(10);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 141, 207, 147);
		searchJourneyPanel.add(scrollPane_1);

		searchResultJourneyTextArea = new JTextArea();
		scrollPane_1.setViewportView(searchResultJourneyTextArea);

		JButton btnSearchJourney = new JButton("S\u00F6k Resor");
		btnSearchJourney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread tJ = new JourneysThread (p, g);
				tJ.start();

					
			}
		});
		btnSearchJourney.setBounds(10, 108, 110, 23);
		searchJourneyPanel.add(btnSearchJourney);

	}
}
