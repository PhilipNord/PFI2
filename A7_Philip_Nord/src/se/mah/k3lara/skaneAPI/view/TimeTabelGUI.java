package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JLabel;

public class TimeTabelGUI extends JFrame {
	
	UpdateThread t;
	
	private JLabel lblUbtshallen;
	private JLabel lblLinje;
	private JLabel lblDestination;
	private JLabel lblAvgng; 
	private JLabel lblFrsening;
	
	private JLabel lblLine1 = new JLabel("");
	private JLabel lblLine2 = new JLabel("");
	private JLabel lblLine3 = new JLabel("");
	private JLabel lblLine4 = new JLabel("");
	
	private JLabel lblDest1 = new JLabel("");
	private JLabel lblDest2 = new JLabel("");
	private JLabel lblDest3 = new JLabel("");
	private JLabel lblDest4 = new JLabel("");
	
	private JLabel lblArrv1 = new JLabel(""); 
	private JLabel lblArrv2 = new JLabel("");
	private JLabel lblArrv3 = new JLabel("");
	private JLabel lblArrv4 = new JLabel(""); 
	
	private JLabel lblDevTime1 = new JLabel("");
	private JLabel lblDevTime2 = new JLabel("");
	private JLabel lblDevTime3 = new JLabel("");
	private JLabel lblDevTime4 = new JLabel("");


	
	
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeTabelGUI frame = new TimeTabelGUI();
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
	public TimeTabelGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 393);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUbtshallen = new JLabel("Ub\u00E5tshallen");
		lblUbtshallen.setFont(new Font("Leelawadee", Font.BOLD, 25));
		lblUbtshallen.setForeground(Color.WHITE);
		lblUbtshallen.setBounds(109, 11, 162, 52);
		contentPane.add(lblUbtshallen);
		
		lblLinje = new JLabel("Linje");
		lblLinje.setFont(new Font("Leelawadee UI", Font.BOLD, 15));
		lblLinje.setForeground(Color.WHITE);
		lblLinje.setBounds(10, 74, 59, 26);
		contentPane.add(lblLinje);
		
		lblDestination = new JLabel("Destination");
		lblDestination.setForeground(Color.WHITE);
		lblDestination.setFont(new Font("Leelawadee UI", Font.BOLD, 15));
		lblDestination.setBounds(79, 80, 97, 14);
		contentPane.add(lblDestination);
		
		lblAvgng = new JLabel("Avg\u00E5ng");
		lblAvgng.setFont(new Font("Leelawadee UI", Font.BOLD, 15));
		lblAvgng.setForeground(Color.WHITE);
		lblAvgng.setBounds(204, 79, 67, 17);
		contentPane.add(lblAvgng);
		
		lblFrsening = new JLabel("F\u00F6rsening");
		lblFrsening.setFont(new Font("Leelawadee UI", Font.BOLD, 15));
		lblFrsening.setForeground(Color.WHITE);
		lblFrsening.setBounds(302, 74, 92, 26);
		contentPane.add(lblFrsening);
		
		JPanel LinesRow = new JPanel();
		LinesRow.setBackground(Color.BLACK);
		LinesRow.setBounds(10, 110, 37, 232);
		contentPane.add(LinesRow);
		LinesRow.setLayout(null);
		lblLine1.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 12));
		
		lblLine1.setBounds(0, 10, 40, 24);
		LinesRow.add(lblLine1);
		lblLine1.setBackground(Color.GRAY);
		lblLine1.setForeground(Color.ORANGE);
		lblLine2.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 12));
		lblLine2.setForeground(Color.ORANGE);
		
		
		lblLine2.setBounds(0, 65, 37, 24);
		LinesRow.add(lblLine2);
		lblLine3.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 12));
		lblLine3.setForeground(Color.ORANGE);
		
		
		lblLine3.setBounds(0, 120, 37, 24);
		LinesRow.add(lblLine3);
		lblLine4.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 12));
		lblLine4.setForeground(Color.ORANGE);
		
		
		lblLine4.setBounds(0, 175, 37, 24);
		LinesRow.add(lblLine4);
		
		JPanel DestRow = new JPanel();
		DestRow.setBackground(Color.BLACK);
		DestRow.setBounds(79, 110, 107, 232);
		contentPane.add(DestRow);
		DestRow.setLayout(null);
		lblDest1.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 10));
		lblDest1.setForeground(Color.ORANGE);
		
		
		lblDest1.setBounds(0, 10, 107, 30);
		DestRow.add(lblDest1);
		lblDest2.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 10));
		lblDest2.setForeground(Color.ORANGE);
		
		
		lblDest2.setBounds(0, 65, 107, 30);
		DestRow.add(lblDest2);
		lblDest3.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 10));
		lblDest3.setForeground(Color.ORANGE);
		
		
		lblDest3.setBounds(0, 120, 107, 30);
		DestRow.add(lblDest3);
		lblDest4.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 10));
		lblDest4.setForeground(Color.ORANGE);
		
		
		lblDest4.setBounds(0, 175, 107, 30);
		DestRow.add(lblDest4);
		
		JPanel ArrvTimeRow = new JPanel();
		ArrvTimeRow.setBackground(Color.BLACK);
		ArrvTimeRow.setBounds(214, 110, 43, 232);
		contentPane.add(ArrvTimeRow);
		ArrvTimeRow.setLayout(null);
		lblArrv1.setFont(new Font("Levenim MT", Font.BOLD, 15));
		lblArrv1.setForeground(Color.ORANGE);
		
		
		lblArrv1.setBounds(0, 10, 43, 21);
		ArrvTimeRow.add(lblArrv1);
		lblArrv2.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
		lblArrv2.setForeground(Color.ORANGE);
		
		
		lblArrv2.setBounds(0, 65, 43, 21);
		ArrvTimeRow.add(lblArrv2);
		lblArrv3.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
		lblArrv3.setForeground(Color.ORANGE);
		
		
		lblArrv3.setBounds(0, 120, 43, 21);
		ArrvTimeRow.add(lblArrv3);
		lblArrv4.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
		lblArrv4.setForeground(Color.ORANGE);
		
		
		lblArrv4.setBounds(0, 175, 43, 21);
		ArrvTimeRow.add(lblArrv4);
		
		JPanel DevTimeRow = new JPanel();
		DevTimeRow.setForeground(Color.BLACK);
		DevTimeRow.setBackground(Color.BLACK);
		DevTimeRow.setBounds(302, 110, 67, 232);
		contentPane.add(DevTimeRow);
		DevTimeRow.setLayout(null);
		lblDevTime1.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
		lblDevTime1.setForeground(Color.ORANGE);
		
		
		lblDevTime1.setBounds(0, 10, 67, 25);
		DevTimeRow.add(lblDevTime1);
		lblDevTime2.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
		lblDevTime2.setForeground(Color.ORANGE);
		
		
		lblDevTime2.setBounds(0, 65, 67, 25);
		DevTimeRow.add(lblDevTime2);
		lblDevTime3.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 15));
		lblDevTime3.setForeground(Color.ORANGE);
		
		
		lblDevTime3.setBounds(0, 120, 67, 25);
		DevTimeRow.add(lblDevTime3);
		lblDevTime4.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
		lblDevTime4.setForeground(Color.ORANGE);
		
		
		lblDevTime4.setBounds(0, 175, 67, 25);
		DevTimeRow.add(lblDevTime4);
		
		t = new UpdateThread(this);
		t.start();
	}
	
	public void UpdateLabels(){
		Lines lines = Parser.getStationResults(new Station("80046"));
		

	
		lblLine1.setText(lines.getLines().get(0).getLine());
		lblLine2.setText(lines.getLines().get(1).getLine());
		lblLine3.setText(lines.getLines().get(2).getLine());
		lblLine4.setText(lines.getLines().get(3).getLine());

		
		lblDest1.setText(lines.getLines().get(0).getDestination()); System.out.println(lines.getLines().get(0).getDestination());
		lblDest2.setText(lines.getLines().get(1).getDestination()); System.out.println(lines.getLines().get(1).getDestination());
		lblDest3.setText(lines.getLines().get(2).getDestination()); System.out.println(lines.getLines().get(2).getDestination());
		lblDest4.setText(lines.getLines().get(3).getDestination()); System.out.println(lines.getLines().get(3).getDestination());
		
		
		lblArrv1.setText(FixTime(lines.getLines().get(0).getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + FixTime(lines.getLines().get(0).getDepTime().get(Calendar.MINUTE)));
		lblArrv2.setText(FixTime(lines.getLines().get(1).getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + FixTime(lines.getLines().get(1).getDepTime().get(Calendar.MINUTE)));
		lblArrv3.setText(FixTime(lines.getLines().get(2).getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + FixTime(lines.getLines().get(2).getDepTime().get(Calendar.MINUTE)));
		lblArrv4.setText(FixTime(lines.getLines().get(3).getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + FixTime(lines.getLines().get(3).getDepTime().get(Calendar.MINUTE)));
		
		

		 if (lines.getLines().get(0).getDepTimeDeviation() != "") {
				JLabel label = new JLabel("+");
				label.setForeground(new Color(255, 255, 255));
				label.setBounds(392, 82, 20, 14);
				contentPane.add(label);
				lblDevTime1.setText(lines.getLines().get(0).getDepTimeDeviation() + " min");
			}
		
		     if (lines.getLines().get(1).getDepTimeDeviation() != "") {
				JLabel label_1 = new JLabel("+");
				label_1.setForeground(Color.ORANGE);
				label_1.setBounds(392, 107, 20, 14);
				contentPane.add(label_1);
				lblDevTime2.setText(lines.getLines().get(1).getDepTimeDeviation() + " min");
			}
		     if (lines.getLines().get(2).getDepTimeDeviation() != "") {
				JLabel label_2 = new JLabel("+");
				label_2.setForeground(Color.ORANGE);
				label_2.setBounds(392, 132, 20, 14);
				contentPane.add(label_2);
				lblDevTime3.setText(lines.getLines().get(2).getDepTimeDeviation() + " min");
			}
		    if (lines.getLines().get(3).getDepTimeDeviation() != "") {
			JLabel label_3 = new JLabel("+");
			label_3.setForeground(Color.ORANGE);
			label_3.setBounds(392, 157, 20, 14);
			contentPane.add(label_3);
			lblDevTime4.setText(lines.getLines().get(3).getDepTimeDeviation() + " min");

				
			}
		    
		    if (lines.getLines().get(4).getDepTimeDeviation() != "") {
				JLabel label_4 = new JLabel("+");
				label_4.setForeground(Color.ORANGE);
				label_4.setBounds(392, 157, 20, 14);
				contentPane.add(label_4);
				lblDevTime4.setText(lines.getLines().get(4).getDepTimeDeviation() + " min");

					
				}
		    
		   //}
	}    
	
	public String FixTime(int time) {

		String zero = "";

		if (time < 10) {
			zero = "0";
		}

		String fixTimeString = zero + Integer.toString(time);

		zero = "";

		return fixTimeString;
	}
}
