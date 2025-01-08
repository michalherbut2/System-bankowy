public class ClientServiceFacade implements PresenterFunc {
	public ClientServiceFacade(ClientPresenter clientPresenter, TransferController transferController) {
		this.clientPresenter = clientPresenter;
		this.transferController = transferController;
	}

	ClientPresenter clientPresenter;
	TransferController transferController;
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
		String startDate = data[4];
		String endDate = data[5];
		boolean transaction = Boolean.parseBoolean(data[6]);

		Account account = clientPresenter.getAccount(123);

		StandingOrder order = new StandingOrder(0, recipient, accountNumber, amount, frequency, startDate, endDate, transaction);


		boolean standingOrderCorrect = new StandingOrderValidationStrategy().validateStandingOrder(order);

		if (standingOrderCorrect){
			DAO.saveStandingOrder(account, order);

			if (transaction) {
				transferController.initiateTransfer(data, account);
				transferController.sendTransferConfirmation(account);
			}
		} else {
			System.out.println("Błąd! Niepoprawne dane!");
		}
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