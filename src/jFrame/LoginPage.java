package jFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.ImageIcon;
import app.bolivia.swing.JCTextField;
import javax.swing.border.MatteBorder;
import rojerusan.RSMaterialButtonCircle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private Component frame;
	private JLabel txt_username;
	private JLabel txt_password;

	/**
	 * Launch the application.
	 */
	
	//validation 
	public boolean validateLogin(JCTextField txt_username, JCTextField txt_password) {
		String name = txt_username.getText();
		String pwd = txt_password.getText();

		
		if (name.equals("")) {
			JOptionPane.showMessageDialog(frame, "Please enter username");
			return false;
		}
		
		
		if (pwd.equals("")) {
			JOptionPane.showMessageDialog(frame, "Please enter password");
			return false;
		}		

		
		return true;
		
	}
	
	
	//verify credentials
	
	public void login(JCTextField txt_username, JCTextField txt_password) {
		String name = txt_username.getText();
		String pwd = txt_password.getText();
		
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from users where name = ? and password = ?");
			
			pst.setString(1, name);
			pst.setString(2, pwd);
			
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				JOptionPane.showMessageDialog(frame, "Login Successful");
				HomePage home = new HomePage();
				home.setVisible(true);
				dispose();
			        				

				
			}else {
				JOptionPane.showMessageDialog(frame, "Incorrect Username or password");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setUndecorated(true);
		setMaximumSize(new Dimension(32767, 32767));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1255, 897);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 785, 897);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SPECIAL");
		lblNewLabel.setForeground(new Color(255, 51, 51));
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblNewLabel.setBounds(38, 31, 163, 38);
		panel.add(lblNewLabel);
		
		JLabel lblDeveloper = new JLabel("Developer");
		lblDeveloper.setForeground(new Color(102, 102, 255));
		lblDeveloper.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblDeveloper.setBounds(191, 31, 163, 38);
		panel.add(lblDeveloper);
		
		JLabel lblWelcomeTo = new JLabel("Welcome To");
		lblWelcomeTo.setForeground(new Color(255, 51, 51));
		lblWelcomeTo.setFont(new Font("Sitka Text", Font.PLAIN, 30));
		lblWelcomeTo.setBounds(333, 132, 236, 38);
		panel.add(lblWelcomeTo);
		
		JLabel lblAdvanceLibrary = new JLabel("Advance Library");
		lblAdvanceLibrary.setForeground(new Color(102, 102, 255));
		lblAdvanceLibrary.setFont(new Font("Sitka Text", Font.PLAIN, 30));
		lblAdvanceLibrary.setBounds(304, 172, 310, 38);
		panel.add(lblAdvanceLibrary);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LoginPage.class.getResource("/icons/library-3.png.png")));
		lblNewLabel_1.setBounds(29, 238, 728, 662);
		panel.add(lblNewLabel_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(784, 0, 472, 897);
		contentPane.add(scrollPane_1);
		
		JPanel panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		panel_1.setBackground(new Color(102, 102, 255));
		panel_1.setLayout(null);
		
		JLabel lblLoginPage = new JLabel("Welcome, Login To Your Account");
		lblLoginPage.setForeground(new Color(255, 255, 255));
		lblLoginPage.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblLoginPage.setBounds(68, 117, 350, 38);
		panel_1.add(lblLoginPage);
		
		JLabel lblLoginPage_1 = new JLabel("Login Page");
		lblLoginPage_1.setForeground(Color.WHITE);
		lblLoginPage_1.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblLoginPage_1.setBounds(166, 58, 200, 38);
		panel_1.add(lblLoginPage_1);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblUsername.setBounds(110, 217, 219, 38);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblPassword.setBounds(110, 371, 219, 38);
		panel_1.add(lblPassword);
		
		JCTextField txt_username_1 = new JCTextField();
		txt_username_1.setPlaceholder("Enter username..");
		txt_username_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_username_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_username_1.setBackground(new Color(102, 102, 255));
		txt_username_1.setBounds(110, 284, 308, 32);
		panel_1.add(txt_username_1);
		
		JCTextField txt_password_1 = new JCTextField();
		txt_password_1.setPlaceholder("Enter Password..");
		txt_password_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_password_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_password_1.setBackground(new Color(102, 102, 255));
		txt_password_1.setBounds(110, 419, 308, 32);
		panel_1.add(txt_password_1);
		
		RSMaterialButtonCircle mtrlbtncrclSignup = new RSMaterialButtonCircle();
		mtrlbtncrclSignup.setText("SIGNUP");
		mtrlbtncrclSignup.setFont(new Font("Dialog", Font.BOLD, 19));
		mtrlbtncrclSignup.setBackground(new Color(255, 51, 51));
		mtrlbtncrclSignup.setBounds(57, 633, 375, 68);
		panel_1.add(mtrlbtncrclSignup);
		
		RSMaterialButtonCircle Login = new RSMaterialButtonCircle();
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (validateLogin(txt_username_1, txt_password_1)== true) {
					login(txt_username_1, txt_password_1);
					
				}

			}
		});
		Login.setText("Login");
		Login.setFont(new Font("Dialog", Font.BOLD, 19));
		Login.setBackground(Color.BLUE);
		Login.setBounds(57, 520, 375, 68);
		panel_1.add(Login);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setIcon(new ImageIcon(LoginPage.class.getResource("/icons/icons8_Account_50px.png")));
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2.setBounds(36, 248, 59, 68);
		panel_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("");
		lblNewLabel_1_1_2_1.setIcon(new ImageIcon(LoginPage.class.getResource("/icons/icons8_Secure_50px.png")));
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_1.setBounds(36, 392, 59, 56);
		panel_1.add(lblNewLabel_1_1_2_1);
		
		JLabel lblLoginPage_1_1 = new JLabel("X");
		lblLoginPage_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblLoginPage_1_1.setForeground(Color.WHITE);
		lblLoginPage_1_1.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblLoginPage_1_1.setBounds(412, 10, 50, 38);
		panel_1.add(lblLoginPage_1_1);
	}
}
