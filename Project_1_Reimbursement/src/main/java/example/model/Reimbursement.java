package example.model;

import java.sql.Timestamp;

public class Reimbursement {

	private int reimb_Id;
	private int reimb_Amount;
	private String reimb_submitted;
	private String reimb_submittedTS;
	private String reimb_resolved;
	private String reimb_resolvedTS;
	private String reimb_description;
	private String reimb_receipt;
	private int reimb_author;
	private int reimb_resolver;
	private int reimb_status_id;
	private int reimb_type_id;
	private String reimb_status;
	private String userRole;
	private String reimb_type;
	private String reimb_username;

	public Reimbursement(int reimb_Id, int reimb_Amount, String reimb_submitted, String reimb_resolved,
			String reimb_description, String reimb_receipt, int reimb_author, int reimb_resolver, int reimb_status_id,
			int reimb_type_id, String reimb_resolvedTS) {
		super();
		this.reimb_Id = reimb_Id;
		this.reimb_Amount = reimb_Amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_resolvedTS = reimb_resolvedTS;
		if(reimb_resolvedTS != null)
			this.reimb_resolvedTS = reimb_resolvedTS.substring(0,19);
		this.reimb_description = reimb_description;
		this.reimb_receipt = reimb_receipt;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
		this.reimb_status_id = reimb_status_id;
		this.reimb_type_id = reimb_type_id;
	}

	public Reimbursement(int reimb_Id, int reimb_Amount, String reimb_submittedTS, String reimb_resolvedTS,
			String reimb_type, String reimb_description,
			String userRole, String reimb_status) {
		this.reimb_Id = reimb_Id;
		this.reimb_Amount = reimb_Amount;
		this.reimb_submittedTS = reimb_submittedTS.substring(0,19);
		this.reimb_resolvedTS = reimb_resolvedTS;
		if(reimb_resolvedTS != null)
			this.reimb_resolvedTS = reimb_resolvedTS.substring(0,19);
		this.reimb_type = reimb_type;
		this.reimb_description = reimb_description;
		this.userRole = userRole;
		this.reimb_status = reimb_status;		
	}

	public Reimbursement(int reimb_Amount, String reimb_description, int reimb_author, int reimb_status_id) {
		this.reimb_Amount = reimb_Amount;
		this.reimb_description = reimb_description;
		this.reimb_author = reimb_author;
		this.reimb_status_id = reimb_status_id;

	}
	
	public Reimbursement(int reimb_Id, int reimb_status_id) {
		this.reimb_Id = reimb_Id;
		this.reimb_status_id = reimb_status_id;
	}

	public Reimbursement(String reimb_username) {
		this.reimb_username = reimb_username;
	}

	public int getReimb_Id() {
		return reimb_Id;
	}

	public String getReimb_submittedTS() {
		return reimb_submittedTS;
	}

	public void setReimb_submittedTS(String reimb_submittedTS) {
		this.reimb_submittedTS = reimb_submittedTS;
	}

	public String getReimb_resolvedTS() {
		return reimb_resolvedTS;
	}

	public void setReimb_resolvedTS(String reimb_resolvedTS) {
		this.reimb_resolvedTS = reimb_resolvedTS;
	}

	public String getReimb_status() {
		return reimb_status;
	}

	public void setReimb_status(String reimb_status) {
		this.reimb_status = reimb_status;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getReimb_type() {
		return reimb_type;
	}

	public void setReimb_type(String reimb_type) {
		this.reimb_type = reimb_type;
	}

	public void setReimb_Id(int reimb_Id) {
		this.reimb_Id = reimb_Id;
	}

	public int getReimb_Amount() {
		return reimb_Amount;
	}

	public void setReimb_Amount(int reimb_Amount) {
		this.reimb_Amount = reimb_Amount;
	}

	public String getReimb_submitted() {
		return reimb_submitted;
	}

	public void setReimb_submitted(String reimb_submitted) {
		this.reimb_submitted = reimb_submitted;
	}

	public String getReimb_resolved() {
		return reimb_resolved;
	}

	public void setReimb_resolved(String reimb_resolved) {
		this.reimb_resolved = reimb_resolved;
	}

	public String getReimb_description() {
		return reimb_description;
	}

	public void setReimb_description(String reimb_description) {
		this.reimb_description = reimb_description;
	}

	public String getReimb_receipt() {
		return reimb_receipt;
	}

	public void setReimb_receipt(String reimb_receipt) {
		this.reimb_receipt = reimb_receipt;
	}

	public int getReimb_author() {
		return reimb_author;
	}

	public void setReimb_author(int reimb_author) {
		this.reimb_author = reimb_author;
	}

	public int getReimb_resolver() {
		return reimb_resolver;
	}

	public void setReimb_resolver(int reimb_resolver) {
		this.reimb_resolver = reimb_resolver;
	}

	public int getReimb_status_id() {
		return reimb_status_id;
	}

	public void setReimb_status_id(int reimb_status_id) {
		this.reimb_status_id = reimb_status_id;
	}

	public int getReimb_type_id() {
		return reimb_type_id;
	}

	public void setReimb_type_id(int reimb_type_id) {
		this.reimb_type_id = reimb_type_id;
	}
	
	public String getReimb_username() {
		return reimb_username;
	}

	public void setReimb_username(String reimb_username) {
		this.reimb_username = reimb_username;
	}

	@Override
	public String toString() {
		return "\nReimbursement [reimb_Id=" + reimb_Id + ", reimb_Amount=" + reimb_Amount + ", reimb_submitted="
				+ reimb_submitted + ", reimb_submittedTS=" + reimb_submittedTS + ", reimb_resolved=" + reimb_resolved
				+ ", reimb_resolvedTS=" + reimb_resolvedTS + ", reimb_description=" + reimb_description
				+ ", reimb_receipt=" + reimb_receipt + ", reimb_author=" + reimb_author + ", reimb_resolver="
				+ reimb_resolver + ", reimb_status_id=" + reimb_status_id + ", reimb_type_id=" + reimb_type_id
				+ ", reimb_status=" + reimb_status + ", userRole=" + userRole + ", reimb_type=" + reimb_type + "]";
	}

}
