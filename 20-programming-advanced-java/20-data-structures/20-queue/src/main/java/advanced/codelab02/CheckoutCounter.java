package advanced.codelab02;

import advanced.codelab02.grocery.Grocery;

import java.util.LinkedList;

public class CheckoutCounter {

	private Cashier cashier;
	private boolean isOpen;
	private LinkedList<Customer> customerQueue = new LinkedList<>();

	public void open(Cashier cashier) {
		this.cashier = cashier;
		isOpen = true;

	}

	public void close() {
		if (customerQueue.size() != 0) {
			throw new IllegalArgumentException("The queue needs to be empty before closing");
		} else {
			this.cashier = null;
			isOpen = false;
		}
	}

	public void joinCheckoutLine(Customer customer) {
		if (!isOpen) {
			throw new IllegalArgumentException("The checkout counter needs to be open to form a queue");
		} else {
			customerQueue.add(customer);
		}
	}

	public String processNextCustomerInLine() {
		if (!isOpen) {
			throw new IllegalArgumentException("The checkout counter needs to be open to process customers");
		} else if (customerQueue.size() == 0) {
			return "There is no customer in the queue to process.";
		}
		Customer currentCustomer = customerQueue.removeFirst();
		return "The total price for " + currentCustomer.getName() + " is: " + calculateGroceryTotalPrice(currentCustomer) + "Euro.";
	}

	public double calculateGroceryTotalPrice(Customer customer) {
		double sum = 0;
		for (Grocery grocery : customer.getGroceryList()) {
			sum += (grocery.getAmount() * grocery.getPricePerUnit());
		}
		return sum;
	}

}
