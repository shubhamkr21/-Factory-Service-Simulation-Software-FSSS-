import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import java.awt.Color;

public class configframe extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JButton btnBack;
	static DefaultTableModel model;
	static DefaultTableModel model_1;
	static simulation siml = new simulation();
	private adjuster_utilization_frame adj_uti = new adjuster_utilization_frame();
	private machine_utilisation_frame machine_uti = new machine_utilisation_frame();
	static addmach addm = new addmach();
	static addadjs addaj = new addadjs();
	static adj_details details =new adj_details();
	static ArrayList <machinetype> mach = new ArrayList <machinetype> ();
	static ArrayList <adjuster_type> adj_group = new ArrayList <adjuster_type> ();
	int size=0;

	public JButton getBtnBack() {
		return btnBack;
	}
	
	/**
	 * Create the frame.
	 */
	public configframe() {
		setBackground(new Color(204, 102, 204));
		setType(Type.POPUP);
		setTitle("CONFIGURE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 814, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 39, 374, 247);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model = (new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Machine Type", "MTTF(Days)", "Repair Time", "Quantity"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setModel(model);
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(414, 39, 374, 247);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		model_1 = (new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Adjuster ID", "Type of Machine(s)", "Quantity"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.setModel(model_1);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(111);
		scrollPane_1.setViewportView(table_1);
		
		adj_uti.getBtnBack().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adj_uti.setVisible(false);
				//adj_uti.getModel().setRowCount(0);
				siml.setVisible(true);
			}
		});
		adj_uti.getBtnDetails().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
				int index=adj_uti.getTable().getSelectedRow();
			//	temp=adj_group.get(index).getId()
				details.getTextArea().setText("Id="+adj_group.get(index).getId()+
						"\nMachines-"+addaj.concat(adj_group.get(index).getMachine_name())+
						"\nQuantity-"+adj_group.get(index).getNoofAdj());
				details.setVisible(true);
				}
				catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "No row selected","ERROR",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		machine_uti.getBtnBack().addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		machine_uti.setVisible(false);
		 		//machine_uti.getModel().setRowCount(0);
				siml.setVisible(true);
		 	}
		 });
		machine_uti.getButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			
				int index=machine_uti.getTable().getSelectedRow();
				details.getTextArea().setText("Name="+mach.get(index).getName()+
						"\nMTTF-"+mach.get(index).getMTTF()+
						"\nQuantity-"+mach.get(index).getQuantity()+
						"\nRepair Time-"+mach.get(index).getRepair_time());
				details.setVisible(true);
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "No row selected","ERROR",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		siml.getBtnAdjusterUtilisation().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adj_uti.setVisible(true);
				
				siml.setVisible(false);
			}
		});
		
		siml.getBtnMachinewiseUtilisation().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				machine_uti.setVisible(true);
				siml.setVisible(false);
			}
		});
		JButton btnAddMachine = new JButton("Add Machine");
		btnAddMachine.setBackground(new Color(102, 255, 153));
		btnAddMachine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addm.reset();
				addm.setVisible(true);
			}
		});
		btnAddMachine.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddMachine.setBounds(47, 304, 303, 36);
		contentPane.add(btnAddMachine);
		
		JButton btnAddAdjuster = new JButton("Add Adjuster");
		btnAddAdjuster.setBackground(new Color(102, 255, 153));
		btnAddAdjuster.setEnabled(false);
		btnAddAdjuster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addaj.getTextField().setText(null);
				addaj.setVisible(true);
				addaj.getSpinner_1().setValue(1);
				int i;
				addaj.getComboBox().removeAllItems();
				for(i=0;i<mach.size();i++)
				{
					addaj.getComboBox().addItem(mach.get(i).getName());
				}
				if(addaj.getComboBox().getItemCount() == 1){
					addaj.getBtnAddAnotherMachinetype().setEnabled(false);
				}
				else {
					addaj.getBtnAddAnotherMachinetype().setEnabled(true);
				}
				addaj.getModel().removeAllElements();
			}
		});
		btnAddAdjuster.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddAdjuster.setBounds(453, 304, 303, 36);
		contentPane.add(btnAddAdjuster);
		
		JLabel lblSimulationInYears = new JLabel("Simulation Time (Years) : ");
		lblSimulationInYears.setForeground(new Color(0, 0, 102));
		lblSimulationInYears.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSimulationInYears.setBounds(138, 410, 246, 36);
		contentPane.add(lblSimulationInYears);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(414, 412, 88, 29);
		contentPane.add(spinner);
		spinner.setValue(1);
		
		JButton btnSimulate = new JButton("Simulate");
		btnSimulate.setBackground(new Color(102, 255, 153));
		btnSimulate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				simulation_function(mach,adj_group,(Integer)spinner.getValue());
				siml.setVisible(true);
				setVisible(false);
	/*			System.out.println("size = "+adj_group.size());
				for(int i =0;i<adj_group.size();i++)
				{
					for(int j=0;j<adj_group.get(i).getMachine_name().size();j++)
						System.out.println("mac - "+adj_group.get(i).getMachine_name().get(j));
				}*/
			}
		});
		
		
		
		siml.getBtnBack().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siml.setVisible(false);
				siml.getModel().setRowCount(0);
				setVisible(true);
			}
		});
		
		btnSimulate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSimulate.setBounds(353, 477, 149, 34);
		contentPane.add(btnSimulate);
		btnSimulate.setEnabled(false);
		
		btnBack = new JButton("Exit");
		btnBack.setForeground(new Color(255, 0, 0));
		btnBack.setBackground(new Color(102, 255, 153));
		
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.setBounds(659, 477, 97, 32);
		contentPane.add(btnBack);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 369, 778, 7);
		contentPane.add(separator);
		
		JLabel lblMachineDetails = new JLabel("Machine Details");
		lblMachineDetails.setForeground(new Color(51, 0, 102));
		lblMachineDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMachineDetails.setBounds(119, 11, 149, 23);
		contentPane.add(lblMachineDetails);
		
		JLabel lblAdjusterdetails = new JLabel("Adjuster Details");
		lblAdjusterdetails.setForeground(new Color(0, 0, 102));
		lblAdjusterdetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdjusterdetails.setBounds(509, 11, 149, 23);
		contentPane.add(lblAdjusterdetails);
		table.getColumnModel().getColumn(0).setPreferredWidth(86);
		
		addm.getButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(addm.getTextField().getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Enter the machine ID","ERROR",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
				int mttf_int=5;
				int check=0;
				try{
					mttf_int=Integer.parseInt(addm.getTextField_1().getText());
				}
				catch(Exception enbfg)
				{
					mttf_int=-2;
				}
				try{
					
					if(mttf_int<0)
					{
						check=1;
						mttf_int=mttf_int/0;
						
					}
					if((Integer)addm.getSpinner_1().getValue()<1||(Integer)addm.getSpinner_1().getValue()>1000)
					{
						check=2;
						mttf_int=mttf_int/0;
						
					}
					for(int i=0; i<mach.size(); i++)
					{
						if(addm.getTextField().getText().equals(mach.get(i).getName()))
						{
							check=3;
							mttf_int=mttf_int/0;
						}
					}
					machinetype temp = new machinetype(addm.getTextField().getText(),mttf_int,(Integer)addm.getSpinner_1().getValue(),(Integer)addm.getSpinner().getValue());
					mach.add(temp);
					Object p [] = {addm.getTextField().getText(),addm.getTextField_1().getText(),(Integer)addm.getSpinner_1().getValue(),(Integer)addm.getSpinner().getValue()};
					model.addRow(p);
					addm.setVisible(false);
					btnAddAdjuster.setEnabled(true);
				}
				catch(Exception ef){
					if(check==1)
					{
						JOptionPane.showMessageDialog(null, "Enter the MTTF as positive integer","ERROR",JOptionPane.ERROR_MESSAGE);
						addm.getTextField_1().setText(null);
						check=0;
					}
					else if(check==2)
					{
						JOptionPane.showMessageDialog(null, "Enter the Quantity in the specified range ","ERROR",JOptionPane.ERROR_MESSAGE);
						check=0;
					}
					else if(check==3)
					{
						JOptionPane.showMessageDialog(null, "such machine already exists","ERROR",JOptionPane.ERROR_MESSAGE);
						check=0;
					}
				}
				
				}
			}
		});
		
		addaj.getBtnAddAdjuster().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(addaj.getTextField().getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Enter the adjuster ID","ERROR",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					
					try{
						if((Integer)addaj.getSpinner_1().getValue()<1||(Integer)addaj.getSpinner_1().getValue()>1000)
						{
							int t=2;
							t=t/0;
						}
						addaj.getModel().addElement(addaj.getComboBox().getSelectedItem().toString());
						JList <String> list = addaj.getTemp_machine_name();
						ArrayList <String> arl = new ArrayList <String> ();
						for(int i=0; i<addaj.getModel().getSize(); i++)
						{
							arl.add(addaj.getModel().getElementAt(i).toString());
						}
						adjuster_type temp= new adjuster_type(addaj.getTextField().getText(),(Integer)addaj.getSpinner_1().getValue(),arl) ;
						adj_group.add(temp);
						String mact = addaj.concat(arl);
						Object p [] = {addaj.getTextField().getText(),mact,(Integer)addaj.getSpinner_1().getValue()};
						model_1.addRow(p);
						addaj.setVisible(false);
						btnSimulate.setEnabled(true);
					}
					catch(Exception p)
					{
						JOptionPane.showMessageDialog(null, "Enter the Quantity in the specified range","ERROR",JOptionPane.ERROR_MESSAGE);
					}
					
				}
			}
		});
			
	}
