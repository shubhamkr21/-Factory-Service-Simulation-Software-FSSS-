

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class machine_utilisation_frame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	public JTable getTable() {
		return table;
	}
	public void setTable(JTable table) {
		this.table = table;
	}
	private DefaultTableModel model;
	public DefaultTableModel getModel() {
		return model;
	}
	public void setModel(DefaultTableModel model) {
		this.model = model;
	}
	public JButton getBtnBack() {
		return btnBack;
	}
	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}
	private JButton btnBack;
	private JButton button;
	public JButton getButton() {
		return button;
	}
	public void setButton(JButton button) {
		this.button = button;
	}
	/**
	 * Create the frame.
	 */
	public machine_utilisation_frame() {
		setTitle("Individual Machine Utilisation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 174);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model = (new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Field", "Percentage Utilization"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setModel(model);
		
		 btnBack = new JButton("Back");
		 btnBack.setForeground(new Color(255, 0, 0));
		 btnBack.setBackground(new Color(102, 255, 153));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(295, 212, 96, 30);
		contentPane.add(btnBack);
		
		button = new JButton("Details");
		
		button.setForeground(new Color(0, 0, 153));
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(new Color(102, 255, 153));
		button.setBounds(107, 212, 89, 30);
		contentPane.add(button);
	}
}
