package bookstore.signup;
import bookstore.db.*;
import bookstore.login.UserLogin;
import bookstore.after.login.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserSignUp {

	private JFrame frame;
	private JTextField tbCreatUserName;
	private JPasswordField passCreateUserSignUp;
	private JTextField tbCreateUserMobile;
	private JTextField tbCreateUserEmail;
	private JTextField tbCreateUserFname;
	private JTextField tbCreateUserLname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserSignUp window = new UserSignUp();
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
	public UserSignUp() {
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

		JLabel lblUserSignupPage = new JLabel("User SignUp Page");
		lblUserSignupPage.setBounds(6, 0, 255, 43);
		lblUserSignupPage.setFont(new Font("Khmer Sangam MN", Font.BOLD, 25));
		frame.getContentPane().add(lblUserSignupPage);

		JLabel lblCreateAUser = new JLabel("User Name:");
		lblCreateAUser.setBounds(40, 142, 144, 16);
		frame.getContentPane().add(lblCreateAUser);

		tbCreatUserName = new JTextField();
		tbCreatUserName.setBounds(183, 137, 130, 26);
		frame.getContentPane().add(tbCreatUserName);
		tbCreatUserName.setColumns(10);

		JLabel lblCreateAPassword = new JLabel("Password:");
		lblCreateAPassword.setBounds(50, 170, 130, 16);
		frame.getContentPane().add(lblCreateAPassword);

		passCreateUserSignUp = new JPasswordField();
		passCreateUserSignUp.setBounds(183, 165, 130, 26);
		frame.getContentPane().add(passCreateUserSignUp);

		JLabel lblMobileNumber = new JLabel("Mobile Number:");
		lblMobileNumber.setBounds(22, 198, 112, 16);
		frame.getContentPane().add(lblMobileNumber);

		tbCreateUserMobile = new JTextField();
		tbCreateUserMobile.setBounds(183, 193, 130, 26);
		frame.getContentPane().add(tbCreateUserMobile);
		tbCreateUserMobile.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(40, 55, 94, 16);
		frame.getContentPane().add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(45, 83, 97, 16);
		frame.getContentPane().add(lblLastName);

		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setBounds(22, 110, 101, 16);
		frame.getContentPane().add(lblEmailAddress);

		tbCreateUserEmail = new JTextField();
		tbCreateUserEmail.setBounds(183, 105, 130, 26);
		frame.getContentPane().add(tbCreateUserEmail);
		tbCreateUserEmail.setColumns(10);

		tbCreateUserFname = new JTextField();
		tbCreateUserFname.setBounds(183, 50, 130, 26);
		frame.getContentPane().add(tbCreateUserFname);
		tbCreateUserFname.setColumns(10);

		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String fname = tbCreateUserFname.getText();
				String lname = tbCreateUserLname.getText();
				String email = tbCreateUserEmail.getText();
				String username = tbCreatUserName.getText();
				String password = String.valueOf(passCreateUserSignUp.getPassword());
				String contact = tbCreateUserMobile.getText();

				// String address=textField_2.getText();
				// String city=textField_3.getText();

				int i = UserSignUpDb.save(fname, lname, email, username, password, contact);
				if (i > 0) {
					JOptionPane.showInputDialog(UserSignUp.this, "User added successfully!");
					UserLogin.main(new String[] {});
					frame.dispose();

				} else {
					JOptionPane.showInputDialog(UserSignUp.this, "Sorry, unable to save!");
				}
			}
		});
		btnSignUp.setBounds(299, 230, 117, 29);
		frame.getContentPane().add(btnSignUp);

		tbCreateUserLname = new JTextField();
		tbCreateUserLname.setBounds(183, 78, 130, 26);
		frame.getContentPane().add(tbCreateUserLname);
		tbCreateUserLname.setColumns(10);
	}
}
