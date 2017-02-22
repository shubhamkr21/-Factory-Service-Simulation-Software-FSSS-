import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class mainpage extends JFrame {

	private JPanel contentPane;
	static configframe cframe = new configframe();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage frame = new mainpage();
					frame.setVisible(true);
					cframe.setVisible(false);
					cframe.addm.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainpage() {
		setTitle("FACTORY SERVICE SIMULATION SOFTWARE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 433, 283);
		contentPane.add(label);
		ImageIcon image = new ImageIcon("src/Factory.jpg");
		Image img = image.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		label.setIcon(image);
		
		cframe.getBtnBack().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cframe.setVisible(false);
				System.exit(0);
			}
		});
		
		JButton btnConfigure = new JButton("CONFIGURE");
		btnConfigure.setBackground(new Color(102, 255, 153));
		btnConfigure.setFont(new Font("Calibri", Font.BOLD, 19));
		btnConfigure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cframe.setVisible(true);
				setVisible(false);
			}
		});
		btnConfigure.setBounds(0, 294, 433, 51);
		contentPane.add(btnConfigure);
	}
}
