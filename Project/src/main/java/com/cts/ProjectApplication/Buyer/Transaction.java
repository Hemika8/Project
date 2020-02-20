package com.cts.ProjectApplication.Buyer;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Transaction{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;
	private String transactionType;
	private Date date_time;
	private String tranRemarks;
	//private double totalammount;
	public Transaction() {
		
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Date getDate_time() {
		return date_time;
	}

	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}

	public String getTranRemarks() {
		return tranRemarks;
	}

	public void setTranRemarks(String tranRemarks) {
		this.tranRemarks = tranRemarks;
	}

	public Transaction(int transactionId, String transactionType, Date date_time, String tranRemarks) {
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.date_time = date_time;
		this.tranRemarks = tranRemarks;
	}
}
