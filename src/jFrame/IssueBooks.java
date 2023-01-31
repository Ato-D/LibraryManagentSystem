package jFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import app.bolivia.swing.JCTextField;
import javax.swing.border.MatteBorder;
import rojeru_san.componentes.RSDateChooser;
import rojerusan.RSMaterialButtonCircle;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IssueBooks extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBooks frame = new IssueBooks();
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
	public IssueBooks() {
		setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1290, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 51, 51));
		panel.setBounds(0, 0, 374, 718);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(102, 102, 255));
		panel_1.setBounds(0, 0, 110, 46);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Back");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(IssueBooks.class.getResource("/AddNewBookIcons/icons8_Rewind_48px.png")));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblNewLabel.setBounds(0, 10, 100, 26);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("  Book Details");
		lblNewLabel_1.setIcon(new ImageIcon(IssueBooks.class.getResource("/AddNewBookIcons/icons8_Literature_100px_1.png")));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(60, 150, 277, 108);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(new Rectangle(0, 0, 0, 5));
		panel_2.setBounds(33, 264, 312, 6);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Book Id:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(20, 324, 99, 27);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Book Name:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(20, 386, 120, 27);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Author:");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(20, 452, 99, 27);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Quantity:");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(20, 512, 99, 27);
		panel.add(lblNewLabel_2_3);
		
		JLabel lbl_bookId = new JLabel("");
		lbl_bookId.setForeground(Color.WHITE);
		lbl_bookId.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lbl_bookId.setBounds(161, 324, 131, 27);
		panel.add(lbl_bookId);
		
		JLabel lbl_bookName = new JLabel("");
		lbl_bookName.setForeground(Color.WHITE);
		lbl_bookName.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lbl_bookName.setBounds(161, 386, 161, 27);
		panel.add(lbl_bookName);
		
		JLabel lbl_author = new JLabel("");
		lbl_author.setForeground(Color.WHITE);
		lbl_author.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lbl_author.setBounds(153, 452, 169, 27);
		panel.add(lbl_author);
		
		JLabel lbl_quantity = new JLabel("");
		lbl_quantity.setForeground(Color.WHITE);
		lbl_quantity.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lbl_quantity.setBounds(153, 512, 169, 27);
		panel.add(lbl_quantity);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(102, 102, 255));
		panel_3.setBounds(394, 0, 396, 718);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Student Details");
		lblNewLabel_1_1.setIcon(new ImageIcon(IssueBooks.class.getResource("/AddNewBookIcons/icons8_Student_Registration_100px_2.png")));
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(60, 150, 277, 108);
		panel_3.add(lblNewLabel_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(new Rectangle(0, 0, 0, 5));
		panel_2_1.setBounds(50, 265, 312, 6);
		panel_3.add(panel_2_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Student Id:");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(20, 324, 110, 27);
		panel_3.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Student Name:");
		lblNewLabel_2_1_4.setForeground(Color.WHITE);
		lblNewLabel_2_1_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblNewLabel_2_1_4.setBounds(20, 386, 141, 27);
		panel_3.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Course Name:");
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblNewLabel_2_2_1.setBounds(20, 452, 141, 27);
		panel_3.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Branch:");
		lblNewLabel_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblNewLabel_2_3_1.setBounds(20, 512, 82, 27);
		panel_3.add(lblNewLabel_2_3_1);
		
		JLabel lbl_studentId = new JLabel("");
		lbl_studentId.setForeground(Color.WHITE);
		lbl_studentId.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lbl_studentId.setBounds(161, 324, 131, 27);
		panel_3.add(lbl_studentId);
		
		JLabel lbl_studentName = new JLabel("");
		lbl_studentName.setForeground(Color.WHITE);
		lbl_studentName.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lbl_studentName.setBounds(161, 386, 161, 27);
		panel_3.add(lbl_studentName);
		
		JLabel lbl_course = new JLabel("");
		lbl_course.setForeground(Color.WHITE);
		lbl_course.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lbl_course.setBounds(161, 452, 169, 27);
		panel_3.add(lbl_course);
		
		JLabel lbl_branch = new JLabel("");
		lbl_branch.setForeground(Color.WHITE);
		lbl_branch.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lbl_branch.setBounds(153, 512, 169, 27);
		panel_3.add(lbl_branch);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(789, 0, 487, 718);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(new Color(255, 51, 51));
		panel_2_1_1.setForeground(new Color(255, 51, 51));
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(new Rectangle(0, 0, 0, 5));
		panel_2_1_1.setBounds(116, 259, 312, 6);
		panel_4.add(panel_2_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("  Issue Book");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(IssueBooks.class.getResource("/AddNewBookIcons/icons8_Books_52px_1.png")));
		lblNewLabel_1_1_1.setForeground(new Color(255, 51, 51));
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(151, 184, 230, 65);
		panel_4.add(lblNewLabel_1_1_1);
		
		JLabel lblBookId = new JLabel("Book Id:");
		lblBookId.setForeground(new Color(255, 51, 51));
		lblBookId.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblBookId.setBounds(21, 313, 110, 32);
		panel_4.add(lblBookId);
		
		JCTextField txt_bookId = new JCTextField();
		txt_bookId.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (!txt_bookId.getText().equals("")) {
					getBookDetails(txt_bookId, lbl_bookId, lbl_bookName, lbl_author, lbl_quantity);
					
				}
				
			}
		});
		txt_bookId.setPlaceholder("Enter Book Id...");
		txt_bookId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_bookId.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 51, 51)));
		txt_bookId.setBackground(new Color(255, 255, 255));
		txt_bookId.setBounds(141, 302, 325, 32);
		panel_4.add(txt_bookId);
		
		JLabel lblStudentId = new JLabel("Student Id:");
		lblStudentId.setForeground(new Color(255, 51, 51));
		lblStudentId.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblStudentId.setBounds(21, 378, 110, 32);
		panel_4.add(lblStudentId);
		
		JCTextField txt_studentId = new JCTextField();
		txt_studentId.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (!txt_studentId.getText().equals("")) {
			getStudentDetails(txt_studentId, lbl_studentId, lbl_studentName, lbl_course, lbl_branch);			
					
				}
			}
		});
		txt_studentId.setPlaceholder("Enter Student Id...");
		txt_studentId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_studentId.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 51, 51)));
		txt_studentId.setBackground(Color.WHITE);
		txt_studentId.setBounds(141, 367, 325, 32);
		panel_4.add(txt_studentId);
		
		RSDateChooser date_issueDate = new RSDateChooser();
		date_issueDate.setPlaceholder("Enter Issue Date");
		date_issueDate.setColorForeground(new Color(255, 51, 51));
		date_issueDate.setColorBackground(new Color(255, 51, 51));
		date_issueDate.setBackground(new Color(255, 51, 51));
		date_issueDate.setBounds(141, 445, 325, 40);
		panel_4.add(date_issueDate);
		
		JLabel lblIssueDate = new JLabel("Issue Date:");
		lblIssueDate.setForeground(new Color(255, 51, 51));
		lblIssueDate.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblIssueDate.setBounds(21, 453, 110, 32);
		panel_4.add(lblIssueDate);
		
		JLabel lblDueDate = new JLabel("Due Date:");
		lblDueDate.setForeground(new Color(255, 51, 51));
		lblDueDate.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblDueDate.setBounds(21, 538, 110, 32);
		panel_4.add(lblDueDate);
		
		RSDateChooser date_dueDate = new RSDateChooser();
		date_dueDate.setPlaceholder("Enter Due Date");
		date_dueDate.setColorForeground(new Color(255, 51, 51));
		date_dueDate.setColorBackground(new Color(255, 51, 51));
		date_dueDate.setBackground(new Color(255, 51, 51));
		date_dueDate.setBounds(141, 530, 325, 40);
		panel_4.add(date_dueDate);
		
		RSMaterialButtonCircle mtrlbtncrclIssueBook = new RSMaterialButtonCircle();
		mtrlbtncrclIssueBook.setText("ISSUE BOOK");
		mtrlbtncrclIssueBook.setFont(new Font("Dialog", Font.BOLD, 19));
		mtrlbtncrclIssueBook.setBackground(new Color(255, 51, 51));
		mtrlbtncrclIssueBook.setBounds(151, 598, 290, 70);
		panel_4.add(mtrlbtncrclIssueBook);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(102, 102, 255));
		panel_1_1.setBounds(427, 0, 60, 46);
		panel_4.add(panel_1_1);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Verdana", Font.PLAIN, 35));
		lblX.setBounds(10, 0, 50, 48);
		panel_1_1.add(lblX);
	}
	
	//METHOD TO FETCH DETAILS FROM FROM THE BOOK_DETAILS TABLE AND DISPLAY IT ON THE BOOK DETAILS PANEL
	
	public void getBookDetails(JCTextField txt_bookId, JLabel lbl_bookId, JLabel lbl_bookName, JLabel lbl_author, JLabel lbl_quantity) {
		int bookId = Integer.parseInt(txt_bookId.getText());
		
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from book_details where book_id = ?");
			pst.setInt(1, bookId);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				lbl_bookId.setText(rs.getString("book_id"));
				lbl_bookName.setText(rs.getString("book_name"));
				lbl_author.setText(rs.getString("author"));
				lbl_quantity.setText(rs.getString("quantity"));
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//METHOD TO FETCH DETAILS FROM FROM THE STUDENT_DETAILS TABLE AND DISPLAY IT ON THE STUDDENT DETAILS PANEL
	
	public void getStudentDetails(JCTextField txt_studentId, JLabel lbl_studentId, JLabel lbl_studentName, JLabel lbl_course, JLabel lbl_branch) {
		int studentId = Integer.parseInt(txt_studentId.getText());
		
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from student_details where student_id = ?");
			pst.setInt(1, studentId);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				lbl_studentId.setText(rs.getString("student_id"));
				lbl_studentName.setText(rs.getString("name"));
				lbl_course.setText(rs.getString("course"));
				lbl_branch.setText(rs.getString("branch"));
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
