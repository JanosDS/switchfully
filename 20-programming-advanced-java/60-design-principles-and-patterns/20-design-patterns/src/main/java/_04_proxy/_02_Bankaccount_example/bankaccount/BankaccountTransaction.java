package _04_proxy._02_Bankaccount_example.bankaccount;

public interface BankaccountTransaction {

	void transaction(double amount, BankaccountDepositProxy reciever, int pincode);
}
