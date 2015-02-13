import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PetStoreGUI extends JFrame {
	
	public Human human;
	public Dog dog;
	private JPanel contentPane;
	private JTextField NewOwner;
	private JTextField BuyDog;
	private JButton btnNewButton_1;
	private final int MIN_SIZE = 3;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetStoreGUI frame = new PetStoreGUI();
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
	public PetStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NewOwner = new JTextField();
		NewOwner.setBounds(10, 60, 111, 27);
		contentPane.add(NewOwner);
		NewOwner.setColumns(10);
		
		BuyDog = new JTextField();
		BuyDog.setBounds(10, 109, 111, 27);
		contentPane.add(BuyDog);
		BuyDog.setColumns(10);
		
		JButton btnNewOwner = new JButton("New Owner");
		btnNewOwner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 if(String.valueOf(NewOwner.getText()).length()>= MIN_SIZE){
					human = new Human(String.valueOf(NewOwner.getText()));
					System.out.println(human.getName());
				}else{
					textField_1.setText("Invaild Name");
				 
			 }
			}	 
		});
		btnNewOwner.setBounds(156, 60, 111, 27);
		contentPane.add(btnNewOwner);
		
		JButton btnNewButton = new JButton("Buy Dog");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(human !=null){
					dog = new Dog(String.valueOf(BuyDog.getText()));
					System.out.println(dog.getOwnerName());
					human.buyDog(dog);
				}else{
					
					textField_1.setText("Error");
				}
				
				
			}
		});
		btnNewButton.setBounds(156, 109, 111, 27);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Print Info");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(human == null) {
					textField_1.setText("Human and Dog must be set"); // Added null check /Anton
				} else {

					if(dog !=null){
						textField.setText(human.getInfo());

					}else{

						textField.setText(human.getName() + " owns no dog");
					}
				
				}
			}	
		});
		btnNewButton_1.setBounds(156, 159, 111, 27);
		contentPane.add(btnNewButton_1);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(20, 198, 46, 14);
		contentPane.add(lblInfo);
		
		JLabel lblErrorMessage = new JLabel("Error Message");
		lblErrorMessage.setBounds(20, 292, 111, 14);
		contentPane.add(lblErrorMessage);
		
		JLabel lblHuman = new JLabel("Human & Dogs");
		lblHuman.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblHuman.setBounds(180, 11, 186, 27);
		contentPane.add(lblHuman);
		
		textField = new JTextField();
		textField.setBounds(10, 223, 383, 64);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 317, 383, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
