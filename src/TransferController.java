//import Model.*;

public class TransferController {
	public TransferController(ActivityLogger logger) {
		this.logger = logger;
	}

	private final ActivityLogger logger;

	/**
	 * 
	 * @param amount
	 * @param account
	 */
	public boolean checkBalance(int amount, Account account) {
		if (account.getBalance() >= amount) {
			return true;
		} else {
			System.out.println("Błąd: Niewystarczające środki na koncie.");
			return false;
		}
	}

	/**
	 * 
	 * @param transferData
	 */
	public void initiateTransfer(String[] transferData, Account senderAccount) {

		int recipientAccountId = Integer.parseInt(transferData[1]);
		int amount = Integer.parseInt(transferData[2]);

		// Znajdź konto odbiorcy
		Account recipientAccount = DAO.fetchAccountById(recipientAccountId);

		// Sprawdź środki
		if (checkBalance(amount, senderAccount)) {
			// Wykonaj przelew
			senderAccount.decreaseBalance(amount);
			recipientAccount.increaseBalance(amount);

			// Zaloguj przelew
			logger.log(String.format("Przelew: %s -> %s, kwota: %d, tytuł: %s",
					senderAccount.getAccountNumber(), recipientAccount.getAccountNumber(), amount));

			System.out.println("Przelew wykonany pomyślnie.");
		}

	}

	/**
	 * 
	 * @param account
	 */
	public void sendTransferConfirmation(Account account) {
		System.out.println("Przelew przesłay poprawnie!");
	}

}