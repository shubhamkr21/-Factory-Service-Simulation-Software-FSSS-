import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class addadjs extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnAddAdjuster;
	private JSpinner spinner_1;
	private JButton btnAddAnotherMachinetype;
	private JComboBox comboBox;
	private JList <String> temp_machine_name;
	private DefaultListModel model;
	private JButton button;
	
	public DefaultListModel getModel() {
		return model;
	}
	public JButton getBtnAddAdjuster() {
		return btnAddAdjuster;
	}
	
	public JSpinner getSpinner_1() {
		return spinner_1;
	}
	
	public JList<String> getTemp_machine_name() {
		return temp_machine_name;
	}
	public JButton getBtnAddAnotherMachinetype() {
		return btnAddAnotherMachinetype;
	}
	
	/**
	 * Create the frame.
	 */
	public addadjs() {
		
		setTitle("Add Adjuster");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdjusterId = new JLabel("Adjuster ID :");
		lblAdjusterId.setForeground(new Color(0, 0, 102));
		lblAdjusterId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdjusterId.setBounds(21, 21, 99, 24);
		contentPane.add(lblAdjusterId);
		
		textField = new JTextField();
		textField.setBounds(184, 21, 138, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblMachineType = new JLabel("Machine Type :");
		lblMachineType.setForeground(new Color(0, 0, 102));
		lblMachineType.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMachineType.setBounds(21, 70, 119, 24);
		contentPane.add(lblMachineType);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.ITALIC, 14));
		comboBox.setBounds(184, 70, 138, 24);
		contentPane.add(comboBox);
		
		model = new DefaultListModel();
		temp_machine_name = new JList <String>(model);
		
		btnAddAnotherMachinetype = new JButton("Add Another MachineType");
		btnAddAnotherMachinetype.setForeground(new Color(0, 0, 102));
		btnAddAnotherMachinetype.setBackground(new Color(102, 255, 153));
		btnAddAnotherMachinetype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.addElement(comboBox.getSelectedItem().toString());
				comboBox.removeItemAt(comboBox.getSelectedIndex());
				if(comboBox.getItemCount() <= 1){
					btnAddAnotherMachinetype.setEnabled(false);
				}
			}
		});
		btnAddAnotherMachinetype.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnAddAnotherMachinetype.setBounds(146, 119, 222, 30);
		contentPane.add(btnAddAnotherMachinetype);
		
		btnAddAdjuster = new JButton("Add Adjuster");
		btnAddAdjuster.setForeground(new Color(0, 0, 102));
		btnAddAdjuster.setBackground(new Color(102, 255, 153));
	/*	btnAddAdjuster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});*/
		btnAddAdjuster.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAddAdjuster.setBounds(103, 236, 138, 33);
		contentPane.add(btnAddAdjuster);
		
		JLabel lblQuantity = new JLabel("Quantity (1-1000) :");
		lblQuantity.setForeground(new Color(0, 0, 102));
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQuantity.setBounds(21, 183, 153, 24);
		contentPane.add(lblQuantity);
		
		spinner_1 = new JSpinner();
		spinner_1.setBounds(190, 184, 62, 26);
		contentPane.add(spinner_1);
		
		button = new JButton("Cancel");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(new Color(102, 255, 153));
		button.setBounds(301, 236, 89, 33);
		contentPane.add(button);
	}
	public JComboBox getComboBox() {
		return comboBox;
	}
	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}
	public JTextField getTextField() {
		return textField;
	}
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	
	public static String concat(ArrayList<String> array) {
	    StringBuilder builder = new StringBuilder("");
	    for (int i = 0; i < array.size(); i++) {
	    	String s = array.get(i);
	    	if(i == array.size() - 1) {
	    		builder.append(s);
	    	}
	    	else
	    		builder.append(s).append(',');
	    }
	    return builder.toString();
	}
	
	public static String concat_int(ArrayList<Integer> array) {
	    StringBuilder builder = new StringBuilder("");
	    for (int i = 0; i < array.size(); i++) {
	    	Integer s = array.get(i);
	    	if(i == array.size() - 1) {
	    		builder.append(s);
	    	}
	    	else
	    		builder.append(s).append(',');
	    }
	    return builder.toString();
	}
}