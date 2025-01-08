public class Main {

	public static void main(String[] args) {

		ClientPresenter clientPresenter = new ClientPresenter();
		ActivityLogger activityLogger = new ActivityLogger();
		TransferController transferController = new TransferController(activityLogger);

		PresenterFunc clientServiceFacade = new ClientServiceFacade(clientPresenter, transferController);
		LoginController loginController = new LoginController();
		loginController.login("asd","1", clientPresenter);
		ViewService vs = new ViewService(clientServiceFacade);
		vs.showMenu();

//		throw new UnsupportedOperationException();
	}
}