import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class addmach extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnAddMachine;
	private JSpinner spinner;
	private JLabel lblRepairTimein;
	private JSpinner spinner_1;

	public JSpinner getSpinner() {
		return spinner;
	}

	public JButton getButton() {
		return btnAddMachine;
	}


	/**
	 * Create the frame.
	 */
	public addmach() {
		setTitle("Add Machine ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Machine Type :");
		label.setForeground(new Color(0, 0, 102));
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(26, 11, 133, 33);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(165, 11, 190, 33);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("MTTF (Days) :");
		label_1.setForeground(new Color(0, 0, 102));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(26, 67, 133, 33);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(165, 69, 190, 33);
		contentPane.add(textField_1);
		
		JLabel lblQuantity = new JLabel("Quantity (1-1000) :");
		lblQuantity.setForeground(new Color(0, 0, 102));
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantity.setBounds(26, 180, 174, 33);
		contentPane.add(lblQuantity);
		
		spinner = new JSpinner();
		spinner.setBounds(229, 185, 126, 27);
		contentPane.add(spinner);
		
		btnAddMachine = new JButton("Add Machine");
		btnAddMachine.setBackground(new Color(102, 255, 153));
		btnAddMachine.setForeground(new Color(0, 0, 102));
		
		btnAddMachine.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAddMachine.setBounds(117, 249, 126, 33);
		contentPane.add(btnAddMachine);
		
		JButton button_1 = new JButton("Cancel");
		button_1.setForeground(new Color(255, 0, 0));
		button_1.setBackground(new Color(102, 255, 153));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(313, 249, 89, 33);
		contentPane.add(button_1);
		
		lblRepairTimein = new JLabel("Repair Time (in Days) :");
		lblRepairTimein.setForeground(new Color(0, 0, 102));
		lblRepairTimein.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRepairTimein.setBounds(26, 127, 155, 30);
		contentPane.add(lblRepairTimein);
		
		spinner_1 = new JSpinner();
		spinner_1.setBounds(229, 131, 126, 27);
		contentPane.add(spinner_1);
	}


	public JSpinner getSpinner_1() {
		return spinner_1;
	}

	public JTextField getTextField() {
		return textField;
	}


	public void setTextField(JTextField textField) {
		this.textField = textField;
	}


	public JTextField getTextField_1() {
		return textField_1;
	}


	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}
	
	public void reset(){
		textField.setText(null);
		textField_1.setText(null);
		spinner.setValue(1);
		spinner_1.setValue(1);
	}

}
