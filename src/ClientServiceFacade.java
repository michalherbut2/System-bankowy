public class ClientServiceFacade implements PresenterFunc {

	public int getBalance() {

		ClientPresenter clientPresenter = new ClientPresenter();
		Account account = new Account();
		return clientPresenter.getBalance(account);

//		throw new UnsupportedOperationException();
	}

	@Override
	public void createStandingOrder(String[] data) {

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