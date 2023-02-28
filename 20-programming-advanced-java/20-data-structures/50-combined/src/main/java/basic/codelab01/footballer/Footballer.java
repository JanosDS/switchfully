package basic.codelab01.footballer;

import java.time.LocalDate;
import java.util.Objects;

public class Footballer {
	private String name;
	private LocalDate birthdate;
	private String shirtNumber;
	private int amountOfGoalsScored;
	private Position position;

	public Footballer(String name, LocalDate birthdate, String shirtNumber, int amountOfGoalsScored, Position position) {
		this.name = name;
		this.birthdate = birthdate;
		this.shirtNumber = shirtNumber;
		this.amountOfGoalsScored = amountOfGoalsScored;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public String getShirtNumber() {
		return shirtNumber;
	}

	public int getAmountOfGoalsScored() {
		return amountOfGoalsScored;
	}

	public Position getPosition() {
		return position;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Footballer that = (Footballer) o;
		return amountOfGoalsScored == that.amountOfGoalsScored && Objects.equals(name, that.name) && Objects.equals(birthdate, that.birthdate) && Objects.equals(shirtNumber, that.shirtNumber) && position == that.position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, birthdate, shirtNumber, amountOfGoalsScored, position);
	}
}
