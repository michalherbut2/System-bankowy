import java.util.Scanner;

public class InputData {

	public int handleUserInput() {
		// TODO - implement InputData.handleUserInput
		throw new UnsupportedOperationException();
	}

	public String[] inputLoginData() {
		// TODO - implement InputData.inputLoginData
		throw new UnsupportedOperationException();
	}

	public String[] inputAccountData() {
		// TODO - implement InputData.inputAccountData
		throw new UnsupportedOperationException();
	}

	public String[] inputStandingOrderData() {

		Scanner scanner = new Scanner(System.in);

		// Pobieranie danych od użytkownika
		System.out.println("=== Wprowadź dane zlecenia stałego ===");
		System.out.print("Podaj nazwę odbiorcy: ");
		String recipient = scanner.nextLine();

		System.out.print("Podaj numer konta odbiorcy: ");
		String accountNumber = scanner.nextLine();

		System.out.print("Podaj kwotę (w formacie dziesiętnym, np. 100.50): ");
		String amount = scanner.nextLine();

		System.out.print("Podaj częstotliwość (co ile dni): ");
		String frequency = scanner.nextLine();

		System.out.print("Podaj datę rozpoczęcia (format: YYYY-MM-DD): ");
		String startDate = scanner.nextLine();

		System.out.print("Podaj czy pierwszy przelew ma być w momencie założenia zlecenia: (tak/nie)");
		String transaction = scanner.nextLine();


		// Zwrócenie danych w formie tablicy
		return new String[] { recipient, accountNumber, amount, frequency, startDate, transaction};

//		throw new UnsupportedOperationException();
	}

}