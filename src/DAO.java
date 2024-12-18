//import Model.*;

public class DAO {

	/**
	 * 
	 * @param account
	 */
	public static int fetchAccountBalance(Account account) {

		int[] balances = {1,2};

		return balances[account.getAccountNumber()];

//		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param account
	 */
	public static void saveStandingOrder(Account account, boolean transaction) {
		// TODO - implement DAO.saveStandingOrder
		//throw new UnsupportedOperationException();
		boolean transfer = ClientPresenter.checkTransaction(transaction);

	}

}