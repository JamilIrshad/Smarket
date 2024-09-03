package smarket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.k33ptoo.components.KGradientPanel;

import net.proteanit.sql.DbUtils;

import com.k33ptoo.components.KButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class dashboard extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Double q;
	private Double r;
	private Double p;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard frame = new dashboard();
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
	public dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 50, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkStartColor(new Color(0, 204, 204));
		gradientPanel.setkEndColor(new Color(204, 0, 204));
		gradientPanel.setBounds(0, 0, 160, 563);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		KButton btnDashboard = new KButton();
		btnDashboard.kSelectedColor = Color.WHITE;
		btnDashboard.setkSelectedColor(Color.WHITE);
		
		
		btnDashboard.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnDashboard.setText("Dashboard");
		btnDashboard.kHoverEndColor = Color.WHITE;
		btnDashboard.setkHoverEndColor(Color.WHITE);
		btnDashboard.kHoverStartColor = Color.WHITE;
		btnDashboard.kIndicatorThickness = 0;
		btnDashboard.setkIndicatorThickness(0);
		btnDashboard.kPressedColor = Color.WHITE;
		btnDashboard.setkPressedColor(Color.WHITE);
		btnDashboard.setkHoverStartColor(Color.WHITE);
		btnDashboard.setkHoverForeGround(Color.BLACK);
		btnDashboard.kBorderRadius = 20;
		btnDashboard.setkBorderRadius(0);
		btnDashboard.setBounds(0, 155, 160, 58);
		gradientPanel.add(btnDashboard);
		btnDashboard.setkStartColor(new Color(106, 90, 205));
		btnDashboard.setkEndColor(new Color(204, 0, 204));
		
		KButton btnProducts = new KButton();
		btnProducts.setText("Products");
		btnProducts.kStartColor = new Color(0, 204, 204);
		btnProducts.setkStartColor(new Color(106, 90, 205));
		btnProducts.kPressedColor = Color.WHITE;
		btnProducts.setkPressedColor(Color.WHITE);
		btnProducts.kIndicatorThickness = 0;
		btnProducts.setkIndicatorThickness(0);
		btnProducts.kHoverStartColor = Color.WHITE;
		btnProducts.setkHoverStartColor(Color.WHITE);
		btnProducts.kHoverForeGround = Color.BLACK;
		btnProducts.setkHoverForeGround(Color.BLACK);
		btnProducts.kHoverEndColor = Color.WHITE;
		btnProducts.setkHoverEndColor(Color.WHITE);
		btnProducts.kEndColor = new Color(204, 0, 204);
		btnProducts.setkEndColor(new Color(204, 0, 204));
		btnProducts.kBorderRadius = 0;
		btnProducts.setkBorderRadius(0);
		btnProducts.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnProducts.setBounds(0, 211, 160, 58);
		gradientPanel.add(btnProducts);
		
		KButton btnCategories = new KButton();
		btnCategories.setText("Categories");
		btnCategories.kStartColor = new Color(0, 204, 204);
		btnCategories.setkStartColor(new Color(106, 90, 205));
		btnCategories.kPressedColor = Color.WHITE;
		btnCategories.setkPressedColor(Color.WHITE);
		btnCategories.kIndicatorThickness = 0;
		btnCategories.setkIndicatorThickness(0);
		btnCategories.kHoverStartColor = Color.WHITE;
		btnCategories.setkHoverStartColor(Color.WHITE);
		btnCategories.kHoverForeGround = Color.BLACK;
		btnCategories.setkHoverForeGround(Color.BLACK);
		btnCategories.kHoverEndColor = Color.WHITE;
		btnCategories.setkHoverEndColor(Color.WHITE);
		btnCategories.kEndColor = new Color(204, 0, 204);
		btnCategories.setkEndColor(new Color(204, 0, 204));
		btnCategories.kBorderRadius = 0;
		btnCategories.setkBorderRadius(0);
		btnCategories.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnCategories.setBounds(0, 268, 160, 58);
		gradientPanel.add(btnCategories);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(dashboard.class.getResource("/smarket/name.png")));
		lblNewLabel.setBounds(26, 0, 124, 138);
		gradientPanel.add(lblNewLabel);
		
		KButton btnQuantity = new KButton();
		
		btnQuantity.setText("Add Stock");
		btnQuantity.kStartColor = new Color(0, 204, 204);
		btnQuantity.setkStartColor(new Color(0, 204, 204));
		btnQuantity.kPressedColor = Color.WHITE;
		btnQuantity.setkPressedColor(Color.WHITE);
		btnQuantity.kIndicatorThickness = 0;
		btnQuantity.setkIndicatorThickness(0);
		btnQuantity.kHoverStartColor = Color.WHITE;
		btnQuantity.setkHoverStartColor(Color.WHITE);
		btnQuantity.kHoverForeGround = Color.BLACK;
		btnQuantity.setkHoverForeGround(Color.BLACK);
		btnQuantity.kHoverEndColor = Color.WHITE;
		btnQuantity.setkHoverEndColor(Color.WHITE);
		btnQuantity.kEndColor = new Color(204, 0, 204);
		btnQuantity.setkEndColor(new Color(204, 0, 204));
		btnQuantity.kBorderRadius = 0;
		btnQuantity.setkBorderRadius(0);
		btnQuantity.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnQuantity.setBounds(0, 327, 160, 58);
		gradientPanel.add(btnQuantity);
		
		KButton btnChangePassword = new KButton();
		
		btnChangePassword.setText("Change Password");
		btnChangePassword.kStartColor = new Color(0, 204, 204);
		btnChangePassword.setkStartColor(new Color(0, 204, 204));
		btnChangePassword.kPressedColor = Color.WHITE;
		btnChangePassword.setkPressedColor(Color.WHITE);
		btnChangePassword.kIndicatorThickness = 0;
		btnChangePassword.setkIndicatorThickness(0);
		btnChangePassword.kHoverStartColor = Color.WHITE;
		btnChangePassword.setkHoverStartColor(Color.WHITE);
		btnChangePassword.kHoverForeGround = Color.BLACK;
		btnChangePassword.setkHoverForeGround(Color.BLACK);
		btnChangePassword.kHoverEndColor = Color.WHITE;
		btnChangePassword.setkHoverEndColor(Color.WHITE);
		btnChangePassword.kEndColor = new Color(204, 0, 204);
		btnChangePassword.setkEndColor(new Color(204, 0, 204));
		btnChangePassword.kBorderRadius = 0;
		btnChangePassword.setkBorderRadius(0);
		btnChangePassword.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnChangePassword.setBounds(0, 385, 160, 58);
		gradientPanel.add(btnChangePassword);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(276, 329, 584, 234);
		contentPane.add(scrollPane);
		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.BOLD, 12));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Quantity"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarche", "root", "");
			String query = "select prod_id, product_name,quantity from products where quantity<10;";
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			JLabel lblNewLabel_1 = new JLabel("Dashboard");
			lblNewLabel_1.setForeground(new Color(204, 0, 204));
			lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
			lblNewLabel_1.setBounds(514, 0, 339, 52);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Low Stock");
			lblNewLabel_1_1.setForeground(new Color(204, 0, 204));
			lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(514, 288, 127, 41);
			contentPane.add(lblNewLabel_1_1);
			
			KGradientPanel gradientPanel_1 = new KGradientPanel();
			gradientPanel_1.kStartColor = new Color(0, 204, 204);
			gradientPanel_1.setkStartColor(new Color(0, 204, 204));
			gradientPanel_1.setBounds(276, 142, 160, 89);
			contentPane.add(gradientPanel_1);
			gradientPanel_1.setLayout(null);
			
			JLabel lblValueOfStock = new JLabel("Inventory Value");
			lblValueOfStock.setBounds(10, 0, 102, 14);
			lblValueOfStock.setFont(new Font("Tahoma", Font.BOLD, 11));
			gradientPanel_1.add(lblValueOfStock);
			lblValueOfStock.setForeground(Color.WHITE);
			
			JLabel value = new JLabel("$ 4000");
			value.setForeground(Color.WHITE);
			value.setFont(new Font("Tahoma", Font.BOLD, 20));
			value.setBounds(10, 25, 168, 53);
			gradientPanel_1.add(value);
			
			KGradientPanel gradientPanel_1_1 = new KGradientPanel();
			gradientPanel_1_1.setkStartColor(new Color(50, 205, 50));
			gradientPanel_1_1.setBounds(700, 142, 160, 89);
			contentPane.add(gradientPanel_1_1);
			gradientPanel_1_1.setLayout(null);
			
			JLabel lblTotalQuantity = new JLabel("Total Quantity");
			lblTotalQuantity.setBounds(10, 0, 101, 14);
			lblTotalQuantity.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblTotalQuantity.setForeground(Color.WHITE);
			gradientPanel_1_1.add(lblTotalQuantity);
			
			JLabel no_quantity = new JLabel("$ 4000");
			no_quantity.setForeground(Color.WHITE);
			no_quantity.setFont(new Font("Tahoma", Font.BOLD, 20));
			no_quantity.setBounds(20, 25, 168, 53);
			gradientPanel_1_1.add(no_quantity);
			
			KGradientPanel gradientPanel_1_2 = new KGradientPanel();
			gradientPanel_1_2.setkGradientFocus(250);
			gradientPanel_1_2.setkEndColor(Color.PINK);
			gradientPanel_1_2.kEndColor = Color.RED;
			gradientPanel_1_2.setkStartColor(Color.PINK);
			gradientPanel_1_2.setBounds(490, 142, 160, 89);
			contentPane.add(gradientPanel_1_2);
			gradientPanel_1_2.setLayout(null);
			
			JLabel lblTotalProducts = new JLabel("Total Products");
			lblTotalProducts.setBounds(10, 0, 90, 14);
			lblTotalProducts.setFont(new Font("Tahoma", Font.BOLD, 11));
			gradientPanel_1_2.add(lblTotalProducts);
			lblTotalProducts.setForeground(Color.WHITE);
			
			JLabel no_product = new JLabel("$ 4000");
			no_product.setForeground(Color.WHITE);
			no_product.setFont(new Font("Tahoma", Font.BOLD, 20));
			no_product.setBounds(20, 25, 168, 53);
			gradientPanel_1_2.add(no_product);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarche", "root", "");
			String query1 = "select sum(quantity) as quantity from products;";
			PreparedStatement pst1 = con1.prepareStatement(query1);
			ResultSet rs1 = pst1.executeQuery();
			while(rs1.next())
			{
				q=Double.parseDouble(rs1.getString("quantity"));
			}
			query1 = "select sum(price) as quantity from products;";
			PreparedStatement pst11 = con1.prepareStatement(query1);
			ResultSet rs11 = pst11.executeQuery();
			while(rs11.next())
			{
				r=Double.parseDouble(rs11.getString("quantity"));
			}
			no_quantity.setText(Double.toString(q));
			q=q*r;
			value.setText("$ "+Double.toString(q));
			
			query1 = "select count(price) as quantity from products;";
			PreparedStatement pst111 = con1.prepareStatement(query1);
			ResultSet rs111 = pst111.executeQuery();
			while(rs111.next())
			{
				p=Double.parseDouble(rs111.getString("quantity"));
			}
			no_product.setText(Double.toString(p));
		}

		catch (Exception e1) {
			System.out.println(e1);

		}
		
		btnCategories.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new categories().setVisible(true);
				dispose();
			}
		});
		
		btnProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new products().setVisible(true);
				dispose();
			}
		});
		
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dashboard().setVisible(true);
				dispose();
			}
		});
		btnQuantity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new sellers().setVisible(true);
				dispose();
			}
		});
		
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new password().setVisible(true);
				dispose();
			}
		});
		
	}
}
