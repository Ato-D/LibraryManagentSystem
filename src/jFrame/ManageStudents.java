package jFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;

import app.bolivia.swing.JCTextField;
import javax.swing.border.MatteBorder;
import rojerusan.RSMaterialButtonCircle;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageStudents extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageStudents frame = new ManageStudents();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JPanel contentPane;
	private JTable tbl_studentDetails;
	private Frame frame;
	private Object FONT;
	int studentId;
	String studentName;
	String course;
	String branch;
	DefaultTableModel model;

	/**
	 * Create the frame.
	 */
	public ManageStudents() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(20, 20, 1492, 737);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 102, 255));
		panel.setBounds(0, 0, 537, 736);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 51, 51));
		panel_1.setBounds(0, 0, 110, 46);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Back\r\n");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomePage homePage = new HomePage();
				homePage.setVisible(true);
				dispose();
			}
		});
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 10, 102, 27);
		panel_1.add(lblNewLabel);
		
		JLabel lblEnterStudentId = new JLabel("Enter Student Id");
		lblEnterStudentId.setForeground(Color.WHITE);
		lblEnterStudentId.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblEnterStudentId.setBounds(100, 94, 219, 38);
		panel.add(lblEnterStudentId);
		
		JCTextField txt_studentId = new JCTextField();
		txt_studentId.setPlaceholder("Enter Student Id...");
		txt_studentId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_studentId.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_studentId.setBackground(new Color(102, 102, 255));
		txt_studentId.setBounds(100, 148, 358, 32);
		panel.add(txt_studentId);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setIcon(new ImageIcon(ManageStudents.class.getResource("/AddNewBookIcons/icons8_Contact_26px.png")));
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2.setBounds(41, 127, 44, 53);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblEnterStudentName = new JLabel("Enter Student Name");
		lblEnterStudentName.setForeground(Color.WHITE);
		lblEnterStudentName.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblEnterStudentName.setBounds(100, 210, 256, 38);
		panel.add(lblEnterStudentName);
		
		JCTextField txt_studentName = new JCTextField();
		txt_studentName.setPlaceholder("Enter Student Name...");
		txt_studentName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_studentName.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_studentName.setBackground(new Color(102, 102, 255));
		txt_studentName.setBounds(100, 260, 358, 32);
		panel.add(txt_studentName);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("");
		lblNewLabel_1_1_2_1.setIcon(new ImageIcon(ManageStudents.class.getResource("/AddNewBookIcons/icons8_Moleskine_26px.png")));
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_1.setBounds(41, 239, 44, 53);
		panel.add(lblNewLabel_1_1_2_1);
		
		JLabel lblSelectCourse = new JLabel("Enter Your Course");
		lblSelectCourse.setForeground(Color.WHITE);
		lblSelectCourse.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblSelectCourse.setBounds(100, 329, 219, 38);
		panel.add(lblSelectCourse);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("");
		lblNewLabel_1_1_2_2.setIcon(new ImageIcon(ManageStudents.class.getResource("/AddNewBookIcons/icons8_Collaborator_Male_26px.png")));
		lblNewLabel_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_2.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_2.setBounds(41, 359, 44, 53);
		panel.add(lblNewLabel_1_1_2_2);
		
		JLabel lblSelectBranch = new JLabel("Branch");
		lblSelectBranch.setForeground(Color.WHITE);
		lblSelectBranch.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblSelectBranch.setBounds(100, 451, 219, 38);
		panel.add(lblSelectBranch);
		
		JLabel lblNewLabel_1_1_2_3 = new JLabel("");
		lblNewLabel_1_1_2_3.setIcon(new ImageIcon(ManageStudents.class.getResource("/AddNewBookIcons/icons8_Unit_26px.png")));
		lblNewLabel_1_1_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_3.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_3.setBounds(41, 481, 44, 53);
		panel.add(lblNewLabel_1_1_2_3);
		
		JCTextField txt_courseName = new JCTextField();
		txt_courseName.setPlaceholder("Enter Course...");
		txt_courseName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_courseName.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_courseName.setBackground(new Color(102, 102, 255));
		txt_courseName.setBounds(100, 380, 358, 32);
		panel.add(txt_courseName);
		
		JCTextField txt_branch = new JCTextField();
		txt_branch.setPlaceholder("Enter Branch");
		txt_branch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_branch.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_branch.setBackground(new Color(102, 102, 255));
		txt_branch.setBounds(100, 502, 358, 32);
		panel.add(txt_branch);
		
		RSMaterialButtonCircle mtrlbtncrclAdd = new RSMaterialButtonCircle();
		mtrlbtncrclAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (addStudent(txt_studentId, txt_studentName, txt_courseName, txt_branch) == true) {
					JOptionPane.showMessageDialog(frame, "Student Added Successfully");	
					clearTable();
					setStudentDetailsToTable();
				}else {
					JOptionPane.showMessageDialog(frame, "Student Addition Failed");
				}
			}
		});
		mtrlbtncrclAdd.setText("ADD");
		mtrlbtncrclAdd.setFont(new Font("Dialog", Font.BOLD, 19));
		mtrlbtncrclAdd.setBackground(new Color(255, 51, 51));
		mtrlbtncrclAdd.setBounds(30, 587, 158, 70);
		panel.add(mtrlbtncrclAdd);
		
		RSMaterialButtonCircle mtrlbtncrclUpdate = new RSMaterialButtonCircle();
		mtrlbtncrclUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (updateStudent(txt_studentId, txt_studentName, txt_courseName, txt_branch) == true) {
					JOptionPane.showMessageDialog(frame, "Student Updated Successfully");
					clearTable();
					setStudentDetailsToTable();					
				}else {
					JOptionPane.showMessageDialog(frame, "Student Updation Failed");
				}
			}
		});
		mtrlbtncrclUpdate.setText("UPDATE");
		mtrlbtncrclUpdate.setFont(new Font("Dialog", Font.BOLD, 19));
		mtrlbtncrclUpdate.setBackground(new Color(255, 51, 51));
		mtrlbtncrclUpdate.setBounds(189, 588, 156, 68);
		panel.add(mtrlbtncrclUpdate);
		
		RSMaterialButtonCircle mtrlbtncrclDelete = new RSMaterialButtonCircle();
		mtrlbtncrclDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (deleteStudent(txt_studentId) == true) {
					JOptionPane.showMessageDialog(frame, "Student Deleted Successfully");
					clearTable();
					setStudentDetailsToTable();					
				}
			}
		});
		mtrlbtncrclDelete.setText("DELETE");
		mtrlbtncrclDelete.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 19));
		mtrlbtncrclDelete.setBackground(new Color(255, 51, 51));
		mtrlbtncrclDelete.setBounds(353, 590, 147, 68);
		panel.add(mtrlbtncrclDelete);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(532, 0, 956, 700);
		contentPane.add(panel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(102, 102, 255));
		panel_1_1.setBounds(886, 0, 60, 46);
		panel_2.add(panel_1_1);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Verdana", Font.PLAIN, 35));
		lblX.setBounds(10, 0, 55, 48);
		panel_1_1.add(lblX);
		
		JLabel lblNewLabel_1 = new JLabel("  Manage Students");
		lblNewLabel_1.setIcon(new ImageIcon(ManageStudents.class.getResource("/AddNewBookIcons/icons8_Student_Male_100px.png")));
		lblNewLabel_1.setForeground(new Color(255, 51, 51));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(300, 50, 373, 113);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(255, 51, 51));
		panel_3.setBounds(282, 168, 441, 10);
		panel_2.add(panel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 204, 855, 333);
		panel_2.add(scrollPane);
		scrollPane.setForeground(new Color(255,51,51));
		
		tbl_studentDetails = new JTable();
		tbl_studentDetails.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//display the selected row on the panel when the table or the selected row is clicked
				
				int rowNo = tbl_studentDetails.getSelectedRow();
				TableModel model = tbl_studentDetails.getModel();
				
				txt_studentId.setText(model.getValueAt(rowNo, 0).toString());
				txt_studentName.setText(model.getValueAt(rowNo, 1).toString());
                txt_courseName.setText(model.getValueAt(rowNo, 2).toString());
                txt_branch.setText(model.getValueAt(rowNo, 3).toString());
             
			}
		});
		tbl_studentDetails.setRowHeight(35);
		scrollPane.setViewportView(tbl_studentDetails);
		JTableHeader Theader = tbl_studentDetails.getTableHeader();
		//JTableHeader Theader = new JTableHeader();
		Theader.setBackground(new Color(255, 51, 51));
		Theader.setForeground(new Color(255, 255, 255));
	    Theader.setFont(new Font("Yu Gothic Semibold", Font.BOLD, 20));
	    ((DefaultTableCellRenderer)Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER); //Center header Text
	    tbl_studentDetails.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
	    tbl_studentDetails.setSelectionBackground(new Color(255,51,51));
		tbl_studentDetails.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student Id", "Name", "Course", "Branch"
			}
		));
		
		setStudentDetailsToTable();
	}
	
	
	//to set the book details into the table
	public void setStudentDetailsToTable() {
		
		try {
			Connection con = DBConnection.getConnection();
			Statement st = con.createStatement();			
			ResultSet rs = st.executeQuery("select * from student_details");
			
			while(rs.next()) {
				String studentId = rs.getString("student_id");
				String studentName = rs.getString("name");
				String course = rs.getString("course");
				String branch = rs.getString("branch");
				
				//Create an object array using the table heading thus (bookId,bookName,author,quantity);
				Object[] obj = {studentId,studentName,course,branch};
				
				//Initializing the DefaultTableModel to add values in the database into the Jtable
				model = (DefaultTableModel) tbl_studentDetails.getModel();
				model.addRow(obj);
				
			}
			} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public boolean addStudent (JCTextField txt_studentId, JCTextField txt_studentName, JCTextField txt_courseName, JCTextField txt_branch) {
		boolean isAdded = false;
		studentId = Integer.parseInt(txt_studentId.getText());
		studentName = txt_studentName.getText();
		course = txt_courseName.getText();
		branch = txt_branch.getText();
		
		try {
			Connection con = DBConnection.getConnection();
			String sql = "insert into student_details values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, studentId);
			pst.setString(2, studentName);
			pst.setString(3, course);
			pst.setString(4, branch);
			
			int rowCount = pst.executeUpdate();
			if (rowCount > 0) {
				isAdded = true;
			}else {
				isAdded = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isAdded;
	}
	
	//Method Clear table
	
	public void clearTable() {
		DefaultTableModel model = (DefaultTableModel) tbl_studentDetails.getModel();
		model.setRowCount(0);
	}
	
	//method to update book_details
	public boolean updateStudent(JCTextField txt_studentId, JCTextField txt_studentName, JCTextField txt_courseName, JCTextField txt_branch) {
		boolean isUpdated = false;
		studentId = Integer.parseInt(txt_studentId.getText());
		studentName = txt_studentName.getText();
		course = txt_courseName.getText();
		branch = txt_branch.getText();
		
		try {
			Connection con = DBConnection.getConnection();
			String sql = "update student_details set name = ?, course = ?, branch = ? where student_id = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, studentName);
			pst.setString(2, course);
			pst.setString(3, branch);
			pst.setInt(4, studentId);
			
			int rowCount = pst.executeUpdate();
			if(rowCount > 0) {
				isUpdated = true;						
			}else {
				isUpdated = false;
			}					

		} catch (Exception e) {
			e.printStackTrace();
		}
		return isUpdated;
		
	}
	
	//method to delete student_detail
	public boolean deleteStudent(JCTextField txt_studentId) {
		boolean isDeleted = false; 
		studentId = Integer.parseInt(txt_studentId.getText());
		
		try {
			Connection con = DBConnection.getConnection();
			String sql = "delete from student_details where student_id = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, studentId);
			
			int rowCount = pst.executeUpdate();
			if (rowCount > 0) {
				isDeleted = true;
			}else {
				isDeleted = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
		
	}
	
}
