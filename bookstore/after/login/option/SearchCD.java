package bookstore.after.login.option;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SearchCD {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchCD window = new SearchCD();
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
	public SearchCD() {
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
		
		JLabel lblEarchCds = new JLabel("Add CD's You Want");
		lblEarchCds.setBounds(6, 6, 181, 16);
		frame.getContentPane().add(lblEarchCds);
		
		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setBounds(89, 66, 61, 16);
		frame.getContentPane().add(lblSearch);
		
		textField = new JTextField();
		textField.setBounds(162, 61, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAddToCart = new JButton("Add To Cart");
		btnAddToCart.setBounds(175, 138, 117, 29);
		frame.getContentPane().add(btnAddToCart);
	}

}
