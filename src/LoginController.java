//import Model.*;

public class LoginController {

	/**
	 * 
	 * @param login
	 * @param password
	 */
	public Client validateLogin(String login, String password) {
		return DAO.authenticateClient(login, password);

	}

	public void login(String login, String password, ClientPresenter clientPresenter) {
		try {
			Client client = validateLogin(login, password);
			clientPresenter.setClient(client);
			System.out.println("Zalogowano pomyślnie!");
		} catch (IllegalArgumentException e) {
			System.out.println("Błąd logowania: " + e.getMessage());
		}
	}

	public int countFailedLogins() {
		// TODO - implement LoginController.countFailedLogins
		throw new UnsupportedOperationException();
	}

}