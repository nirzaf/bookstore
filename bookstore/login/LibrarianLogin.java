package bookstore.login;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import bookstore.db.UserSignUpDb;
import bookstore.options.LibrarianOption;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianLogin {

	private JFrame frame;
	private JTextField tbLibUsername;
	private JPasswordField passLibrLOgin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogin window = new LibrarianLogin();
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
	public LibrarianLogin() {
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
		
		JLabel lblLibrarianLoginPage = new JLabel("Librarian Login Page");
		lblLibrarianLoginPage.setBounds(23, 6, 127, 25);
		frame.getContentPane().add(lblLibrarianLoginPage);
		
		tbLibUsername = new JTextField();
		tbLibUsername.setBounds(151, 69, 130, 26);
		frame.getContentPane().add(tbLibUsername);
		tbLibUsername.setColumns(10);
		
		passLibrLOgin = new JPasswordField();
		passLibrLOgin.setBounds(151, 132, 130, 26);
		frame.getContentPane().add(passLibrLOgin);
		
		JButton btnLibLogin = new JButton("Login");
		btnLibLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				}
		});
		btnLibLogin.setBounds(164, 202, 117, 29);
		frame.getContentPane().add(btnLibLogin);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setBounds(49, 74, 90, 16);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(49, 137, 90, 16);
		frame.getContentPane().add(lblPassword);
	}
}
