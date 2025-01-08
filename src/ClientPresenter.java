//import Model.*;
//import Presenter.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ClientPresenter {

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	private Client client;
	private Subscriber[] subscribers;
	private AccountFactory factory;

	/**
	 * 
	 * @param account
	 */
	public int getBalance(Account account) {

		return DAO.fetchAccountBalance(account);
	}

	public Account getAccount(int accountNumber) {
		return client.getAccounts().stream().filter(account -> account.getAccountNumber() == accountNumber).findFirst().orElseThrow(()->new IllegalArgumentException("zły numer konta"));
	}

	public void updateAccountBalance() {
		// TODO - implement ClientPresenter.updateAccountBalance
		throw new UnsupportedOperationException();
	}

	/**
	 * @param recipient
	 * @param accountNumber
	 * @param amount
	 * @param frequency
	 * @param startDate
	 * @param endDate
	 */
	public static boolean validateTransaction(String recipient, int accountNumber, int amount, int frequency, String startDate, String endDate) {
		return true;
	}

}