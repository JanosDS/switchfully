package advanced.codelab02;

import advanced.codelab02.grocery.Grocery;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;

	private boolean isLoyal;
	List<Grocery> groceryList = new ArrayList<>();

	public Customer(String name, boolean isLoyal, List<Grocery> groceryList) {
		this.name = name;
		this.isLoyal = isLoyal;
		this.groceryList = groceryList;
	}

	public String getName() {
		return name;
	}

	public boolean isLoyal() {
		return isLoyal;
	}

	public List<Grocery> getGroceryList() {
		return groceryList;
	}
}
