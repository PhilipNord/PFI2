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

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private ClockLogic clockLogic;
	public JLabel lblClocktime;
	private JLabel lblAlarn;

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
		
		super("Alarm Clock");
		ImageIcon img = new ImageIcon();
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
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
			}
		});
		btnSetAlarm.setFont(new Font("Slim Joe", Font.PLAIN, 10));
		panel.add(btnSetAlarm);

		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClearAlarm.setFont(new Font("Slim Joe", Font.PLAIN, 10));
		panel.add(btnClearAlarm);

		JLabel lblNewLabel_1 = new JLabel("Alarm at:");
		lblNewLabel_1.setFont(new Font("Slim Joe", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_1.setBounds(238, 149, 82, 22);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_2.setBackground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_2.setBounds(128, 11, 346, 84);
		contentPane.add(lblNewLabel_2);

		lblClocktime = new JLabel("");
		lblClocktime.setBounds(238, 81, 199, 63);
		contentPane.add(lblClocktime);
		
		lblAlarn = new JLabel("alarn");
		lblAlarn.setBounds(330, 152, 46, 14);
		contentPane.add(lblAlarn);
		clockLogic = new ClockLogic(this);
		
		
	}

	public void setTimeOnLabel(String time) {
		
		lblClocktime.setText(time);

	}
	
	public void setAlarmText(String alarmText){
		
		lblAlarn .setText(alarmText);
	}

	public void alarm(boolean activate) {

	}
}
