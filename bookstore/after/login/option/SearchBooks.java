package bookstore.after.login.option;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SearchBooks {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchBooks window = new SearchBooks();
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
	public SearchBooks() {
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
		
		JLabel lblSearchBooksYou = new JLabel("Add Books You Want");
		lblSearchBooksYou.setBounds(6, 6, 196, 16);
		frame.getContentPane().add(lblSearchBooksYou);
		
		JLabel lblSearchBooks = new JLabel("Search Books");
		lblSearchBooks.setBounds(56, 77, 99, 16);
		frame.getContentPane().add(lblSearchBooks);
		
		textField = new JTextField();
		textField.setBounds(167, 72, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAddToCart = new JButton("Add To Cart");
		btnAddToCart.setBounds(179, 178, 117, 29);
		frame.getContentPane().add(btnAddToCart);
	}
}
