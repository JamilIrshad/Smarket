package smarket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;

public class password extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField old_pass;
	private JPasswordField new_pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					password frame = new password();
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
	public password() {
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
		
		JLabel lblNewLabel_1_3 = new JLabel("New Password");
		lblNewLabel_1_3.setForeground(new Color(0, 51, 0));
		lblNewLabel_1_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(269, 231, 134, 52);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Username\r\n");
		lblNewLabel_1_1.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(300, 105, 89, 52);
		contentPane.add(lblNewLabel_1_1);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBorder(new LineBorder(Color.BLACK, 1, true));
		username.setBounds(413, 115, 315, 30);
		contentPane.add(username);
		
		JLabel lblNewLabel_1_2 = new JLabel("Old Password\r\n");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(273, 168, 119, 52);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("Change Password");
		lblNewLabel_1.setForeground(new Color(204, 0, 204));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setBounds(423, 11, 339, 52);
		contentPane.add(lblNewLabel_1);
		
		KButton btnConfirm = new KButton();
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class. forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smarche","root","");
					String query="select privilege from users where username=? and password=?";
					PreparedStatement pst=con.prepareStatement (query);
					pst.setString(1, username.getText());
					pst.setString(2, String.valueOf(old_pass.getPassword()));
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						String query1="update users set password='"+String.valueOf(new_pass.getPassword())+"' where username=?";
						PreparedStatement pst1=con.prepareStatement(query1);
						pst1.setString(1, username.getText());
						pst1.execute();
						JOptionPane.showMessageDialog(null,"Password Change Successful....");
					}
					else {
						JOptionPane.showMessageDialog(null,"User not found/ Incorrect Password....");
					}
				}
				catch(Exception e2)
				{
					
				}
			}
		});
		btnConfirm.setText("Confirm");
		btnConfirm.kHoverStartColor = new Color(255, 51, 51);
		btnConfirm.setkHoverStartColor(new Color(255, 51, 51));
		btnConfirm.kHoverForeGround = Color.WHITE;
		btnConfirm.setkHoverForeGround(Color.WHITE);
		btnConfirm.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnConfirm.setBounds(413, 341, 82, 35);
		contentPane.add(btnConfirm);
		
		KButton btnClear = new KButton();
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username.setText(null);
				old_pass.setText(null);
				new_pass.setText(null);
			}
		});
		btnClear.setText("Clear");
		btnClear.kHoverStartColor = new Color(255, 51, 51);
		btnClear.setkHoverStartColor(new Color(255, 51, 51));
		btnClear.kHoverForeGround = Color.WHITE;
		btnClear.setkHoverForeGround(Color.WHITE);
		btnClear.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnClear.setBounds(646, 341, 82, 35);
		contentPane.add(btnClear);
		
		old_pass = new JPasswordField();
		old_pass.setBounds(413, 178, 315, 30);
		contentPane.add(old_pass);
		
		new_pass = new JPasswordField();
		new_pass.setBounds(413, 245, 315, 30);
		contentPane.add(new_pass);
		
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
