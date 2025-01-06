import java.util.Date;

public class ClientServiceFacade implements PresenterFunc {
	public ClientServiceFacade(ClientPresenter clientPresenter) {
		this.clientPresenter = clientPresenter;
	}

	ClientPresenter clientPresenter;
	public int getBalance(int id) {

//		Account account = new Account();
		Account account = clientPresenter.getAccount(id);
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

		Account account = clientPresenter.getAccount(123);



		StandingOrder order = new StandingOrder(0, recipient, accountNumber, amount, frequency, stardDate, endDate, transaction);
		DAO.saveStandingOrder(account, order);
		ClientPresenter.checkTransaction(recipient, accountNumber, amount, frequency, stardDate, endDate);

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