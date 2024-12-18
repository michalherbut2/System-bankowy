import java.util.Date;

public class ClientServiceFacade implements PresenterFunc {

	public int getBalance() {

		ClientPresenter clientPresenter = new ClientPresenter();
		Account account = new Account();
		return clientPresenter.getBalance(account);

//		throw new UnsupportedOperationException();
	}

	@Override
	public void createStandingOrder(String[] data) {
		String recipient = data[0];
		int accountNumber = Integer.parseInt(data[1]);
		int amount = Integer.parseInt(data[2]);
		int frequency = Integer.parseInt(data[3]);
		String stardDate = data[4];
		String endDate = data[5];
		boolean transaction = Boolean.parseBoolean(data[6]);

		Account account = null;



		StandingOrder order = new StandingOrder(0, recipient, accountNumber, amount, frequency, stardDate, endDate, transaction);
		DAO.saveStandingOrder(account, transaction);
	}

	/**
	 * 
	 * @param data
	 */
	public void createStandingOrder(String data) {
		// TODO - implement ClientServiceFacade.createStandingOrder
		throw new UnsupportedOperationException();
	}

}