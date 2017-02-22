
public class machinetype {
	protected String Name;
	protected int MTTF;
	protected int repair_time;
	protected int quantity;
	
	public int getRepair_time() {
		return repair_time;
	}

	public void setRepair_time(int repair_time) {
		this.repair_time = repair_time;
	}

	public machinetype(String name, int mTTF, int repair_time, int quantity) {
		
		Name = name;
		MTTF = mTTF;
		this.repair_time = repair_time;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public machinetype(String name, int mttf)
	{
		Name = name;
		MTTF = mttf;
	}
	
	public machinetype()
	{
		Name="";
		MTTF=0;
	}
	
	public String getName()
	{
		return Name; 
	}
	
	public void setName(String name)
	{
		Name = name;
	}
	
	public int getMTTF()
	{
		return MTTF;
	}
	
	public void setMTTF(int mttf)
	{
		MTTF = mttf;
	}

}
