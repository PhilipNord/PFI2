import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Canvas;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;


public class AlarmGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlarmGUI frame = new AlarmGUI();
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
	public AlarmGUI() {
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
		btnSetAlarm.setFont(new Font("Slim Joe", Font.PLAIN, 10));
		panel.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.setFont(new Font("Slim Joe", Font.PLAIN, 10));
		panel.add(btnClearAlarm);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.activeCaption);
		textPane.setForeground(SystemColor.inactiveCaptionBorder);
		textPane.setFont(new Font("Big John", Font.PLAIN, 30));
		textPane.setText("19: 39");
		textPane.setBounds(228, 106, 115, 32);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setForeground(SystemColor.inactiveCaption);
		textPane_1.setBackground(SystemColor.activeCaption);
		textPane_1.setFont(new Font("Slim Joe", Font.PLAIN, 20));
		textPane_1.setText("\\\\ 23");
		textPane_1.setBounds(337, 106, 77, 32);
		contentPane.add(textPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("Alarm at:");
		lblNewLabel_1.setFont(new Font("Slim Joe", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_1.setBounds(238, 149, 82, 22);
		contentPane.add(lblNewLabel_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(318, 149, 77, 20);
		contentPane.add(textPane_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_2.setBackground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_2.setBounds(128, 11, 346, 84);
		contentPane.add(lblNewLabel_2);
	}
}
