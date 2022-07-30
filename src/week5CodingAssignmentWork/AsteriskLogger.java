package week5CodingAssignmentWork;

public class AsteriskLogger implements Logger {

	/*
	 * Looking to print out:
	 *    ***Hello***
	 */
	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
		
	}

	private String createAsteriskMessage(String message) {
		return "***" + message + "***";
	}
	
	/*
	 * Looking to print out:
	 *  ******************
	 *  ***Error: Hello***
	 *  ******************
	 */
	
	@Override
	public void error(String message) {
		String asteriskError = "***" + "ERROR: " + message + "***";
		String asteriskCount = "*".repeat(asteriskError.length());
		
		System.out.println(asteriskCount);
		System.out.println(asteriskError);
		System.out.println(asteriskCount);
		}
		
}
