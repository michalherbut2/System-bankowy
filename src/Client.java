//import Model.*;

import java.util.List;

public class Client implements ModelFunc {
	public Client(String email, String password_hash, List<Account> accounts) {
		this.email = email;
		this.password_hash = password_hash;
		this.accounts = accounts;
	}

	private static Client instance;
	private int clientID;

	public String getPassword_hash() {
		return password_hash;
	}

	public String getEmail() {
		return email;
	}

	private String firstname;
	private String lastname;
	private String password_hash;
	private int phoneNumber;
	private String email;
	private List<Account> accounts;

	private Client() {
		// TODO - implement Client.Client
		throw new UnsupportedOperationException();
	}
//	public Client(int id, String name, String pass, List<Account> accounts) {
//
//	}

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

    public List<Account> getAccounts() {
        return accounts;
    }
}