

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar McQueen = new RaceCar("NAASCAR", 5);
		// 2. Print the RaceCar's position in the race
	McQueen.getPositionInRace();
		// 3. Crash the RaceCar
	McQueen.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
	McQueen.isDamaged();
		// 5. Help the car move into first place.
	for(int i=0; i<=7; i++) {
	McQueen.overtake();
	McQueen.getPositionInRace();
	}
	}
}
