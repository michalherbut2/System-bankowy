import java.util.Date;

public class StandingOrderValidationStrategy {

	public boolean validateStandingOrder(StandingOrder order) {
// 1. Sprawdzenie odbiorcy
		if (order.getRecipient() == null || order.getRecipient().isBlank()) {
			System.out.println("Recipient is invalid.");
			return false;
		}

		// 2. Sprawdzenie, czy konto istnieje
		Account account = DAO.fetchAccountById(order.getAccountNumber());
		if (account == null) {
			System.out.println("Account not found.");
			return false;
		}

		// 3. Sprawdzenie salda i kwoty
		if (order.getAmount() <= 0) {
			System.out.println("Amount must be greater than zero.");
			return false;
		}
		if (account.getBalance() < order.getAmount()) {
			System.out.println("Insufficient funds.");
			return false;
		}

		// 4. Sprawdzenie częstotliwości
		if (order.getFrequency() <= 0) {
			System.out.println("Frequency must be positive.");
			return false;
		}

		// 5. Sprawdzenie dat
		try {
			// Pobieramy daty
			Date start = order.getStartDate();
			Date end = order.getEndDate();

			// Sprawdzamy, czy data końcowa nie jest przed datą początkową
			if (end.before(start)) {
				System.out.println("End date must be after start date.");
				return false;
			}
		} catch (Exception e) {
			// Obsługujemy wyjątek, jeśli coś poszło nie tak
			System.out.println("An error occurred while checking the dates.");
			return false;
		}

		// Wszystkie warunki spełnione
		return true;
	}

}