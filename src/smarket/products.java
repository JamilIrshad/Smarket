package smarket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;
import com.mysql.cj.protocol.Resultset;

import net.proteanit.sql.DbUtils;
import javax.swing.JComboBox;

public class products extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTable table;
	private JTextField price;
	private JTextField name;
	private JComboBox comboBox;
	public int cat_id=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					products frame = new products();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void fillComboBox()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarche", "root", "");
			String query = "select * from categories";
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				comboBox.addItem(rs.getString("Category"));
			}
		}

		catch (Exception e1) {
			System.out.println(e1);

		}
	}

	/**
	 * Create the frame.
	 */
	public products() {
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

		JLabel lblNewLabel_1_2 = new JLabel("ID");
		lblNewLabel_1_2.setForeground(new Color(0, 51, 102));
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(289, 57, 57, 52);
		contentPane.add(lblNewLabel_1_2);

		id = new JTextField();
		lblNewLabel_1_2.setLabelFor(id);
		id.setBorder(new LineBorder(Color.BLACK));
		id.setColumns(10);
		id.setBounds(343, 73, 141, 22);
		contentPane.add(id);

		KButton btnAdd = new KButton();
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarche", "root", "");
					String query = "insert into products values(?,?,?,0,?)";
					PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1, id.getText());
					pst.setString(2, name.getText());
					pst.setString(3, price.getText());
					pst.setString(4,Integer.toString(cat_id));
					pst.execute();

					JOptionPane.showMessageDialog(null, "Saved...");
					id.setText(null);
					name.setText(null);
					price.setText(null);
					String query1 = "select prod_id, product_name,price,quantity, cat.category from products prod join categories cat on cat.cat_id=prod.category_id;";
					PreparedStatement pst1 = con.prepareStatement(query1);
					ResultSet rs = pst1.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});

		btnAdd.setkHoverStartColor(new Color(255, 51, 51));
		btnAdd.kHoverForeGround = Color.WHITE;
		btnAdd.setkHoverForeGround(Color.WHITE);
		btnAdd.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdd.setText("Add");
		btnAdd.setBounds(276, 180, 82, 35);
		contentPane.add(btnAdd);

		KButton btnEdit = new KButton();
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smarche","root","");
					
					String query="update products set prod_id='"+id.getText()+"', product_name= '"+name.getText()+"', "
							+ "price= '"+price.getText()+"'  where prod_id=?";
					PreparedStatement pst=con.prepareStatement(query);
					pst.setString(1, id.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null,"Update...");
					String query2="select prod_id, product_name,price,quantity, cat.category from products prod join categories cat on cat.cat_id=prod.category_id;";
					PreparedStatement pst2=con.prepareStatement(query2);
					ResultSet rs=pst2.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					}
					catch(Exception e1)
					{
						System.out.println(e1);
					}
			}
		});
		btnEdit.setFont(new Font("Segoe UI", Font.BOLD, 12));

		btnEdit.setkHoverForeGround(Color.WHITE);
		btnEdit.kHoverStartColor = new Color(255, 51, 51);
		btnEdit.kHoverForeGround = Color.WHITE;
		btnEdit.setText("Update");
		btnEdit.setBounds(443, 181, 82, 35);
		contentPane.add(btnEdit);

		KButton btnDelete = new KButton();
		btnDelete.setFont(new Font("Segoe UI", Font.BOLD, 12));

		btnDelete.kHoverStartColor = new Color(255, 51, 51);
		btnDelete.setkHoverStartColor(new Color(255, 51, 51));
		btnDelete.kHoverForeGround = Color.WHITE;
		btnDelete.setkHoverForeGround(Color.WHITE);
		btnDelete.setText("Delete\r\n");
		btnDelete.setBounds(615, 181, 82, 35);
		contentPane.add(btnDelete);

		KButton btnClear = new KButton();
		btnClear.setFont(new Font("Segoe UI", Font.BOLD, 12));

		btnClear.kHoverStartColor = new Color(255, 51, 51);
		btnClear.setkHoverStartColor(new Color(255, 51, 51));
		btnClear.kHoverForeGround = Color.WHITE;
		btnClear.setkHoverForeGround(Color.WHITE);
		btnClear.setText("Clear");
		btnClear.setBounds(778, 181, 82, 35);
		contentPane.add(btnClear);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(276, 242, 584, 321);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {

					int row = table.getSelectedRow();
					String cat_id_ = (table.getModel().getValueAt(row, 0)).toString();

					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarche", "root", "");

					String query = "select * from products prod join categories cat on cat.cat_id=prod.category_id where prod_id='" +cat_id_+"';";
					PreparedStatement pst = con.prepareStatement(query);
					ResultSet rs = pst.executeQuery();

					while (rs.next()) {
						id.setText(rs.getString("prod_id"));
						name.setText(rs.getString("product_name"));
						price.setText(rs.getString("price"));
						String category=rs.getString("category");
						comboBox.setSelectedItem(category);
					}
					pst.close();

				}

				catch (Exception e1) {
					System.out.println(e1);

				}
			}
		});
		table.setFont(new Font("Segoe UI", Font.BOLD, 12));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Price", "Quantity", "Category"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarche", "root", "");
			String query = "select prod_id, product_name,price,quantity, cat.category from products prod join categories cat on cat.cat_id=prod.category_id;";
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));

		}

		catch (Exception e1) {
			System.out.println(e1);

		}

		KButton show = new KButton();
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarche", "root", "");
					String query = "select prod_id, product_name,price,quantity, cat.category from products prod join categories cat on cat.cat_id=prod.category_id;";
					PreparedStatement pst = con.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));

				}

				catch (Exception e1) {
					System.out.println(e1);

				}
			}
		});
		show.setFont(new Font("Segoe UI", Font.BOLD, 12));
		show.setText("Show Record");
		show.kHoverStartColor = new Color(255, 51, 51);
		show.setkHoverStartColor(new Color(255, 51, 51));
		show.kHoverForeGround = Color.WHITE;
		show.setkHoverForeGround(Color.WHITE);
		show.setBounds(894, 269, 82, 35);
		contentPane.add(show);
		
		JLabel lblNewLabel_1 = new JLabel("Add/Remove Products");
		lblNewLabel_1.setForeground(new Color(204, 0, 204));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setBounds(429, 0, 339, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Price\r\n");
		lblNewLabel_1_2_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(276, 106, 57, 52);
		contentPane.add(lblNewLabel_1_2_1);
		
		price = new JTextField();
		price.setColumns(10);
		price.setBorder(new LineBorder(Color.BLACK));
		price.setBounds(343, 122, 141, 22);
		contentPane.add(price);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Name");
		lblNewLabel_1_2_2.setForeground(new Color(0, 51, 102));
		lblNewLabel_1_2_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_1_2_2.setBounds(548, 57, 57, 52);
		contentPane.add(lblNewLabel_1_2_2);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBorder(new LineBorder(Color.BLACK));
		name.setBounds(615, 73, 141, 22);
		contentPane.add(name);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Category");
		lblNewLabel_1_2_3.setForeground(new Color(0, 51, 102));
		lblNewLabel_1_2_3.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_1_2_3.setBounds(533, 106, 57, 52);
		contentPane.add(lblNewLabel_1_2_3);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarche", "root", "");

					String query = "select cat_id from categories where category=?";

					PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1, (String)comboBox.getSelectedItem());
					ResultSet rs=pst.executeQuery();
					while(rs.next()) {
						cat_id=Integer.parseInt(rs.getString("cat_id"));
					}
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		comboBox.setBounds(615, 122, 141, 22);
		contentPane.add(comboBox);
		fillComboBox();

		btnCategories.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new products().setVisible(true);
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

		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarche", "root", "");

					String query = "delete from products where prod_id=?";

					PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1, id.getText());
					pst.execute();
				} catch (Exception e1) {
					System.out.println(e1);
				}
				id.setText(null);
				name.setText(null);
				price.setText(null);
				JOptionPane.showMessageDialog(null, "Deleted...");
			}
		});

		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText(null);
				name.setText(null);
				price.setText(null);
			}
		});
		
	}
}
