
public class machine extends machinetype {
	private int runningDays;
	private int total_running_days;
	private int qStatus;
	private String id;
	private int repair_days_count;
	private int repairing_status;
	private int groupid;
	private int group_number;

	public int getGroup_number() {
		return group_number;
	}

	public void setGroup_number(int group_number) {
		this.group_number = group_number;
	}

	public int getGroupid() {
		return groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

	public machine() {
	}
	
	public int getRepairing_status() {
		return repairing_status;
	}

	public void setRepairing_status(int repairing_status) {
		this.repairing_status = repairing_status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRepair_days_count() {
		return repair_days_count;
	}

	public void setRepair_days_count(int repair_days_count) {
		this.repair_days_count = repair_days_count;
	}

	public int getTotal_running_days() {
		return total_running_days;
	}

	public void setTotal_running_days(int total_running_days) {
		this.total_running_days = total_running_days;
	}

	
	public int getqStatus() {
		return qStatus;
	}

	public void setqStatus(int qStatus) {
		this.qStatus = qStatus;
	}


	public void setData(String name, int mttf)
	{
		Name = name;
		MTTF = mttf;
		runningDays=0;
	}
	
	public void setRunningDays(int days)
	{
		runningDays=days;
	}
	
	public void resetRunningDays()
	{
		runningDays=0;
	}
	
	public void addRunningDays(int d)
	{
		runningDays+=d;
	}
	
	public int getRunningDays()
	{
		return runningDays;
	}

}
