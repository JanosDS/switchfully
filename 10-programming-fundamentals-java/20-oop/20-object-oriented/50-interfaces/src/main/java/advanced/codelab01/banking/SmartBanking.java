package advanced.codelab01.banking;

public class SmartBanking implements BankingFacade {

	private final int MAX_WITHDRAWAL_PERCENT = 50;
	private final double MAX_DEPOSIT = 14500;
	private double balance;

	public SmartBanking(double balance) {
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double withdraw(String uncheckedAmount) {
		double amount = Double.parseDouble(uncheckedAmount);
		if (amount > (balance / 100 * MAX_WITHDRAWAL_PERCENT) || amount < 0 || balance - amount < 0) {
			return balance;
		}
		balance -= amount;
		return balance;
	}

	@Override
	public double deposit(String uncheckedAmount) {
		double amount = Double.parseDouble(uncheckedAmount);
		if (amount > MAX_DEPOSIT || amount < 0) {
			return balance;
		}
		balance += amount;
		return balance;
	}
}
