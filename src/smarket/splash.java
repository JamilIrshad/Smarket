package smarket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.k33ptoo.components.KGradientPanel;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class splash extends JFrame {

	private JPanel contentPane;
	JProgressBar progressBar = new JProgressBar();
	JLabel Percentage = new JLabel("");
	private final JLabel lblNewLabel_1 = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		splash frame = new splash();
		frame.setVisible(true);
		try {
			for (int i = 0; i <= 100; i++) {
				Thread.sleep(40);
				frame.progressBar.setValue(i);
				frame.Percentage.setText(Integer.toString(i) + "%");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		new login().setVisible(true);
		frame.dispose();
	}

	/**
	 * Create the frame.
	 */
	public splash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 50, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkStartColor(new Color(0, 204, 204));
		gradientPanel.setkEndColor(new Color(204, 0, 204));
		gradientPanel.setBounds(-12, 0, 1008, 578);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		
		progressBar.setBounds(10, 558, 998, 20);
		gradientPanel.add(progressBar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(250, 28, 349, 350);
		Percentage.setForeground(Color.WHITE);
		Percentage.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Percentage.setBounds(500, 474, 166, 73);
		gradientPanel.add(Percentage);
		lblNewLabel_1.setIcon(new ImageIcon(splash.class.getResource("/smarket/logo_white.png")));
		lblNewLabel_1.setBounds(340, 114, 400, 275);
		
		gradientPanel.add(lblNewLabel_1);
		}
}
