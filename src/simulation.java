import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class simulation extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private JButton btnBack;
	private JButton btnAdjusterUtilisation;
	public JButton getBtnAdjusterUtilisation() {
		return btnAdjusterUtilisation;
	}

	public void setBtnAdjusterUtilisation(JButton btnAdjusterUtilisation) {
		this.btnAdjusterUtilisation = btnAdjusterUtilisation;
	}

	public JButton getBtnMachinewiseUtilisation() {
		return btnMachinewiseUtilisation;
	}

	public void setBtnMachinewiseUtilisation(JButton btnMachinewiseUtilisation) {
		this.btnMachinewiseUtilisation = btnMachinewiseUtilisation;
	}

	private JButton btnMachinewiseUtilisation;

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	/**
	 * Create the frame.
	 */
	public simulation() {
		setTitle("Average Simulation");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 502, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 466, 219);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model = (new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Field", "Percentage Utilisation"
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
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		 btnBack = new JButton("Back");
		 btnBack.setForeground(new Color(255, 0, 0));
		 btnBack.setBackground(new Color(102, 255, 153));
	/*	btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
			}
		});*/
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(200, 300, 89, 25);
		contentPane.add(btnBack);
		
		btnAdjusterUtilisation = new JButton("Adjuster Utilisation");
		btnAdjusterUtilisation.setBackground(new Color(102, 255, 153));
		btnAdjusterUtilisation.setForeground(new Color(0, 0, 102));
		btnAdjusterUtilisation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdjusterUtilisation.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdjusterUtilisation.setBounds(263, 253, 195, 27);
		contentPane.add(btnAdjusterUtilisation);
		
		btnMachinewiseUtilisation = new JButton("Machine \r\nUtilisation");
		btnMachinewiseUtilisation.setForeground(new Color(0, 0, 102));
		btnMachinewiseUtilisation.setBackground(new Color(102, 255, 153));
		btnMachinewiseUtilisation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMachinewiseUtilisation.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMachinewiseUtilisation.setBounds(28, 253, 195, 27);
		contentPane.add(btnMachinewiseUtilisation);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}
}
