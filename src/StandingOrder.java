//import Model.*;

import java.util.Date;

public class StandingOrder {

	private int orderID;
	private int amount;
	private Date startDate;
	private Date endDate;

	private int frequency;

	private StandingOrderType type;
	public StandingOrder(int orderID, int amount, Date startDate, Date endDate, int frequency, StandingOrderType type) {
		this.orderID = orderID;
		this.amount = amount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.frequency = frequency;
		this.type = type;
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

	public StandingOrderType getType() {
		return type;
	}
}