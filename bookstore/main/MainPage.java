package bookstore.main;
import java.awt.EventQueue;

import javax.swing.JFrame;

import bookstore.login.LibrarianLogin;
import bookstore.login.UserLogin;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage {

	private JFrame frame;
/*
 * Nirojan
 */
	
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
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
	public MainPage() {
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
		
		JButton btnOxfordUser = new JButton("Oxford User");
		btnOxfordUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.main(new String [] {});
			}
		});
		btnOxfordUser.setBounds(153, 51, 117, 29);
		frame.getContentPane().add(btnOxfordUser);
		
		JButton btnLibrarian = new JButton("Administrator");
		btnLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianLogin.main(new String [] {});
			}
		});
		btnLibrarian.setBounds(153, 113, 117, 29);
		frame.getContentPane().add(btnLibrarian);
		
	}
}
