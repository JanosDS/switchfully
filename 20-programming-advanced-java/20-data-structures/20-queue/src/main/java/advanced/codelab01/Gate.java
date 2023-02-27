package advanced.codelab01;

import java.util.PriorityQueue;
import java.util.Queue;

class Gate {

	private final Queue<Passenger> passengersToBoard;

	Gate() {
		this.passengersToBoard = new PriorityQueue<>(Passenger::compareTo);
	}

	/**
	 * Add the passenger to the queue
	 */
	void goStandInLineToBoard(Passenger passenger) {
		passengersToBoard.add(passenger);
	}

	/**
	 * Take the 'next-in-line' passenger and return it (make sure it's no longer part of the queue)
	 *
	 * @return the passenger that may board
	 */
	Passenger letNextPassengerBoard() {
		// implement me
		return passengersToBoard.poll();
	}
}
