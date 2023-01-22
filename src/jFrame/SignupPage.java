package jFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import app.bolivia.swing.JCTextField;
import javax.swing.border.MatteBorder;
import rojerusan.RSMaterialButtonCircle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class SignupPage {

	
	private JFrame frame;
	



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				SignupPage window = new SignupPage();
				window.frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignupPage() {
		initialize();	
	}
	
	//method to insert data into users table
	public void insertSignupDetails(JCTextField txt_username, JCTextField txt_password, JCTextField txt_email, JCTextField txt_contact) {
		String name = txt_username.getText();
		String pwd = txt_password.getText();
		String email = txt_email.getText();
		String contact = txt_contact.getText();
		
		try {
			Connection con = DBConnection.getConnection();
			String sql = "insert into users(name,password,email,contact) values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, name);
			pst.setString(2, pwd);
			pst.setString(3, email);
			pst.setString(4, contact);
			
			int updatedRowCount = pst.executeUpdate();
			
			if (updatedRowCount > 0) {
				JOptionPane.showMessageDialog(frame, "Record Inserted Successfully");
				LoginPage page = new LoginPage();
				page.setVisible(true);
				frame.dispose();
				
			} else {
				JOptionPane.showMessageDialog(frame, "Record Insertion Failure");

			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	//validation
	
	public boolean validateSignup(JCTextField txt_username, JCTextField txt_password, JCTextField txt_email, JCTextField txt_contact) {
		String name = txt_username.getText();
		String pwd = txt_password.getText();
		String email = txt_email.getText();
		String contact = txt_contact.getText();
		
		if (name.equals("")) {
			JOptionPane.showMessageDialog(frame, "Please enter username");
			return false;
		}
		
		
		if (pwd.equals("")) {
			JOptionPane.showMessageDialog(frame, "Please enter password");
			return false;
		}
		
		
		if (email.equals("") || !email.matches("^.+@.+\\..+$")) {
			JOptionPane.showMessageDialog(frame, "Please enter a valid email");
			return false;
		}
		
		if (contact.equals("")) {
			JOptionPane.showMessageDialog(frame, "Please enter contact number");
			return false;
		}
		
		return true;
	}
	
	
	//check duplicate users
	public boolean checkDuplicateUser(JLabel txt_username) {
		String name = txt_username.getText();
		boolean isExist = false;
		
		try {
			Connection con = DBConnection.getConnection();
			
			//checking the database to see if the name is already existing or not
			
			PreparedStatement pst = con.prepareStatement("select * from users where name = ?");
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				isExist = true; 				
			} else {
				isExist = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isExist;
	}
	
	
	
	
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setPreferredSize(new Dimension(990, 830));
		frame.setSize(new Dimension(1523, 828));
		frame.setBounds(100, 100, 1423, 828);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 0, 991, 791);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To");
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(255, 51, 51));
		lblNewLabel.setBounds(400, 111, 162, 38);
		panel.add(lblNewLabel);
		
		JLabel lblDeveloper = new JLabel("Developer");
		lblDeveloper.setForeground(new Color(128, 0, 255));
		lblDeveloper.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblDeveloper.setBounds(191, 30, 162, 38);
		panel.add(lblDeveloper);
		
		JLabel lblNewLabel_1 = new JLabel("SPECIAL");
		lblNewLabel_1.setForeground(new Color(255, 51, 51));
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblNewLabel_1.setBounds(42, 30, 139, 38);
		panel.add(lblNewLabel_1);
		
		JLabel lblAdvanceLibrary = new JLabel("Advance Library");
		lblAdvanceLibrary.setForeground(new Color(128, 0, 255));
		lblAdvanceLibrary.setFont(new Font("Sitka Text", Font.PLAIN, 30));
		lblAdvanceLibrary.setBounds(358, 159, 252, 38);
		panel.add(lblAdvanceLibrary);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(SignupPage.class.getResource("/icons/signup-library-icon.png")));
		lblNewLabel_2.setBounds(67, 214, 902, 577);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(990, 830));
		panel_1.setSize(new Dimension(990, 830));
		panel_1.setBackground(new Color(102, 102, 255));
		panel_1.setBounds(1000, 0, 471, 791);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("X");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(385, 10, 38, 38);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("SIGNUP PAGE");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(127, 46, 235, 38);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setIcon(new ImageIcon(SignupPage.class.getResource("/icons/icons8_Account_50px.png")));
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2.setBounds(46, 216, 59, 56);
		panel_1.add(lblNewLabel_1_1_2);
		
		JCTextField txt_username = new JCTextField();
		txt_username.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (checkDuplicateUser(lblNewLabel_1_1_2) == true) {
					JOptionPane.showMessageDialog(frame, "username already exist");
					
				}
				
			}
		});
		txt_username.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_username.setPlaceholder("Enter username..");
		txt_username.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_username.setBackground(new Color(102, 102, 255));
		txt_username.setBounds(115, 246, 270, 32);
		panel_1.add(txt_username);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Username");
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_1.setBounds(117, 191, 133, 38);
		panel_1.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("");
		lblNewLabel_1_1_2_2.setIcon(new ImageIcon(SignupPage.class.getResource("/icons/icons8_Secure_50px.png")));
		lblNewLabel_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_2.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_2.setBounds(46, 327, 59, 56);
		panel_1.add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Password");
		lblNewLabel_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_1_1.setBounds(117, 302, 133, 38);
		panel_1.add(lblNewLabel_1_1_2_1_1);
		
		JCTextField txt_password = new JCTextField();
		txt_password.setPlaceholder("Enter Password..");
		txt_password.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_password.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_password.setBackground(new Color(102, 102, 255));
		txt_password.setBounds(115, 357, 270, 32);
		panel_1.add(txt_password);
		
		JLabel lblNewLabel_1_1_2_2_1 = new JLabel("");
		lblNewLabel_1_1_2_2_1.setIcon(new ImageIcon(SignupPage.class.getResource("/icons/icons8_Secured_Letter_50px.png")));
		lblNewLabel_1_1_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_2_1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_2_1.setBounds(46, 430, 59, 56);
		panel_1.add(lblNewLabel_1_1_2_2_1);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_1_1_1.setBounds(117, 405, 133, 38);
		panel_1.add(lblNewLabel_1_1_2_1_1_1);
		
		JCTextField txt_email = new JCTextField();
		txt_email.setPlaceholder("Enter Email..");
		txt_email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_email.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_email.setBackground(new Color(102, 102, 255));
		txt_email.setBounds(115, 460, 270, 32);
		panel_1.add(txt_email);
		
		JLabel lblNewLabel_1_1_2_2_1_1 = new JLabel("");
		lblNewLabel_1_1_2_2_1_1.setIcon(new ImageIcon(SignupPage.class.getResource("/icons/icons8_Google_Mobile_50px.png")));
		lblNewLabel_1_1_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_2_1_1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_2_1_1.setBounds(46, 538, 59, 56);
		panel_1.add(lblNewLabel_1_1_2_2_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1_1_1 = new JLabel("Contact");
		lblNewLabel_1_1_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_1_1_1_1.setBounds(117, 513, 133, 38);
		panel_1.add(lblNewLabel_1_1_2_1_1_1_1);
		
		JCTextField txt_contact = new JCTextField();
		txt_contact.setPlaceholder("Enter Contact no..");
		txt_contact.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_contact.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_contact.setBackground(new Color(102, 102, 255));
		txt_contact.setBounds(115, 568, 270, 32);
		panel_1.add(txt_contact);
		
		RSMaterialButtonCircle mtrlbtncrclSignup = new RSMaterialButtonCircle();
		mtrlbtncrclSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (validateSignup(txt_username, txt_password, txt_email, txt_contact) == true) {
					if (checkDuplicateUser(lblNewLabel_1_1_2_1_1_1_1) == false) {
						insertSignupDetails(txt_username, txt_password, txt_email, txt_contact);					
						
					} else {
						JOptionPane.showMessageDialog(frame, "Username already exist");
					}
						
				}
			}
		});
		mtrlbtncrclSignup.setFont(new Font("Dialog", Font.BOLD, 19));
		mtrlbtncrclSignup.setText("SIGNUP");
		mtrlbtncrclSignup.setBackground(new Color(255, 51, 51));
		mtrlbtncrclSignup.setBounds(118, 627, 235, 68);
		panel_1.add(mtrlbtncrclSignup);
		
		RSMaterialButtonCircle Login = new RSMaterialButtonCircle();
		Login.setText("Login");
		Login.setFont(new Font("Dialog", Font.BOLD, 19));
		Login.setBackground(new Color(0, 0, 255));
		Login.setBounds(118, 695, 235, 68);
		panel_1.add(Login);
		
		JLabel lblNewLabel_1_1_3 =  new JLabel("Create New Account Here");
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_3.setBounds(79, 107, 311, 38);
		panel_1.add(lblNewLabel_1_1_3);
	}
}
