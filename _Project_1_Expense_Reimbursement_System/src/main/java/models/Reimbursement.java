package models;

import java.sql.Timestamp;
import java.util.Arrays;

public class Reimbursement {

	private int reimb_Id;
	private double reimb_Amount;
	private Timestamp reimb_Submitted = new Timestamp(System.currentTimeMillis());
	private Timestamp reimb_Resolved = null;
	private String reimb_Description = null;
	private String reimb_Receipt = null;
	private String reimb_Author;
	private String reimb_Resolver;
	private String reimb_Status;
	private String reimb_Type;
	
	public Reimbursement(int reimb_Id, double reimb_Amount, Timestamp reimb_Submitted, Timestamp reimb_Resolved,
			String reimb_Description, String reimb_Receipt, String reimb_Author, String reimb_Resolver,
			String reimb_Status, String reimb_Type) {
		super();
		this.reimb_Id = reimb_Id;
		this.reimb_Amount = reimb_Amount;
		this.reimb_Submitted = reimb_Submitted;
		this.reimb_Resolved = reimb_Resolved;
		this.reimb_Description = reimb_Description;
		this.reimb_Receipt = reimb_Receipt;
		this.reimb_Author = reimb_Author;
		this.reimb_Resolver = reimb_Resolver;
		this.reimb_Status = reimb_Status;
		this.reimb_Type = reimb_Type;
	}

	public Reimbursement(int int1, Timestamp timestamp, String string, String string2, String string3, String string4,
			String string5) {
		// TODO Auto-generated constructor stub
	}

	public int getReimb_Id() {
		return reimb_Id;
	}

	public void setReimb_Id(int reimb_Id) {
		this.reimb_Id = reimb_Id;
	}

	public double getReimb_Amount() {
		return reimb_Amount;
	}

	public void setReimb_Amount(double reimb_Amount) {
		this.reimb_Amount = reimb_Amount;
	}

	public Timestamp getReimb_Submitted() {
		return reimb_Submitted;
	}

	public void setReimb_Submitted(Timestamp reimb_Submitted) {
		this.reimb_Submitted = reimb_Submitted;
	}

	public Timestamp getReimb_Resolved() {
		return reimb_Resolved;
	}

	public void setReimb_Resolved(Timestamp reimb_Resolved) {
		this.reimb_Resolved = reimb_Resolved;
	}

	public String getReimb_Description() {
		return reimb_Description;
	}

	public void setReimb_Description(String reimb_Description) {
		this.reimb_Description = reimb_Description;
	}

	public String getReimb_Receipt() {
		return reimb_Receipt;
	}

	public void setReimb_Receipt(String reimb_Receipt) {
		this.reimb_Receipt = reimb_Receipt;
	}

	public String getReimb_Author() {
		return reimb_Author;
	}

	public void setReimb_Author(String reimb_Author) {
		this.reimb_Author = reimb_Author;
	}

	public String getReimb_Resolver() {
		return reimb_Resolver;
	}

	public void setReimb_Resolver(String reimb_Resolver) {
		this.reimb_Resolver = reimb_Resolver;
	}

	public String getReimb_Status() {
		return reimb_Status;
	}

	public void setReimb_Status(String reimb_Status) {
		this.reimb_Status = reimb_Status;
	}

	public String getReimb_Type() {
		return reimb_Type;
	}

	public void setReimb_Type(String reimb_Type) {
		this.reimb_Type = reimb_Type;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimb_Id=" + reimb_Id + ", reimb_Amount=" + reimb_Amount + ", reimb_Submitted="
				+ reimb_Submitted + ", reimb_Resolved=" + reimb_Resolved + ", reimb_Description=" + reimb_Description
				+ ", reimb_Receipt=" + reimb_Receipt + ", reimb_Author=" + reimb_Author + ", reimb_Resolver="
				+ reimb_Resolver + ", reimb_Status=" + reimb_Status + ", reimb_Type=" + reimb_Type + "]";
	}

}
