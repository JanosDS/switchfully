package advanced.codelab01;

public class Airport {

	public static void main(String[] args) {
		// your code here
		Gate gate = new Gate();

		Passenger ecoPass = new Passenger("freddy", BoardingPriority.ECONOMY);
		Passenger busPass = new Passenger("Greedo", BoardingPriority.BUSINESS);
		Passenger firPass = new Passenger("Marie", BoardingPriority.FIRST_CLASS);
		Passenger busPass2 = new Passenger("Frank", BoardingPriority.BUSINESS);

		gate.goStandInLineToBoard(busPass2);
		gate.goStandInLineToBoard(firPass);
		gate.goStandInLineToBoard(ecoPass);
		gate.goStandInLineToBoard(busPass);

		System.out.println(gate.letNextPassengerBoard().getName());
		System.out.println(gate.letNextPassengerBoard().getName());
		System.out.println(gate.letNextPassengerBoard().getName());
		System.out.println(gate.letNextPassengerBoard().getName());

	}

}
