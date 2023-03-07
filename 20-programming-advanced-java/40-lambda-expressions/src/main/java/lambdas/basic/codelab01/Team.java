package lambdas.basic.codelab01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Team {

	private List<Footballer> footballers = new ArrayList<>();


	public void addFootballer(Footballer footballer) {
		footballers.add(footballer);
	}

	public void sortFootballersBestToWorstAttack() {
		footballers.sort(Comparator.comparingInt(Footballer::getAttackingScore).reversed());
	}

	public void sortFootballersOnBestToWorstDefend() {
		footballers.sort(Comparator.comparingInt(Footballer::getDefendingScore).reversed());
	}

	public void sortFootballersWorstToBestAttack() {
		footballers.sort(Comparator.comparingInt(Footballer::getAttackingScore));
	}

	public void sortFootballersOnWorstToBestDefend() {
		footballers.sort(Comparator.comparingInt(Footballer::getDefendingScore));
	}

	public void sortFootballersBestToWorstAverage() {
		footballers.sort(Comparator.comparingInt(Footballer::getAverage));
	}

	public List<Footballer> getFootballers() {
		return footballers;
	}
}
