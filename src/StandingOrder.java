//import Model.*;

import java.util.Date;

public class StandingOrder {

	private int orderID;
	private int amount;
	private Date startDate;
	private Date endDate;

	private int frequency;
	
	private boolean transaction;

	//private StandingOrderType type;
	public StandingOrder(int orderID, int amount, Date startDate, Date endDate, int frequency, boolean transaction) {
		this.orderID = orderID;
		this.amount = amount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.frequency = frequency;
		//this.type = type;
		this.transaction = transaction;
	}

	public StandingOrder(int orderID, String recipient, int accountNumber, int amount, int frequency, String stardDate, String endDate, boolean transaction) {
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

	//public StandingOrderType getType() {
	//	return type;
	//}

	public boolean isTransaction() {
		return transaction;
	}
}