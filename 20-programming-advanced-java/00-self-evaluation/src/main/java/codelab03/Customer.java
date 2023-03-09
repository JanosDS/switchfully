package codelab03;

import codelab03.movie.MovieType;
import codelab03.rental.Rental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private final String name;
	private final List<Rental> rentals;

	public Customer(String name) {
		this.name = name;
		rentals = new ArrayList<>();
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public double getTotalPrice() {
		return rentals.stream()
				.mapToDouble(Rental::getPrice)
				.sum();
	}

	public int getFrequentRenterPoints() {
		int frequentRenterPoints = rentals.size();
		frequentRenterPoints += rentals.stream()
				.filter(rental -> rental.getMovie().getMovieType() == MovieType.NEW_RELEASE && rental.getDaysRented() > 1)
				.count();
		return frequentRenterPoints;
	}


	public String getRentalRecord() {
		StringBuilder rentalRecord = new StringBuilder();
		rentalRecord.append("Rental Record for ").append(getName()).append("\n");
		for (Rental rental : rentals) {
			rentalRecord.append("\t").append(rental.getMovie().getTitle()).append("\t").append(rental.getPrice()).append("\n");
		}
		rentalRecord.append("Amount owed is ").append(getTotalPrice()).append("\n");
		rentalRecord.append("You earned ").append(getFrequentRenterPoints()).append(" frequent renter points");
		return rentalRecord.toString();
	}

}
