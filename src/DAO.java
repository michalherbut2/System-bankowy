//import Model.*;

public class DAO {

	/**
	 * 
	 * @param account
	 */
	public int fetchAccountBalance(Account account) {
		// TODO - implement DAO.fetchAccountBalance
		throw new UnsupportedOperationException();
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