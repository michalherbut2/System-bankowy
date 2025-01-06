//import Model.*;
//import Presenter.*;

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
//		return account.getBalance();

//		throw new UnsupportedOperationException();
	}

	public Account getAccount(int accountNumber) {
		// TODO - implement ClientPresenter.getBalance
		return client.getAccounts().stream().filter(account -> account.getAccountNumber()==accountNumber).findFirst().orElseThrow(()->new IllegalArgumentException("zły numer konta"))	;
//		throw new UnsupportedOperationException();
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
	 * @param stardDate
	 * @param endDate
	 */
	public static boolean checkTransaction(String recipient, int accountNumber, int amount, int frequency, String stardDate, String endDate) {
		// TODO - implement ClientPresenter.checkTransaction
		//throw new UnsupportedOperationException();
		return false;
	}

}