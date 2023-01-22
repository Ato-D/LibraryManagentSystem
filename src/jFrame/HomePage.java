package jFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import rojeru_san.complementos.RSTableMetro;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1493, 990);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        //setBounds(100, 100, 1470, 847);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(317, 67, 1174, 923);
		contentPane.add(panel_4);
		
		JPanel panel_5_3 = new JPanel();
		panel_5_3.setLayout(null);
		panel_5_3.setBorder(new MatteBorder(15, 0, 0, 0, (Color) new Color(255, 51, 51)));
		panel_5_3.setBounds(30, 63, 244, 156);
		panel_4.add(panel_5_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel(" 10");
		lblNewLabel_3_1_3.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_Book_Shelf_50px.png")));
		lblNewLabel_3_1_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 50));
		lblNewLabel_3_1_3.setBounds(25, 44, 173, 91);
		panel_5_3.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_3_1_3_1 = new JLabel("No. Of Books");
		lblNewLabel_3_1_3_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_3_1_3_1.setBounds(30, 23, 163, 31);
		panel_4.add(lblNewLabel_3_1_3_1);
		
		JLabel lblNewLabel_3_1_3_1_1 = new JLabel("No. Of Students");
		lblNewLabel_3_1_3_1_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_3_1_3_1_1.setBounds(291, 23, 163, 31);
		panel_4.add(lblNewLabel_3_1_3_1_1);
		
		JPanel panel_5_3_1 = new JPanel();
		panel_5_3_1.setLayout(null);
		panel_5_3_1.setBorder(new MatteBorder(15, 0, 0, 0, (Color) new Color(102, 102, 255)));
		panel_5_3_1.setBounds(301, 63, 241, 156);
		panel_4.add(panel_5_3_1);
		
		JLabel lblNewLabel_3_1_3_2 = new JLabel(" 10");
		lblNewLabel_3_1_3_2.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_People_50px.png")));
		lblNewLabel_3_1_3_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 50));
		lblNewLabel_3_1_3_2.setBounds(25, 44, 173, 91);
		panel_5_3_1.add(lblNewLabel_3_1_3_2);
		
		JLabel lblNewLabel_3_1_3_1_2 = new JLabel("Issued Books");
		lblNewLabel_3_1_3_1_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_3_1_3_1_2.setBounds(559, 23, 163, 31);
		panel_4.add(lblNewLabel_3_1_3_1_2);
		
		JPanel panel_5_3_2 = new JPanel();
		panel_5_3_2.setLayout(null);
		panel_5_3_2.setBorder(new MatteBorder(15, 0, 0, 0, (Color) new Color(255, 51, 51)));
		panel_5_3_2.setBounds(569, 63, 233, 156);
		panel_4.add(panel_5_3_2);
		
		JLabel lblNewLabel_3_1_3_3 = new JLabel(" 10");
		lblNewLabel_3_1_3_3.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_Sell_50px.png")));
		lblNewLabel_3_1_3_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 50));
		lblNewLabel_3_1_3_3.setBounds(25, 44, 173, 91);
		panel_5_3_2.add(lblNewLabel_3_1_3_3);
		
		JLabel lblNewLabel_3_1_3_1_3 = new JLabel("Defaulter List");
		lblNewLabel_3_1_3_1_3.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_3_1_3_1_3.setBounds(827, 23, 163, 31);
		panel_4.add(lblNewLabel_3_1_3_1_3);
		
		JPanel panel_5_3_3 = new JPanel();
		panel_5_3_3.setLayout(null);
		panel_5_3_3.setBorder(new MatteBorder(15, 0, 0, 0, (Color) new Color(102, 102, 255)));
		panel_5_3_3.setBounds(827, 63, 241, 156);
		panel_4.add(panel_5_3_3);
		
		JLabel lblNewLabel_3_1_3_4 = new JLabel(" 10");
		lblNewLabel_3_1_3_4.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_List_of_Thumbnails_50px.png")));
		lblNewLabel_3_1_3_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 50));
		lblNewLabel_3_1_3_4.setBounds(25, 44, 173, 91);
		panel_5_3_3.add(lblNewLabel_3_1_3_4);
		
		JLabel lblNewLabel_3_1_3_1_4 = new JLabel("Student Details");
		lblNewLabel_3_1_3_1_4.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_3_1_3_1_4.setBounds(37, 236, 163, 31);
		panel_4.add(lblNewLabel_3_1_3_1_4);
		
		JLabel lblNewLabel_3_1_3_1_4_1 = new JLabel("Book Details");
		lblNewLabel_3_1_3_1_4_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_3_1_3_1_4_1.setBounds(41, 475, 163, 27);
		panel_4.add(lblNewLabel_3_1_3_1_4_1);
		
		JPanel panelPieChart = new JPanel();
		panelPieChart.setBounds(680, 308, 457, 380);
		panel_4.add(panelPieChart);
		panelPieChart.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Display Pie Chart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     //create dataset
			      DefaultPieDataset barDataset = new DefaultPieDataset( );
			      barDataset.setValue( "IPhone 5s" , new Double( 20 ) );  
			      barDataset.setValue( "SamSung Grand" , new Double( 20 ) );   
			      barDataset.setValue( "MotoG" , new Double( 40 ) );    
			      barDataset.setValue( "Nokia Lumia" , new Double( 10 ) );  
			      
			      //create chart
			       JFreeChart piechart = ChartFactory.createPieChart("mobile sales",barDataset, false,true,false);//explain
			      
			        PiePlot piePlot =(PiePlot) piechart.getPlot();
			      //changing pie chart blocks colors
			        piePlot.setSectionPaint("IPhone 5s", new Color(255,255,102));
			        piePlot.setSectionPaint("SamSung Grand", new Color(102,255,102));
			        piePlot.setSectionPaint("MotoG", new Color(255,102,153));
			        piePlot.setSectionPaint("Nokia Lumia", new Color(0,204,204));
			        
			        piePlot.setBackgroundPaint(Color.white);
			        
			        //create chartPanel to display chart(graph)
			        ChartPanel barChartPanel = new ChartPanel(piechart);
			        panelPieChart.removeAll();
			        panelPieChart.add(barChartPanel, BorderLayout.CENTER);
			        panelPieChart.validate();
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(679, 240, 240, 35);
		panel_4.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 275, 597, 185);
		panel_4.add(scrollPane);
		
		RSTableMetro tableMetro = new RSTableMetro();
		tableMetro.setColorSelBackgound(new Color(255, 51, 51));
		tableMetro.setFuenteFilasSelect(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		tableMetro.setFuenteHead(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		tableMetro.setFuenteFilas(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		tableMetro.setForeground(new Color(255, 51, 51));
		tableMetro.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		tableMetro.setColorFilasForeground2(new Color(255, 51, 51));
		tableMetro.setColorFilasForeground1(new Color(255, 51, 51));
		tableMetro.setColorFilasBackgound2(new Color(255, 255, 255));
		tableMetro.setColorBordeFilas(new Color(102, 102, 255));
		tableMetro.setColorBackgoundHead(new Color(102, 102, 255));
		tableMetro.setColorBordeHead(new Color(102, 102, 255));
		tableMetro.setIntercellSpacing(new Dimension(0, 0));
		tableMetro.setRowHeight(30);
		scrollPane.setViewportView(tableMetro);
		tableMetro.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Derrick Donkoh", "Bsc", null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Student ID", "Name", "Course", "Branch"
			}
		));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(40, 506, 599, 187);
		panel_4.add(scrollPane_1);
		
		RSTableMetro tableMetro_1 = new RSTableMetro();
		tableMetro_1.setColorSelBackgound(new Color(255, 51, 51));
		tableMetro_1.setColorFilasForeground2(new Color(255, 51, 51));
		tableMetro_1.setColorFilasForeground1(new Color(255, 51, 51));
		tableMetro_1.setColorFilasBackgound2(new Color(255, 255, 255));
		tableMetro_1.setColorBordeHead(new Color(102, 102, 255));
		tableMetro_1.setColorBordeFilas(new Color(102, 102, 255));
		tableMetro_1.setColorBackgoundHead(new Color(102, 102, 255));
		tableMetro_1.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		tableMetro_1.setFuenteFilas(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		tableMetro_1.setForeground(new Color(255, 51, 51));
		tableMetro_1.setFuenteFilasSelect(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		tableMetro_1.setFuenteHead(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		tableMetro_1.setRowHeight(30);
		scrollPane_1.setViewportView(tableMetro_1);
		tableMetro_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Derrick Donkoh", "Bsc", null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Book ID", "Name", "Author", "Quantity"
			}
		));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 102, 255));
		panel.setBounds(0, 0, 1491, 68);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_menu_48px_1.png")));
		lblNewLabel.setBounds(10, 0, 48, 60);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 51, 51));
		panel_1.setBounds(71, 6, 4, 60);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Library Management System");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(85, 10, 371, 42);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Welcome, Admin");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/male_user_50px.png")));
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(1206, 9, 215, 44);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("X");
		lblNewLabel_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lblNewLabel_1_1_1_1.setBounds(1445, 0, 36, 42);
		panel.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(51, 51, 51));
		panel_2.setBounds(0, 67, 319, 923);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(255, 51, 51));
		panel_3.setBounds(0, 31, 309, 57);
		panel_2.add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("   Home Page");
		lblNewLabel_2.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_Home_26px_2.png")));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_2.setBounds(41, 19, 156, 31);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(51, 51, 51));
		panel_3_1.setBounds(0, 88, 309, 57);
		panel_2.add(panel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("   LMS DASHBOARD");
		lblNewLabel_2_1.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_Library_26px_1.png")));
		lblNewLabel_2_1.setForeground(new Color(151, 151, 151));
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(43, 21, 204, 31);
		panel_3_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Features");
		lblNewLabel_2_1_1.setForeground(new Color(151, 151, 151));
		lblNewLabel_2_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_2_1_1.setBounds(35, 155, 82, 31);
		panel_2.add(lblNewLabel_2_1_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(51, 51, 51));
		panel_3_2.setBounds(0, 196, 309, 57);
		panel_2.add(panel_3_2);
		
		JLabel lblNewLabel_3_4 = new JLabel("No. Of Books");
		lblNewLabel_3_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3_4.setBounds(0, -54, 133, 22);
		panel_3_2.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_2_2 = new JLabel("   Manage Books");
		lblNewLabel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManageBooks books = new ManageBooks();
				books.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_2.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_Book_26px.png")));
		lblNewLabel_2_2.setForeground(new Color(151, 151, 151));
		lblNewLabel_2_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(43, 21, 192, 31);
		panel_3_2.add(lblNewLabel_2_2);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setLayout(null);
		panel_3_3.setBackground(new Color(51, 51, 51));
		panel_3_3.setBounds(0, 254, 309, 57);
		panel_2.add(panel_3_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("   Manage Students");
		lblNewLabel_2_3.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_Read_Online_26px.png")));
		lblNewLabel_2_3.setForeground(new Color(151, 151, 151));
		lblNewLabel_2_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(39, 18, 186, 31);
		panel_3_3.add(lblNewLabel_2_3);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setLayout(null);
		panel_3_4.setBackground(new Color(51, 51, 51));
		panel_3_4.setBounds(0, 312, 309, 57);
		panel_2.add(panel_3_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("   Issue Book");
		lblNewLabel_2_4.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_Sell_26px.png")));
		lblNewLabel_2_4.setForeground(new Color(151, 151, 151));
		lblNewLabel_2_4.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_2_4.setBounds(44, 21, 156, 31);
		panel_3_4.add(lblNewLabel_2_4);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setLayout(null);
		panel_3_5.setBackground(new Color(51, 51, 51));
		panel_3_5.setBounds(-21, 368, 330, 57);
		panel_2.add(panel_3_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("   Return Book");
		lblNewLabel_2_5.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_Return_Purchase_26px.png")));
		lblNewLabel_2_5.setForeground(new Color(151, 151, 151));
		lblNewLabel_2_5.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_2_5.setBounds(62, 16, 156, 31);
		panel_3_5.add(lblNewLabel_2_5);
		
		JPanel panel_3_6 = new JPanel();
		panel_3_6.setLayout(null);
		panel_3_6.setBackground(new Color(51, 51, 51));
		panel_3_6.setBounds(0, 427, 309, 57);
		panel_2.add(panel_3_6);
		
		JLabel lblNewLabel_2_6 = new JLabel("   View Records");
		lblNewLabel_2_6.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_View_Details_26px.png")));
		lblNewLabel_2_6.setForeground(new Color(151, 151, 151));
		lblNewLabel_2_6.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_2_6.setBounds(45, 10, 156, 31);
		panel_3_6.add(lblNewLabel_2_6);
		
		JPanel panel_3_7 = new JPanel();
		panel_3_7.setLayout(null);
		panel_3_7.setBackground(new Color(51, 51, 51));
		panel_3_7.setBounds(0, 485, 309, 59);
		panel_2.add(panel_3_7);
		
		JLabel lblNewLabel_2_7 = new JLabel("   View Issued Books");
		lblNewLabel_2_7.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_Books_26px.png")));
		lblNewLabel_2_7.setForeground(new Color(151, 151, 151));
		lblNewLabel_2_7.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_2_7.setBounds(47, 10, 201, 31);
		panel_3_7.add(lblNewLabel_2_7);
		
		JPanel panel_3_8 = new JPanel();
		panel_3_8.setLayout(null);
		panel_3_8.setBackground(new Color(51, 51, 51));
		panel_3_8.setBounds(0, 542, 309, 59);
		panel_2.add(panel_3_8);
		
		JLabel lblNewLabel_2_8 = new JLabel("   Defaulter List");
		lblNewLabel_2_8.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_Conference_26px.png")));
		lblNewLabel_2_8.setForeground(new Color(151, 151, 151));
		lblNewLabel_2_8.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_2_8.setBounds(45, 13, 156, 31);
		panel_3_8.add(lblNewLabel_2_8);
		
		JPanel panel_3_9 = new JPanel();
		panel_3_9.setLayout(null);
		panel_3_9.setBackground(new Color(102, 102, 255));
		panel_3_9.setBounds(0, 600, 309, 70);
		panel_2.add(panel_3_9);
		
		JLabel lblNewLabel_2_9 = new JLabel("   Logout");
		lblNewLabel_2_9.setIcon(new ImageIcon(HomePage.class.getResource("/adminIcons/icons8_Exit_26px_2.png")));
		lblNewLabel_2_9.setForeground(Color.WHITE);
		lblNewLabel_2_9.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
		lblNewLabel_2_9.setBounds(49, 18, 156, 31);
		panel_3_9.add(lblNewLabel_2_9);
	}
}
