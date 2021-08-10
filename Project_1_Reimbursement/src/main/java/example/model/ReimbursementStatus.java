package example.model;

public class ReimbursementStatus {
	
	private int reimb_Status_Id;
	private String reimb_Status;

	public ReimbursementStatus(int reimb_Status_Id, String reimb_Status) {
		super();
		this.reimb_Status_Id = reimb_Status_Id;
		this.reimb_Status = reimb_Status;
	}

	public int getReimb_Status_Id() {
		return reimb_Status_Id;
	}

	public void setReimb_Status_Id(int reimb_Status_Id) {
		this.reimb_Status_Id = reimb_Status_Id;
	}

	public String getReimb_Status() {
		return reimb_Status;
	}

	public void setReimb_Status(String reimb_Status) {
		this.reimb_Status = reimb_Status;
	}

	@Override
	public String toString() {
		return "\nReimbursementStatus [reimb_Status_Id=" + reimb_Status_Id + ", reimb_Status=" + reimb_Status + "]";
	}
	
}
