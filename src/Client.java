//import Model.*;

public class Client implements ModelFunc {

	private static Client instance;
	private int clientID;
	private String firstname;
	private String lastname;
	private String password_hash;
	private int phoneNumber;
	private String email;
	private Account[] accounts;

	private Client() {
		// TODO - implement Client.Client
		throw new UnsupportedOperationException();
	}

	public static Client getInstance() {
		if (instance == null) {
			instance = new Client();
		}
		return instance;
	}

	/**
	 * 
	 * @param client
	 */
	public void login(Client client) {
		// TODO - implement Client.login
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param account
	 */
//	public int getBalance(Model.Account account) {
	public int getBalance(Account account) {
		// TODO - implement Client.getBalance
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param account
	 */
//	public int getAccountNumber(Model.Account account) {
	public int getAccountNumber(Account account) {
		// TODO - implement Client.getAccountNumber
		throw new UnsupportedOperationException();
	}

	public void setAccount() {
		// TODO - implement Client.setAccount
		throw new UnsupportedOperationException();
	}

}