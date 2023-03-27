package advanced.codelab01;

import advanced.codelab01.domain.HarryPotterBook;
import advanced.codelab01.domain.HarryPotterBookTitle;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Read the README.md.
 */
public class BookService {

	private final double[] DISCOUNT_PERCENTAGES = {0, 5, 10, 20, 25};
	private final double BASE_PRICE = 8;

	public double shop(ArrayList<HarryPotterBook> bookList) {
		if (bookList.size() == 1) {
			return BASE_PRICE;
		}
		HashMap<HarryPotterBookTitle, Integer> bookMap = new HashMap<>();
		// loop over books, make map of amount of books per type
		for (HarryPotterBook book : bookList) {
			bookMap.put(book.getTitleOfBook(),
					bookMap.get(book.getTitleOfBook()) == null ? 1 : bookMap.get(book.getTitleOfBook()) + 1);
		}
		// based on how big the set of books is,
		// calculate the discount price!
		double percentage = getDiscountPercentage(bookMap.size());
		double discountPrice = bookMap.size() * BASE_PRICE * ((100 - percentage) / 100);
		double totalPrice = 0;
		// caculate the total normal price without any discounts
		for (int amount : bookMap.values()) {
			totalPrice += amount * BASE_PRICE;
		}
		// if there is a set of books (minimum 2 books), take the discountPrice
		// in account, ignore otherwise
		if (bookMap.size() > 1) {
			return totalPrice + discountPrice - (bookMap.size() * BASE_PRICE); // pretty weird calculation, but hey it works correctly...
		}
		return totalPrice;
	}


	private double getDiscountPercentage(int amountOfDifferentBooks) {
		return DISCOUNT_PERCENTAGES[amountOfDifferentBooks - 1];
	}

}
