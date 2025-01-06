//import Model.*;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accountNumber;
	private int balance;
	private AccountType accountType;

	public void addStandingOrder(StandingOrder standingOrder) {
		this.standingOrders.add(standingOrder);
	}

	private List<StandingOrder> standingOrders;

	public Account(int accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.standingOrders = new ArrayList<>();
	}

	public Account() {
	}

	public int getBalance() {
		return this.balance;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void decreaseBalance(int amount) {
		balance -= amount;
	}

	public void increaseBalance(int amount) {
		balance += amount;
	}
}