public class Main {

	public static void main(String[] args) {

		ClientPresenter clientPresenter = new ClientPresenter();
		PresenterFunc clientServiceFacade = new ClientServiceFacade(clientPresenter);
		LoginController loginController = new LoginController();
		loginController.login("asd","1", clientPresenter);
		ViewService vs = new ViewService(clientServiceFacade);
		vs.showMenu();

//		throw new UnsupportedOperationException();
	}
}