//import Model.*;
//import Presenter.*;

public class ClientPresenter {

	private Client[] clients;
	private Subscriber[] subscribers;
	private AccountFactory factory;

	/**
	 * 
	 * @param account
	 */
	public int getBalance(Account account) {


		return account.getBalance();

//		throw new UnsupportedOperationException();
	}

	public Account getAccount(int accountNumber) {
		// TODO - implement ClientPresenter.getBalance
		throw new UnsupportedOperationException();
	}

	public void updateAccountBalance() {
		// TODO - implement ClientPresenter.updateAccountBalance
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param data
	 */
	public boolean checkTransaction(String[] data) {
		// TODO - implement ClientPresenter.checkTransaction
		throw new UnsupportedOperationException();
	}

}