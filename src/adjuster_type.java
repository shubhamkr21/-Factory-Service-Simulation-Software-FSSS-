import java.util.ArrayList;

public class adjuster_type {
	
	String id;
	ArrayList <String> machine_name = new ArrayList <String> ();
	int noofAdj;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<String> getMachine_name() {
		return machine_name;
	}

	public int getNoofAdj() {
		return noofAdj;
	}

	public void setNoofAdj(int noofAdj) {
		this.noofAdj = noofAdj;
	}

	public adjuster_type()
	{
		
	}
	public adjuster_type(String id, int noofAdj,ArrayList <String> machine_name) {
		this.id = id;
		this.noofAdj = noofAdj;
		this.machine_name=machine_name;
	}
}
