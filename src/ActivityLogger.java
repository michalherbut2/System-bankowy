public class ActivityLogger {

	private int logEntries;

	/**
	 * 
	 * @param dataLog
	 */
	public void log(String dataLog) {
		DAO.log(dataLog);
	}

	/**
	 * 
	 * @param dataLog
	 */
	public void update(String dataLog) {
		// TODO - implement ActivityLogger.update
		throw new UnsupportedOperationException();
	}

}