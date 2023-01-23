package jFrame;

import java.awt.EventQueue;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import app.bolivia.swing.JCTextField;
import rojeru_san.complementos.RSTableMetro;

import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.text.StyledEditorKit.BoldAction;

import rojerusan.RSMaterialButtonCircle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;

public class ManageBooks extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageBooks frame = new ManageBooks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	private JPanel contentPane;
	String bookName;
	String author;
	int bookId;
	int quantity;
	DefaultTableModel model;
	private JTable tbl_bookDetails;
	private Object FONT;
	//private JLabel txt_bookID;
	private Frame frame;
	

	
	
	/**
	 * Create the frame.
	 */
	public ManageBooks() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(20, 20, 1492, 737);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 102, 255));
		panel.setBounds(0, 4, 537, 690);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 51, 51));
		panel_1.setBounds(0, 0, 110, 46);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Back\r\n");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomePage home = new HomePage();
				home.setVisible(true);
				dispose();
			}
		});
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblNewLabel.setIcon(new ImageIcon(ManageBooks.class.getResource("/AddNewBookIcons/icons8_Rewind_48px.png")));
		lblNewLabel.setBounds(10, 10, 102, 27);
		panel_1.add(lblNewLabel);
		
		JLabel lblEnterBookId = new JLabel("Enter Book Id");
		lblEnterBookId.setForeground(Color.WHITE);
		lblEnterBookId.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblEnterBookId.setBounds(100, 94, 219, 38);
		panel.add(lblEnterBookId);
		
		JCTextField txt_bookID = new JCTextField();
		txt_bookID.setPlaceholder("Enter Book Id...");
		txt_bookID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_bookID.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_bookID.setBackground(new Color(102, 102, 255));
		txt_bookID.setBounds(100, 148, 358, 32);
		panel.add(txt_bookID);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setIcon(new ImageIcon(ManageBooks.class.getResource("/AddNewBookIcons/icons8_Contact_26px.png")));
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2.setBounds(41, 127, 44, 53);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblEnterBookName = new JLabel("Enter Book Name");
		lblEnterBookName.setForeground(Color.WHITE);
		lblEnterBookName.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblEnterBookName.setBounds(100, 210, 219, 38);
		panel.add(lblEnterBookName);
		
		JCTextField txt_bookName = new JCTextField();
		txt_bookName.setPlaceholder("Enter Book Name...");
		txt_bookName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_bookName.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_bookName.setBackground(new Color(102, 102, 255));
		txt_bookName.setBounds(100, 260, 358, 32);
		panel.add(txt_bookName);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("");
		lblNewLabel_1_1_2_1.setIcon(new ImageIcon(ManageBooks.class.getResource("/AddNewBookIcons/icons8_Moleskine_26px.png")));
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_1.setBounds(41, 239, 44, 53);
		panel.add(lblNewLabel_1_1_2_1);
		
		JLabel lblAuthorName = new JLabel("Author Name");
		lblAuthorName.setForeground(Color.WHITE);
		lblAuthorName.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblAuthorName.setBounds(100, 329, 219, 38);
		panel.add(lblAuthorName);
		
		JCTextField txt_authorName = new JCTextField();
		txt_authorName.setPlaceholder("Author Name...");
		txt_authorName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_authorName.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_authorName.setBackground(new Color(102, 102, 255));
		txt_authorName.setBounds(100, 380, 358, 32);
		panel.add(txt_authorName);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("");
		lblNewLabel_1_1_2_2.setIcon(new ImageIcon(ManageBooks.class.getResource("/AddNewBookIcons/icons8_Collaborator_Male_26px.png")));
		lblNewLabel_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_2.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_2.setBounds(41, 359, 44, 53);
		panel.add(lblNewLabel_1_1_2_2);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setForeground(Color.WHITE);
		lblQuantity.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblQuantity.setBounds(100, 451, 219, 38);
		panel.add(lblQuantity);
		
		JCTextField txt_quantity = new JCTextField();
		txt_quantity.setPlaceholder("Quantity...");
		txt_quantity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_quantity.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txt_quantity.setBackground(new Color(102, 102, 255));
		txt_quantity.setBounds(100, 502, 358, 32);
		panel.add(txt_quantity);
		
		JLabel lblNewLabel_1_1_2_3 = new JLabel("");
		lblNewLabel_1_1_2_3.setIcon(new ImageIcon(ManageBooks.class.getResource("/AddNewBookIcons/icons8_Unit_26px.png")));
		lblNewLabel_1_1_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_3.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_1_1_2_3.setBounds(41, 481, 44, 53);
		panel.add(lblNewLabel_1_1_2_3);
		
		RSMaterialButtonCircle mtrlbtncrclAdd = new RSMaterialButtonCircle();
		mtrlbtncrclAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(addBook (txt_bookID, txt_bookName, txt_authorName, txt_quantity) == true) {
					JOptionPane.showMessageDialog(frame, "Book Added Successfully");
					clearTable();
					setBookDetailsToTable();
				}else {
					JOptionPane.showMessageDialog(frame, "Book Addition Failed");
				}
			}
		});
		mtrlbtncrclAdd.setText("ADD");
		mtrlbtncrclAdd.setFont(new Font("Dialog", Font.BOLD, 19));
		mtrlbtncrclAdd.setBackground(new Color(255, 51, 51));
		mtrlbtncrclAdd.setBounds(41, 571, 158, 70);
		panel.add(mtrlbtncrclAdd);
		
		RSMaterialButtonCircle mtrlbtncrclUpdate = new RSMaterialButtonCircle();
		mtrlbtncrclUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(updateBook (txt_bookID, txt_bookName, txt_authorName, txt_quantity) == true) {
					JOptionPane.showMessageDialog(frame, "Book Updated Successfully");
					clearTable();
					setBookDetailsToTable();
				}else {
					JOptionPane.showMessageDialog(frame, "Book Updation Failed");
				}
			}
			
		});
		mtrlbtncrclUpdate.setText("UPDATE");
		mtrlbtncrclUpdate.setFont(new Font("Dialog", Font.BOLD, 19));
		mtrlbtncrclUpdate.setBackground(new Color(255, 51, 51));
		mtrlbtncrclUpdate.setBounds(200, 571, 156, 68);
		panel.add(mtrlbtncrclUpdate);
		
		RSMaterialButtonCircle mtrlbtncrclDelete = new RSMaterialButtonCircle();
		mtrlbtncrclDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(deleteBook (txt_bookID) == true) {
					JOptionPane.showMessageDialog(frame, "Book Deleted Successfully");
					clearTable();
					setBookDetailsToTable();
				}else {
					JOptionPane.showMessageDialog(frame, "Book Deletion Failed");
				}
				
			}
		});
		mtrlbtncrclDelete.setText("DELETE");
		mtrlbtncrclDelete.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 19));
		mtrlbtncrclDelete.setBackground(new Color(255, 51, 51));
		mtrlbtncrclDelete.setBounds(364, 573, 147, 68);
		panel.add(mtrlbtncrclDelete);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(536, 4, 956, 686);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(102, 102, 255));
		panel_1_1.setBounds(886, 0, 60, 46);
		panel_2.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
				
			}
		});
		lblX.setBounds(10, 0, 55, 48);
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setFont(new Font("Verdana", Font.PLAIN, 35));
		panel_1_1.add(lblX);
		
		JLabel lblNewLabel_1 = new JLabel("  Manage Books");
		lblNewLabel_1.setIcon(new ImageIcon(ManageBooks.class.getResource("/AddNewBookIcons/icons8_Books_52px_1.png")));
		lblNewLabel_1.setForeground(new Color(255, 51, 51));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(300, 83, 291, 46);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 51, 51));
		panel_3.setBounds(274, 139, 338, 5);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 204, 791, 333);
		panel_2.add(scrollPane);
		scrollPane.setForeground(new Color(255,51,51));

		
		tbl_bookDetails = new JTable();
		tbl_bookDetails.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//display the selected row on the panel when the table or the selected row is clicked
				int rowNo = tbl_bookDetails.getSelectedRow();
				TableModel model = tbl_bookDetails.getModel();
				
				txt_bookID.setText(model.getValueAt(rowNo, 0).toString());
				txt_bookName.setText(model.getValueAt(rowNo, 1).toString());
				txt_authorName.setText(model.getValueAt(rowNo, 2).toString());
				txt_quantity.setText(model.getValueAt(rowNo, 3).toString());
			}
		});
		tbl_bookDetails.setRowHeight(40);
		scrollPane.setViewportView(tbl_bookDetails);
		JTableHeader Theader = tbl_bookDetails.getTableHeader();
		//JTableHeader Theader = new JTableHeader();
		Theader.setBackground(new Color(255, 51, 51));
		Theader.setForeground(new Color(255, 255, 255));
	    Theader.setFont(new Font("Yu Gothic Semibold", Font.BOLD, 20));
	    ((DefaultTableCellRenderer)Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER); //Center header Text
	    tbl_bookDetails.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
	    tbl_bookDetails.setSelectionBackground(new Color(255,51,51));
		
		
		tbl_bookDetails.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Book Id", "Name", "Author", "Quantity"
			}
		));
		setBookDetailsToTable();
	}
	
	public boolean addBook(JCTextField txt_bookID, JCTextField txt_bookName, JCTextField txt_authorName,
			JCTextField txt_quantity) {
		boolean isAdded = false;
		bookId = Integer.parseInt(txt_bookID.getText());
		bookName = txt_bookName.getText();
		author = txt_authorName.getText();
		quantity = Integer.parseInt(txt_quantity.getText());
		
		try {
			Connection con = DBConnection.getConnection();
			String sql = "insert into book_details values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, bookId);
			pst.setString(2, bookName);
			pst.setString(3, author);
			pst.setInt(4, quantity);
			
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

			//to set the book details into the table
			public void setBookDetailsToTable() {
				
				try {
					Connection con = DBConnection.getConnection();
					Statement st = con.createStatement();			
					ResultSet rs = st.executeQuery("select * from book_details");
					
					while(rs.next()) {
						String bookId = rs.getString("book_id");
						String bookName = rs.getString("book_name");
						String author = rs.getString("author");
						int quantity = rs.getInt("quantity");
						
						//Create an object array using the table heading thus (bookId,bookName,author,quantity);
						Object[] obj = {bookId,bookName,author,quantity};
						
						//Initializing the DefaultTableModel to add values in the database into the Jtable
						model = (DefaultTableModel) tbl_bookDetails.getModel();
						model.addRow(obj);
						
					}
					} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
			
			//Method Clear table
			
			public void clearTable() {
				DefaultTableModel model = (DefaultTableModel) tbl_bookDetails.getModel();
				model.setRowCount(0);
			}
			
			
			//method to update book_details
			public boolean updateBook(JCTextField txt_bookID, JCTextField txt_bookName, JCTextField txt_authorName,
					JCTextField txt_quantity) {
				boolean isAUpdated = false;
				bookId = Integer.parseInt(txt_bookID.getText());
				bookName = txt_bookName.getText();
				author = txt_authorName.getText();
				quantity = Integer.parseInt(txt_quantity.getText());
				
				try {
					Connection con = DBConnection.getConnection();
					String sql = "update book_details set book_name = ?, author = ?, quantity = ? where book_id = ?";
					PreparedStatement pst = con.prepareStatement(sql);
					pst.setString(1, bookName);
					pst.setString(2, author);
					pst.setInt(3, quantity);
					pst.setInt(4, bookId);
					
					int rowCount = pst.executeUpdate();
					if(rowCount > 0) {
						isAUpdated = true;						
					}else {
						isAUpdated = false;
					}					

				} catch (Exception e) {
					e.printStackTrace();
				}
				return isAUpdated;
				
			}
			
			
			//method to delete book_detail
			public boolean deleteBook(JCTextField txt_bookID) {
				boolean isDeleted = false; 
				bookId = Integer.parseInt(txt_bookID.getText());
				
				try {
					Connection con = DBConnection.getConnection();
					String sql = "delete from book_details where book_id = ?";
					PreparedStatement pst = con.prepareStatement(sql);
					pst.setInt(1, bookId);
					
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


