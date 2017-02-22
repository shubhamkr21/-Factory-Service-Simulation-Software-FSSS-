import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adj_details extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea ;
	/**
	 * Launch the application.
	 */
	

	public JTextArea getTextArea() {
		return textArea;
	}


	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}


	/**
	 * Create the frame.
	 */
	public adj_details() {
		setTitle("Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(62, 21, 302, 164);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(102, 255, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(161, 210, 89, 29);
		contentPane.add(btnNewButton);
	}
}
