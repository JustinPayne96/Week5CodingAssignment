package week5CodingAssignmentWork;

public class App {

	public static void main(String[] args) {
		Logger asteriskMessage = new AsteriskLogger();
		Logger spacedMessage = new SpacedLogger();
		
		asteriskMessage.log("Hello");
		asteriskMessage.error("Hello");
		
		System.out.println();
		
		spacedMessage.log("Hello");		
		spacedMessage.error("Hello");

	}

}
