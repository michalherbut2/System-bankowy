//import Model.*;

import java.util.Date;

public class StandingOrder {

	private int orderID;

	public String getRecipient() {
		return recipient;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	private String recipient;
	private int accountNumber;
	private int amount;
	private Date startDate;
	private Date endDate;

	private int frequency;
	
	private boolean transaction;

	public StandingOrder(int orderID, String recipient, int accountNumber, int amount, int frequency, Date startDate, Date endDate, boolean transaction) {
		this.orderID = orderID;
		this.recipient = recipient;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.frequency = frequency;
		this.transaction = transaction;
	}

	public int getOrderID() {
		return orderID;
	}

	public int getAmount() {
		return amount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public int getFrequency() {
		return frequency;
	}

	public boolean isTransaction() {
		return transaction;
	}
}