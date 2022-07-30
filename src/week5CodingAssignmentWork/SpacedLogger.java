package week5CodingAssignmentWork;

public class SpacedLogger implements Logger {

	/*
	 * Looking to Print out:
	 *   H e l l o
	 */
	
	@Override
	public void log(String message) {
		System.out.println(spaceMessage(message));
		
	}

	private String spaceMessage(String message ) {
		StringBuilder spaced = new StringBuilder();
		
		for(int index = 0; index < message.length(); index++) {
			char ch = message.charAt(index);
			spaced.append(ch).append(" ");
		}
		
		spaced.setLength(spaced.length() - 1);
		
		return spaced.toString();
	}
	/*
	 * Looking to Print out:
	 *    ERROR: H e l l o
	 */
	
	@Override
	public void error(String message) {
		System.out.println("ERROR: " + spaceMessage(message));
		
	}
}
