package _04_proxy._02_Bankaccount_example.bankaccount.operations;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Deposit {

	private LocalDateTime date;
	private double amount;

	public Deposit(double amount) {
		this.date = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
		this.amount = amount;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Deposit deposit = (Deposit) o;
		return Double.compare(deposit.amount, amount) == 0 && Objects.equals(date, deposit.date);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, amount);
	}
}
