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

		System.out.print("Podaj częstotliwość (np. miesięczna, tygodniowa): ");
		String frequency = scanner.nextLine();

		System.out.print("Podaj datę rozpoczęcia (format: YYYY-MM-DD): ");
		String startDate = scanner.nextLine();

		// Zwrócenie danych w formie tablicy
		return new String[] { recipient, accountNumber, amount, frequency, startDate };

//		throw new UnsupportedOperationException();
	}

}