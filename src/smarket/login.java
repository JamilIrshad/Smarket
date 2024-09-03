package smarket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class login extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 50, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkStartColor(new Color(0, 204, 204));
		gradientPanel.setkEndColor(new Color(204, 0, 204));
		gradientPanel.setBounds(-12, 0, 1014, 582);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		textField.setOpaque(false);
		textField.setForeground(Color.WHITE);
		textField.setCaretColor(Color.WHITE);
		textField.setBounds(524, 214, 283, 31);
		gradientPanel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		passwordField.setOpaque(false);
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		passwordField.setCaretColor(Color.WHITE);
		
		passwordField.setBounds(524, 306, 283, 31);
		gradientPanel.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(524, 191, 71, 31);
		gradientPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(524, 277, 97, 44);
		gradientPanel.add(lblNewLabel_1);
		
		KButton btnSignIn = new KButton();
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class. forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smarche","root","");
					String query="select privilege from users where username=? and password=?";
					PreparedStatement pst=con.prepareStatement (query);
					pst.setString(1, textField.getText());
					pst.setString(2, String.valueOf(passwordField.getPassword()));
					ResultSet rs=pst.executeQuery();
					
					if(rs.next()) {
						if(Integer.parseInt(rs.getString(1))==1)
						{
							new dashboard().show();
							dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Seller");
							//new seller().show
							//dispose();
						}
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
		
		btnSignIn.setText("Sign In");
		btnSignIn.kStartColor = Color.WHITE;
		btnSignIn.setkStartColor(Color.WHITE);
		btnSignIn.kSelectedColor = Color.MAGENTA;
		btnSignIn.setkSelectedColor(Color.MAGENTA);
		btnSignIn.kPressedColor = Color.LIGHT_GRAY;
		btnSignIn.setkPressedColor(Color.LIGHT_GRAY);
		btnSignIn.kHoverForeGround = new Color(255, 204, 255);
		btnSignIn.setkHoverForeGround(new Color(255, 204, 255));
		btnSignIn.kFillButton = false;
		btnSignIn.setkFillButton(false);
		btnSignIn.kEndColor = new Color(0, 204, 204);
		btnSignIn.setkEndColor(new Color(0, 204, 204));
		btnSignIn.kBorderRadius = 40;
		btnSignIn.setkBorderRadius(40);
		btnSignIn.setBorderPainted(false);
		btnSignIn.setBounds(615, 365, 97, 44);
		gradientPanel.add(btnSignIn);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(login.class.getResource("user.png")));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(617, 79, 81, 70);
		gradientPanel.add(lblNewLabel_3);
		
		JLabel lblSupermarket = new JLabel("Inventory\r\n");
		lblSupermarket.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblSupermarket.setForeground(Color.WHITE);
		lblSupermarket.setBounds(177, 288, 149, 91);
		gradientPanel.add(lblSupermarket);
		
		JLabel lblManagement = new JLabel("Management");
		lblManagement.setForeground(Color.WHITE);
		lblManagement.setFont(new Font("Segoe UI", Font.BOLD, 26));
		lblManagement.setBounds(157, 339, 265, 83);
		gradientPanel.add(lblManagement);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(login.class.getResource("/smarket/logo_white.png")));
		lblNewLabel_4.setBounds(47, 27, 414, 244);
		gradientPanel.add(lblNewLabel_4);
		
		
	}
}
