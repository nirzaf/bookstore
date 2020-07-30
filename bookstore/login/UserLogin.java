package bookstore.login;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;

import bookstore.db.UserSignUpDb;
import bookstore.options.SearchItems;
import bookstore.signup.UserSignUp;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserLogin {

	private JFrame frame;
	private JTextField tbUserLogin;
	private JPasswordField passUserLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin window = new UserLogin();
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
	public UserLogin() {
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
		
		tbUserLogin = new JTextField();
		tbUserLogin.setBounds(178, 60, 130, 26);
		frame.getContentPane().add(tbUserLogin);
		tbUserLogin.setColumns(10);
		
		passUserLogin = new JPasswordField();
		passUserLogin.setBounds(178, 129, 130, 26);
		frame.getContentPane().add(passUserLogin);
		
		JLabel lblNewLabel = new JLabel("User Name:");
		lblNewLabel.setBounds(71, 65, 95, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(88, 134, 78, 16);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=tbUserLogin.getText();
				String password=String.valueOf(passUserLogin.getPassword());
				//System.out.println(name+" "+password);
				if(UserSignUpDb.validate(username, password)){
					SearchItems.main(new String[]{});
					frame.dispose();
				}else{
					//JOptionPane.showMessageDialog(LibrarianLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					tbUserLogin.setText("");
					passUserLogin.setText("");
				}
				}
				
				
		});
		btnLogin.setBounds(90, 196, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblUserLoginPage = new JLabel("User Login Page");
		lblUserLoginPage.setBounds(19, 17, 163, 26);
		frame.getContentPane().add(lblUserLoginPage);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserSignUp.main(new String [] {});
				
			}
		});
		btnSignUp.setBounds(255, 196, 117, 29);
		frame.getContentPane().add(btnSignUp);
	}
}
