package com.cts.ProjectApplication.Buyer;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.transaction.Transaction;
@Entity
public class PurchaseHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchaseId;
	@ManyToOne
	@JoinColumn(name="buyerId")
	private Buyer buyerId;
	@ManyToOne
	@JoinColumn(name="transactionId")
	private Transaction transactionId;
	private Integer itemId;
	private int numberOfItems;
	private Date dateTime;
	private String purchaseremarks;
	
	public PurchaseHistory() {
		
	}

	public PurchaseHistory(int purchaseId, Buyer buyerId, Transaction transactionId, Integer itemId, int numberOfItems,
			Date dateTime, String purchaseremarks) {
		this.purchaseId = purchaseId;
		this.buyerId = buyerId;
		this.transactionId = transactionId;
		this.itemId = itemId;
		this.numberOfItems = numberOfItems;
		this.dateTime = dateTime;
		this.purchaseremarks = purchaseremarks;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Buyer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Buyer buyerId) {
		this.buyerId = buyerId;
	}

	public Transaction getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Transaction transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getPurchaseremarks() {
		return purchaseremarks;
	}

	public void setPurchaseremarks(String purchaseremarks) {
		this.purchaseremarks = purchaseremarks;
	}

}
