package bookstore.after.login.option;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SearchSoftware {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchSoftware window = new SearchSoftware();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchSoftware() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAddSoftwaresYou = new JLabel("Add Softwares You Want");
		lblAddSoftwaresYou.setBounds(6, 17, 180, 16);
		frame.getContentPane().add(lblAddSoftwaresYou);
		
		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setBounds(106, 88, 61, 16);
		frame.getContentPane().add(lblSearch);
		
		textField = new JTextField();
		textField.setBounds(174, 83, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAddToCart = new JButton("Add To Cart");
		btnAddToCart.setBounds(154, 155, 117, 29);
		frame.getContentPane().add(btnAddToCart);
	}

}
