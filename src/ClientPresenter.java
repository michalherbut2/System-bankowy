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
		// 1. Sprawdzenie odbiorcy
		if (recipient == null || recipient.isBlank()) {
			System.out.println("Recipient is invalid.");
			return false;
		}

		// 2. Sprawdzenie, czy konto istnieje
		Account account = DAO.fetchAccountById(accountNumber);
		if (account == null) {
			System.out.println("Account not found.");
			return false;
		}

		// 3. Sprawdzenie salda i kwoty
		if (amount <= 0) {
			System.out.println("Amount must be greater than zero.");
			return false;
		}
		if (account.getBalance() < amount) {
			System.out.println("Insufficient funds.");
			return false;
		}

		// 4. Sprawdzenie częstotliwości
		if (frequency <= 0) {
			System.out.println("Frequency must be positive.");
			return false;
		}

		// 5. Sprawdzenie dat
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate start = LocalDate.parse(startDate, formatter);
			LocalDate end = LocalDate.parse(endDate, formatter);

			if (end.isBefore(start)) {
				System.out.println("End date must be after start date.");
				return false;
			}
		} catch (DateTimeParseException e) {
			System.out.println("Invalid date format. Use yyyy-MM-dd.");
			return false;
		}

		// Wszystkie warunki spełnione
		return true;
	}

}