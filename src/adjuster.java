import java.util.ArrayList;

public class adjuster {
	private String id;
	public ArrayList<String> machtype;
	private int working_status;
	private int DaysWorked;
	private int total_days_worked;
	private int require_days;
	
	public int getRequire_days() {
		return require_days;
	}

	public void setRequire_days(int require_days) {
		this.require_days = require_days;
	}

	public ArrayList<String> getMachtype() {
		return machtype;
	}

	public void setMachtype(ArrayList<String> machtype) {
		this.machtype = machtype;
	}

	public int getWorking_status() {
		return working_status;
	}

	public void setWorking_status(int working_status) {
		this.working_status = working_status;
	}

	public int getDaysWorked() {
		return DaysWorked;
	}

	public void setDaysWorked(int daysWorked) {
		DaysWorked = daysWorked;
	}

	public int getTotal_days_worked() {
		return total_days_worked;
	}

	public void setTotal_days_worked(int total_days_worked) {
		this.total_days_worked = total_days_worked;
	}

	public String getID()
	{
		return getId();
	}
	
	public void setID(String ID)
	{
		setId(ID);
	}
	
	public void AddDays(int d)
	{
		DaysWorked+=d;
	}
	
	public int getDays()
	{
		return DaysWorked;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
