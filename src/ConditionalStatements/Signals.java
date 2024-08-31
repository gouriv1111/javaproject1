package ConditionalStatements;

public class Signals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Signal = "Red";
		switch(Signal){
			case "Red":
			System.out.println("Stop");
			break;
			case "Green":
			System.out.println("Run");
			break;
			case "Yellow":
			System.out.println("Be ready");
			break;
			default:
			System.out.println("Dance");
	}

}
}
