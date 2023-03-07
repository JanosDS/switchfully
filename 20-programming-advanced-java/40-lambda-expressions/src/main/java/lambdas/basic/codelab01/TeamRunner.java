package lambdas.basic.codelab01;

public class TeamRunner {
	public static void main(String[] args) {
		Team team = new Team();

		Footballer footballerA = new Footballer(99, 50);
		Footballer footballerB = new Footballer(60, 60);
		Footballer footballerC = new Footballer(30, 99);

		team.addFootballer(footballerA);
		team.addFootballer(footballerB);
		team.addFootballer(footballerC);

		team.sortFootballersBestToWorstAverage();

		for (Footballer footballer : team.getFootballers()) {
			System.out.println(footballer.getAttackingScore());
		}

	}
}
