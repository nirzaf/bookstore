package bookstore.options;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bookstore.after.login.option.SearchBooks;
import bookstore.after.login.option.SearchCD;
import bookstore.after.login.option.SearchSoftware;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchItems {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchItems window = new SearchItems();
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
	public SearchItems() {
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
		
		JButton btnAddToCart = new JButton("Books");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchBooks.main(new String[] {});
			}
		});
		btnAddToCart.setBounds(157, 67, 117, 29);
		frame.getContentPane().add(btnAddToCart);
		
		JButton btnBuyNow = new JButton("CD");
		btnBuyNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchCD.main(new String[] {});
			}
		});
		btnBuyNow.setBounds(157, 125, 117, 29);
		frame.getContentPane().add(btnBuyNow);
		
		JButton btnSoftware = new JButton("Software");
		btnSoftware.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchSoftware.main(new String[] {});
			}
		});
		btnSoftware.setBounds(157, 185, 117, 29);
		frame.getContentPane().add(btnSoftware);
	}

}
