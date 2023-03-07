package lambdas.basic.codelab01;

public class Footballer {
	private int attackingScore;
	private int defendingScore;


	public Footballer(int attackingScore, int defendingScore) {
		setAttackingScore(attackingScore);
		setDefendingScore(defendingScore);
	}


	public void setAttackingScore(int attackingScore) {
		this.attackingScore = attackingScore;
	}

	public void setDefendingScore(int defendingScore) {
		this.defendingScore = defendingScore;
	}

	public int getAttackingScore() {
		return attackingScore;
	}

	public int getDefendingScore() {
		return defendingScore;
	}

	public int getAverage() {
		return (attackingScore + defendingScore) / 2;
	}
}
