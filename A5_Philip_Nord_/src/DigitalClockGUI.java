import java.awt.EventQueue;

import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DigitalClockGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private ClockLogic clockLogic;
	public JLabel lblClocktime;
	private JLabel lblAlarn;
	private JLabel lblAlarmmsg;
	private JLabel lblSleepyLink;
	private JLabel lblLblawakelink;
	private JLabel lblLblalarmicon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		
		
		setTitle("Alarm Clock");
		ImageIcon img = new ImageIcon();
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Panel panel = new Panel();
		panel.setBounds(10, 17, 135, 213);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblAlarm = new JLabel("Alarm");
		lblAlarm.setBounds(8, 5, 60, 16);
		lblAlarm.setLabelFor(panel);
		lblAlarm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarm.setForeground(SystemColor.menu);
		lblAlarm.setFont(new Font("Big John", Font.PLAIN, 15));
		panel.add(lblAlarm);

		JLabel lblHour = new JLabel("Hour:");
		lblHour.setBounds(10, 41, 40, 12);
		lblHour.setFont(new Font("Slim Joe", Font.PLAIN, 12));
		lblHour.setBackground(SystemColor.menu);
		panel.add(lblHour);

		textField = new JTextField();
		textField.setBounds(8, 64, 86, 20);
		lblHour.setLabelFor(textField);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Minute");
		lblNewLabel.setBounds(8, 95, 52, 12);
		lblNewLabel.setFont(new Font("Slim Joe", Font.PLAIN, 12));
		panel.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setBounds(8, 118, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.setBounds(8, 153, 103, 19);
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clockLogic.setAlarm(Integer.parseInt(textField.getText()), Integer.parseInt(textField_1.getText()));
			}
		});
		btnSetAlarm.setFont(new Font("Slim Joe", Font.PLAIN, 10));
		panel.add(btnSetAlarm);

		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.setBounds(8, 183, 117, 19);
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clockLogic.clearAlram();
			}
		});
		btnClearAlarm.setFont(new Font("Slim Joe", Font.PLAIN, 10));
		panel.add(btnClearAlarm);

		JLabel lblAlarmAt = new JLabel("Alarm at:");
		lblAlarmAt.setFont(new Font("Slim Joe", Font.PLAIN, 12));
		lblAlarmAt.setForeground(SystemColor.inactiveCaptionBorder);
		lblAlarmAt.setBounds(151, 125, 82, 22);
		contentPane.add(lblAlarmAt);
		
		lblLblawakelink = new JLabel("lblAwakeLink");
		lblLblawakelink.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/Pictures/250px-PegasusBootsTMC.png")));
		lblLblawakelink.setVisible(false);
		
		lblAlarmmsg = new JLabel("Hyaaaah!");
		lblAlarmmsg.setForeground(Color.WHITE);
		lblAlarmmsg.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblAlarmmsg.setBounds(294, 205, 117, 32);
		contentPane.add(lblAlarmmsg);
		lblAlarmmsg.setVisible(false);
		lblLblawakelink.setBounds(284, 10, 200, 220);
		contentPane.add(lblLblawakelink);
		

		lblSleepyLink = new JLabel("New label");
		lblSleepyLink.setFont(new Font("Slim Joe", Font.PLAIN, 12));
		lblSleepyLink.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/Pictures/27288-the-legend-of-zelda-sleepy-link.png")));
		lblSleepyLink.setForeground(SystemColor.inactiveCaptionBorder);
		lblSleepyLink.setBackground(SystemColor.inactiveCaptionBorder);
		lblSleepyLink.setBounds(264, 22, 179, 228);
		contentPane.add(lblSleepyLink);

		lblClocktime = new JLabel("00:00:00");
		lblClocktime.setForeground(Color.WHITE);
		lblClocktime.setFont(new Font("Slim Joe", Font.PLAIN, 20));
		lblClocktime.setBounds(151, 72, 123, 38);
		contentPane.add(lblClocktime);
		
		lblAlarn = new JLabel("");
		lblAlarn.setForeground(Color.WHITE);
		lblAlarn.setFont(new Font("Slim Joe", Font.PLAIN, 12));
		lblAlarn.setBounds(229, 125, 46, 22);
		contentPane.add(lblAlarn);
		
		JLabel background = new JLabel("New label");
		background.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/Pictures/1504063.jpg")));
		background.setBounds(0, 0, 484, 261);
		contentPane.add(background);
	
		
		clockLogic = new ClockLogic(this);
		
	}

	public void setTimeOnLabel(String checktime) {
		
		lblClocktime.setText(checktime);

	}
	
	public void setAlarmText(String alarmText){
		
		lblAlarn .setText(alarmText);
	}

	public void alarm(boolean activate) {
		
		 
		 lblSleepyLink.setVisible(!activate);
		 lblLblawakelink.setVisible(activate);
		 lblAlarmmsg.setVisible(activate);
			
		}
	
}
