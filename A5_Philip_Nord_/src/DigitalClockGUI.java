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
	private JLabel lblLblalramicon;

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
		panel.setBounds(10, 47, 100, 176);
		contentPane.add(panel);

		JLabel lblAlarm = new JLabel("Alarm");
		lblAlarm.setLabelFor(panel);
		lblAlarm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarm.setForeground(SystemColor.menu);
		lblAlarm.setFont(new Font("Big John", Font.PLAIN, 15));
		panel.add(lblAlarm);

		JLabel lblHour = new JLabel("Hour:");
		lblHour.setFont(new Font("Slim Joe", Font.PLAIN, 12));
		lblHour.setBackground(SystemColor.menu);
		panel.add(lblHour);

		textField = new JTextField();
		lblHour.setLabelFor(textField);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Minute");
		lblNewLabel.setFont(new Font("Slim Joe", Font.PLAIN, 12));
		panel.add(lblNewLabel);

		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);

		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clockLogic.setAlarm(Integer.parseInt(textField.getText()), Integer.parseInt(textField_1.getText()));
			}
		});
		btnSetAlarm.setFont(new Font("Slim Joe", Font.PLAIN, 10));
		panel.add(btnSetAlarm);

		JButton btnClearAlarm = new JButton("Clear Alarm");
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
		lblAlarmAt.setBounds(116, 126, 82, 22);
		contentPane.add(lblAlarmAt);

		lblSleepyLink = new JLabel("New label");
		lblSleepyLink.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/Pictures/27288-the-legend-of-zelda-sleepy-link.png")));
		lblSleepyLink.setForeground(SystemColor.inactiveCaptionBorder);
		lblSleepyLink.setBackground(SystemColor.inactiveCaptionBorder);
		lblSleepyLink.setBounds(264, 22, 179, 228);
		contentPane.add(lblSleepyLink);

		lblClocktime = new JLabel("00:00:00");
		lblClocktime.setBounds(116, 47, 188, 38);
		contentPane.add(lblClocktime);
		
		lblAlarn = new JLabel("alarn");
		lblAlarn.setBounds(208, 129, 46, 14);
		contentPane.add(lblAlarn);
		
		lblAlarmmsg = new JLabel("alarmMsg");
		lblAlarmmsg.setBounds(335, 229, 66, 32);
		contentPane.add(lblAlarmmsg);
		
		JLabel background = new JLabel("New label");
		background.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/Pictures/1504063.jpg")));
		background.setBounds(0, 0, 484, 261);
		contentPane.add(background);
		
		lblLblawakelink = new JLabel("lblAwakeLink");
		lblLblawakelink.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/Pictures/250px-PegasusBootsTMC.png")));
		lblLblawakelink.setVisible(false);
		lblLblawakelink.setBounds(284, 10, 200, 220);
		contentPane.add(lblLblawakelink);
		
		JLabel lblLblalramicon = new JLabel("lblAlramIcon");
		lblLblalramicon.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/Pictures/bell69.png")));
		lblLblalramicon.setBounds(335, 59, 66, 67);
		contentPane.add(lblLblalramicon);
	
		
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
		 lblLblalramicon.setVisible(activate);
		if(true){
			
			 lblAlarmmsg.setText("Hyaaaah!");
			
		}
	}
}
