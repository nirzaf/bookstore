package bookstore.options;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bookstore.after.login.option.AddBooks;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianOption {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianOption window = new LibrarianOption();
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
	public LibrarianOption() {
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
		
		JLabel lblWelcomeLibrarian = new JLabel("WelCome Librarian");
		lblWelcomeLibrarian.setBounds(6, 6, 148, 16);
		frame.getContentPane().add(lblWelcomeLibrarian);
		
		JButton btnAddBooks = new JButton("Add Books");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddBooks.main(new String[]{});
				
			}
		});
		btnAddBooks.setBounds(165, 56, 117, 29);
		frame.getContentPane().add(btnAddBooks);
		
		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.setBounds(165, 120, 117, 29);
		frame.getContentPane().add(btnViewBooks);
	}
}
