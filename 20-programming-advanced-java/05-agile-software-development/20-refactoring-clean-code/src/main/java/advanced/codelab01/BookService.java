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
		HashMap<HarryPotterBookTitle, Integer> bookMap = makeBookSets(bookList);
		double totalPrice = calculateNormalPrice(bookList.size());
		return applyDiscount(totalPrice, bookMap.size());
	}

	private double applyDiscount(double price, int amountOfBooksInSet) {
		if (amountOfBooksInSet > 1) {
			double percentage = getDiscountPercentage(amountOfBooksInSet);
			double discountPrice = amountOfBooksInSet * BASE_PRICE * ((100 - percentage) / 100);
			return price + discountPrice - (amountOfBooksInSet * BASE_PRICE); // pretty weird calculation, but hey it works correctly...
		}
		return price;
	}

	private double calculateNormalPrice(int amountOfBooks) {
		return amountOfBooks * BASE_PRICE;
	}

	private HashMap<HarryPotterBookTitle, Integer> makeBookSets(ArrayList<HarryPotterBook> bookList) {
		HashMap<HarryPotterBookTitle, Integer> bookMap = new HashMap<>();
		// loop over books, make map of amount of books per type
		for (HarryPotterBook book : bookList) {
			bookMap.put(book.getTitleOfBook(),
					bookMap.get(book.getTitleOfBook()) == null ? 1 : bookMap.get(book.getTitleOfBook()) + 1);
		}
		return bookMap;
	}


	private double getDiscountPercentage(int amountOfDifferentBooks) {
		return DISCOUNT_PERCENTAGES[amountOfDifferentBooks - 1];
	}

}
