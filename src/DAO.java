//import Model.*;

import java.util.ArrayList;
import java.util.List;

public class DAO {
	private static final List<Client> DATABASE = List.of(
			new Client("asd", "1", List.of(
					new Account(123, 5000),
					new Account(456, 10000)
			)),
			new Client("zxc", "2", List.of(
					new Account(789, 2000)
			))
	);

	private static final List<String> LOGS = new ArrayList<>();

	public static Client authenticateClient(String email, String password) {
		return DATABASE.stream()
				.filter(client -> client.getEmail().equals(email) && client.getPassword_hash().equals(password))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Nieprawidłowy login lub hasło."));
	}

	/**
	 * 
	 * @param account
	 */
	public static int fetchAccountBalance(Account account) {
		for (Client client : DATABASE) {
			for (Account account1 : client.getAccounts()) {
				if (account1.getAccountNumber() == account.getAccountNumber()) {
					return account1.getBalance();
				}
			}
		}
		throw new IllegalArgumentException("zły numer konta, nie ma takiego konta");
//		int[] balances = {1,2};
//		return account.getBalance();
//		return balances[account.getAccountNumber()];

//		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param account
	 */
	public static void saveStandingOrder(Account account, StandingOrder order) {

		for (Client client : DATABASE) {
			for (Account account1 : client.getAccounts()) {
				if (account1.getAccountNumber() == account.getAccountNumber()) {
					account1.addStandingOrder(order);
				}
			}
		}
	}

	public static Account findAccountById(int AccountId) {
		for (Client client : DATABASE) {
			for (Account account1 : client.getAccounts()) {
				if (account1.getAccountNumber() == AccountId) {
					return account1;
				}
			}
		}
		return null;
	}

	public static void log(String dataLog) {
		LOGS.add(dataLog);
	}
}