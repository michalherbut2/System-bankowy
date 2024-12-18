import java.util.Scanner;

public class ViewService {

	PresenterFunc clientServiceFacade = new ClientServiceFacade();


	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("=== PROSTE MENU ===");
			System.out.println("1. Sprawdź stan konta");
			System.out.println("2. Załóż zlecenie stałe");
			System.out.println("0. Wyjście");
			System.out.print("Wybierz opcję: ");

			int choice = scanner.nextInt();

			switch (choice) {
				case 1:
					displayAccountBalance();
					break;
				case 2:
					String[] data = new InputData().inputStandingOrderData();
					clientServiceFacade.createStandingOrder(data);
					break;
				case 0:
					System.out.println("Wyjście z programu. Do widzenia!");
					running = false;
					break;
				default:
					System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
			}

			System.out.println(); // Dodatkowa linia dla czytelności
		}

		scanner.close();

		throw new UnsupportedOperationException();
	}

	public void displayAccountBalance() {

		int balance = clientServiceFacade.getBalance();

		System.out.println(balance);

//		throw new UnsupportedOperationException();
	}

	public void showError() {
		// TODO - implement ViewService.showError
		throw new UnsupportedOperationException();
	}

	public boolean promptRetry() {
		// TODO - implement ViewService.promptRetry
		throw new UnsupportedOperationException();
	}

	public void showSuccess() {
		// TODO - implement ViewService.showSuccess
		throw new UnsupportedOperationException();
	}

}