/*	public void copy(adjuster_type temp2)
	{
		adj_group.add(size,temp2);
		size++;
	}*/
	public void simulation_function(ArrayList <machinetype> mach ,ArrayList <adjuster_type> adj_group, int noofyears)
	{
	//	System.out.println("No of years="+noofyears);	
		int i=0,j=0,k=0;
		int temp_var=0;
		machine [][]machine_array = new machine[101][1005];
		adjuster [][]adjuster_array = new adjuster[101][1005];
		int total_queue_machines=0;
		ArrayList <machine> machine_queue = new ArrayList <machine> ();
		for(i=0;i<101;i++)
		{
			for(j=0;j<1005;j++)
			{
				machine_array[i][j] = new machine();
				adjuster_array[i][j] = new adjuster();
			}
		}
		for(i=0;i<mach.size();i++)
		{
			temp_var=mach.get(i).getQuantity();
			for(j=0;j<temp_var;j++)
			{
				machine_array[i][j].setqStatus(1);
				machine_array[i][j].setTotal_running_days(0);
				machine_array[i][j].setRunningDays(0);
				machine_array[i][j].setRepairing_status(0);
				machine_array[i][j].setGroupid(j);
				machine_array[i][j].setGroup_number(i);
				machine_array[i][j].setName(mach.get(i).getName());
				machine_array[i][j].setRepair_time(mach.get(i).getRepair_time());
			}
		}	
		for(i=0;i<adj_group.size();i++)
		{
			
			for(j=0;j<adj_group.get(i).getNoofAdj();j++)
			{
				adjuster_array[i][j].setTotal_days_worked(0);
				adjuster_array[i][j].setWorking_status(0);	
			}
		}
		int min=10000,flag=0,group=0,flag2=0,n=0,flag3=0,m=0,l=0,adjuster_number=0;
	/*	for(i=0;i<adj_group.size();i++)
		{
			for(j=0;j<adj_group.get(i).getMachine_name().size();j++)
			{
				System.out.println("name="+adj_group.get(i).getMachine_name().get(j));
			}
		}*/
		int noofdays=365*noofyears;
		int p=0;
		total_queue_machines=0;
		for(i=0;i<noofdays;i++)
		{
			for(p=0;p<machine_queue.size();)
			{
				min=10000;
				flag=0;
				flag2=0;
				group=0;
				flag3=0;
				adjuster_number=0;
				for(l=0;l<adj_group.size();l++)
				{
					flag=0;
					flag2=0;	
					for(m=0;m<adj_group.get(l).getMachine_name().size();m++)
					{
						if(machine_queue.get(p).getName().equals(adj_group.get(l).getMachine_name().get(m)))
						{
							flag=1;
							break;
						}	
					}
					if(flag==1)
					{
						for(n=0;n<adj_group.get(l).getNoofAdj();n++)
						{
							if(adjuster_array[l][n].getWorking_status()==0)
								{
									flag2=1;
									break;
								}
						}
					}
					else
					{
						continue;
					}
					if(flag2==1)
					{
						if(min>(adj_group.get(l).getMachine_name().size()-1))
						{
							min=adj_group.get(l).getMachine_name().size()-1;
							group=l;
							flag3=1;
							adjuster_number=n;
							
						}		
					}
				}
				if(flag3==1)
				{
					adjuster_array[group][adjuster_number].setWorking_status(1);
					adjuster_array[group][adjuster_number].setDaysWorked(0); 
					adjuster_array[group][adjuster_number].setRequire_days(machine_queue.get(p).getRepair_time());
				//	machine_queue.get(p).setRepairing_status(1);
					machine_array[machine_queue.get(p).getGroup_number()][machine_queue.get(p).getGroupid()].setRepairing_status(1);
				//	machine_queue.get(p).setRepair_days_count(0);
					machine_array[machine_queue.get(p).getGroup_number()][machine_queue.get(p).getGroupid()].setRepair_days_count(0);
					machine_queue.remove(p);	
				}
				else
				{
					p++;
				}
			}
			for(j=0;j<mach.size();j++)
			{
				for(k=0;k<mach.get(j).getQuantity();k++)
				{
					if(machine_array[j][k].getqStatus()==1)
					{
						machine_array[j][k].setRunningDays(machine_array[j][k].getRunningDays()+1);
						if(machine_array[j][k].getRunningDays()==mach.get(j).getMTTF())
						{
							machine_array[j][k].setTotal_running_days(machine_array[j][k].getTotal_running_days()+mach.get(j).getMTTF());
							machine_array[j][k].setRunningDays(0);
							machine_array[j][k].setqStatus(0);
							machine_array[j][k].setRepairing_status(0);
							machine_queue.add(machine_array[j][k]);
							total_queue_machines++;
						}
		
					}	
					else if(machine_array[j][k].getRepairing_status()==1&&machine_array[j][k].getqStatus()==0)
					{	
						machine_array[j][k].setRepair_days_count(machine_array[j][k].getRepair_days_count()+1);
						if(machine_array[j][k].getRepair_days_count()==mach.get(j).getRepair_time())
						{
							machine_array[j][k].setqStatus(1);
							machine_array[j][k].setRepairing_status(0);
							machine_array[j][k].setRepair_days_count(0);
							machine_array[j][k].setRunningDays(0);
						}	
					}
					else
					{
					//	System.out.println("i="+i);
						// do nothing case in which qstatus=0 and repairing status =0
					}
				}
			}
			for(j=0;j<adj_group.size();j++)
			{
				for(k=0;k<adj_group.get(j).getNoofAdj();k++)
				{
					if(adjuster_array[j][k].getWorking_status()==1)
					{
						adjuster_array[j][k].setDaysWorked(adjuster_array[j][k].getDaysWorked()+1); 
						if(adjuster_array[j][k].getDaysWorked()==adjuster_array[j][k].getRequire_days())
						{
							//System.out.println("check 1");
							adjuster_array[j][k].setTotal_days_worked(adjuster_array[j][k].getTotal_days_worked()+adjuster_array[j][k].getDaysWorked());;
							adjuster_array[j][k].setWorking_status(0);
							adjuster_array[j][k].setDaysWorked(0);
						}
					}					
				}
			}	
			
		}
		
		//adjuster utilisation
		int totalwork=0;
		int total_adjusters=0;
		float adjuster_utilisation ;
		for(j=0;j<adj_group.size();j++)
		{
			total_adjusters+=adj_group.get(j).getNoofAdj();
			for(k=0;k<adj_group.get(j).getNoofAdj();k++)
			{
				totalwork=totalwork+adjuster_array[j][k].getTotal_days_worked()+adjuster_array[j][k].getDaysWorked();
			}
			
		}
		adjuster_utilisation=(((float)(totalwork))/((total_adjusters)*noofdays))*100;
		//System.out.println("adjuster Utiliasation is="+adjuster_utilisation);
		Object [] op = {"Average Adjuster Utilisation",Float.toString(adjuster_utilisation)};
		siml.getModel().addRow(op);
		//machine utilisation
		totalwork=0;
		int total_machines=0;
		float machine_utilisation;
		for(j=0;j<mach.size();j++)
		{
			total_machines+=mach.get(j).getQuantity();
			for(k=0;k<mach.get(j).getQuantity();k++)
			{
				totalwork=totalwork+machine_array[j][k].getTotal_running_days()+machine_array[j][k].getRunningDays();
			}
		}
	
		machine_utilisation=(((float)(totalwork))/((total_machines)*noofdays))*100;
		Object [] op1 = {"Average Machine Utilisation",Float.toString(machine_utilisation)};
		siml.getModel().addRow(op1);
				
				
		
		for(j=0;j<mach.size();j++)
		{
			totalwork=0;
			for(k=0;k<mach.get(j).getQuantity();k++)
			{	
				totalwork=totalwork+machine_array[j][k].getTotal_running_days()+machine_array[j][k].getRunningDays();
			}
			machine_utilisation=(((float)(totalwork))/((mach.get(j).getQuantity())*noofdays))*100;
			Object [] op2 = {"Machine "+(j+1)+" - "+ mach.get(j).getName() , Float.toString(machine_utilisation)};
			machine_uti.getModel().addRow(op2);
		}
		for(j=0;j<adj_group.size();j++)
		{
			totalwork=0;
			for(k=0;k<adj_group.get(j).getNoofAdj();k++)
			{	
				totalwork=totalwork+adjuster_array[j][k].getTotal_days_worked()+adjuster_array[j][k].getDaysWorked();
			}
			adjuster_utilisation=(((float)(totalwork))/((adj_group.get(j).getNoofAdj())*noofdays))*100;
			Object [] op3 = {"Adjuster "+(j+1)+" - "+adj_group.get(j).getId(),Float.toString(adjuster_utilisation)};
			adj_uti.getModel().addRow(op3);
		}
		
		
	}
}
	

