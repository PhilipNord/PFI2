import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


public class AnimalListGUI extends JFrame {

	private JPanel contentPane;
	ArrayList<Animal> animalList;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalListGUI frame = new AnimalListGUI();
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
	public AnimalListGUI() {
		
		animalList = new ArrayList<Animal>();
		
		Cat cat = new Cat("Lynx Lynx,", 7, 7);
		cat.setFriendlyName("Sir Pawalot");
		animalList.add(cat);
		
		Cat cat_1 = new Cat("Lynnx Lynx,", 0, 9000);
		cat_1.setFriendlyName("Lord Ruler");
		animalList.add(cat_1);
		
		Snake snake = new Snake("Eunectes murinus", true);
		snake.setFriendlyName("Snakuu");
		animalList.add(snake);
		
		Snake snake_1 = new Snake("Python Ragius", false);
		snake_1.setFriendlyName("Slyterin");
		animalList.add(snake_1);
		
		
		
		animalList.add(new Dog("Bolt", "Shiba Inu", 4,true));
		animalList.add(new Dog("Lassie", "Canis Lupus", 1,false));
		 
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAnimalist = new JLabel("Animalist");
		lblAnimalist.setBounds(10, 11, 46, 14);
		contentPane.add(lblAnimalist);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 36, 504, 214);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		for (Animal i: animalList){
			textArea.append (i.getInfo() + "\n");
		}
	}
	
}	
