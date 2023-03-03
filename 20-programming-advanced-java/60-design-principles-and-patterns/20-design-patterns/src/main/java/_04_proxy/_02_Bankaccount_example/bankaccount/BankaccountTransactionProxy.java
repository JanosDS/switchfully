package _04_proxy._02_Bankaccount_example.bankaccount;

import _04_proxy._02_Bankaccount_example.bankaccount.exceptions.TransactionException;
import _04_proxy._02_Bankaccount_example.bankaccount.operations.Transaction;

import java.util.ArrayList;

public class BankaccountTransactionProxy implements BankaccountTransaction {

	private BankaccountWithdrawProxy bankaccountWithdrawProxy;

	private ArrayList<Transaction> transactions = new ArrayList<>();

	public BankaccountTransactionProxy(Bankaccount bankaccount, int pincode) {
		this.bankaccountWithdrawProxy = new BankaccountWithdrawProxy(bankaccount, pincode);
	}

	@Override
	public void transaction(double amount, BankaccountDepositProxy reciever, int pincode) {

		Transaction newTransaction = new Transaction(amount, reciever);
		if (!transactions.contains(newTransaction)) {
			bankaccountWithdrawProxy.withDrawMoney(amount, pincode);
			// If reciever is own account
			reciever.depositMoney(amount);

			// else make connection to server and get recieving account

			//Log transaction
			transactions.add(newTransaction);
		} else {
			throw new TransactionException("This transaction has already been done.");
		}

	}
}
