package _04_proxy._02_Bankaccount_example.bankaccount.operations;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Withdrawal {

	private double amount;
	private LocalDateTime time;

	public Withdrawal(double amount) {
		this.amount = amount;
		this.time = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Withdrawal that = (Withdrawal) o;
		return Double.compare(that.amount, amount) == 0 && Objects.equals(time, that.time);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, time);
	}
}