/*
machine_array[j][k].setRepairing_status(0);
int min=10000,flag=0,group=0,flag2=0,n=0,flag3=0,m=0,l=0;
for(l=0;l<adj_group.size();l++)
{
	flag=0;
	flag2=0;
	for(m=0;m<adj_group.get(l).getMachine_name().size();m++)
	{
		if(mach.get(j).getName().equals(adj_group.get(l).getMachine_name().get(m)))
		{
			flag=1;
		}	
	}
	if(flag==1)
	{
		for(n=0;n<adj_group.get(l).getNoofAdj();n++)
		{
			if(adjuster_array[l][n].getWorking_status()==0)
				{
					flag2=1;
					break;
				}
		}
	}
	if(flag2==1)
	{
		if(min>(adj_group.get(l).getMachine_name().size()-1))
		{
			min=adj_group.get(l).getMachine_name().size()-1;
			group=l;
			flag3=1;
		}		
	}
}
if(flag3==1)
{
	adjuster_array[group][n].setWorking_status(1);
	adjuster_array[group][n].setDaysWorked(0); 
	adjuster_array[group][n].setRequire_days(mach.get(j).getRepair_time());
	machine_array[j][k].setRepairing_status(1);
	machine_array[j][k].setRepair_days_count(1);
	if(machine_array[j][k].getRepair_days_count()==mach.get(j).getRepair_time())
	{
		machine_array[j][k].setqStatus(1);
		machine_array[j][k].setRepairing_status(0);
		machine_array[j][k].setRepair_days_count(0);
	}
}*/
