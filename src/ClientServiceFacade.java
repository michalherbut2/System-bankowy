import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

		// Utwórz instancję SimpleDateFormat z odpowiednim formatem
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

//		// Przekształć String na Date
//		Date date = sdf.parse(dateString);

		String recipient = data[0];
		int accountNumber = Integer.parseInt(data[1]);
		int amount = Integer.parseInt(data[2]);
		int frequency = Integer.parseInt(data[3]);
		Date startDate;
		Date endDate;
		try {
			startDate = sdf.parse(data[4]);
			endDate = sdf.parse(data[5]);

		} catch (ParseException e) {
            throw new RuntimeException(e);
        }
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