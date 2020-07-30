package bookstore.after.login.option;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import bookstore.db.*;
import bookstore.options.LibrarianOption;

public class AddBooks {

	private JFrame frame;
	private JTextField tbNameOfBook;
	private JTextField tbAuthorOfBook;
	private JTextField tbPublisherOfBook;
	private JTextField tbQuantityOfBook;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBooks window = new AddBooks();
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
	public AddBooks() {
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
		
		JLabel lblAddBooks = new JLabel("Add Books");
		lblAddBooks.setBounds(6, 6, 88, 16);
		frame.getContentPane().add(lblAddBooks);
		
		JLabel lblNameOfThe = new JLabel("Name Of The Book:");
		lblNameOfThe.setBounds(47, 46, 137, 16);
		frame.getContentPane().add(lblNameOfThe);
		
		tbNameOfBook = new JTextField();
		tbNameOfBook.setBounds(224, 41, 130, 26);
		frame.getContentPane().add(tbNameOfBook);
		tbNameOfBook.setColumns(10);
		
		JLabel lblAuthorOfThe = new JLabel("Author Of The Book:");
		lblAuthorOfThe.setBounds(47, 91, 137, 16);
		frame.getContentPane().add(lblAuthorOfThe);
		
		tbAuthorOfBook = new JTextField();
		tbAuthorOfBook.setBounds(224, 79, 130, 26);
		frame.getContentPane().add(tbAuthorOfBook);
		tbAuthorOfBook.setColumns(10);
		
		JLabel lblPublisherOfThe = new JLabel("Publisher Of The Book:");
		lblPublisherOfThe.setBounds(28, 129, 156, 16);
		frame.getContentPane().add(lblPublisherOfThe);
		
		tbPublisherOfBook = new JTextField();
		tbPublisherOfBook.setBounds(224, 117, 130, 26);
		frame.getContentPane().add(tbPublisherOfBook);
		tbPublisherOfBook.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Quantity Of The Book:");
		lblNewLabel.setBounds(28, 164, 156, 16);
		frame.getContentPane().add(lblNewLabel);
		
		tbQuantityOfBook = new JTextField();
		tbQuantityOfBook.setBounds(224, 159, 130, 26);
		frame.getContentPane().add(tbQuantityOfBook);
		tbQuantityOfBook.setColumns(10);
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=tbNameOfBook.getText();
				String author=tbAuthorOfBook.getText();
				String publisher=tbPublisherOfBook.getText();
				String quantity=tbQuantityOfBook.getText();
				
				int i=BookDb.save( name, author, publisher, quantity);
				if(i>0){
					JOptionPane.showInputDialog(AddBooks.this,"Books added successfully!");
					
					frame.dispose();

					LibrarianOption.main(new String[]{});
					
				}else{
					JOptionPane.showInputDialog(AddBooks.this,"Sorry, unable to save!");
				}
				
			}
			
			
		});
		btnAddBook.setBounds(303, 218, 117, 29);
		frame.getContentPane().add(btnAddBook);
	}
		}
