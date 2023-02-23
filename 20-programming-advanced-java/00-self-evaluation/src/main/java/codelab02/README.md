# Movie Rental

Design and implement a movie rental service. You should be able to interact with the rental service using a CLI.

## Requirement 1
- Using the rental service, I can get a list of all movies
- A movie contains the following data: title, price and genre

## Requirement 2
- Using the rental service, I can get a list of all customers
- A customers contains the following data: name, birthday and age

## Requirement 3
- Using the rental service I can look up a movie based on its name

## Requirement 4
- Using the rental service I can look up a customer based on its name

## Requirement 5
- Using the rental service I can rent a movie as a customer (by both using the name of the customer and the movie)
- A rental contains the following data: return date, movie, customer
- The return date is equal to one week after the movie was rented

## Requirement 6
- A rental service can have at most 20 rentals

## Requirement 7
- Using the rental service I can add a new movie
- A rental service can have at most 10 movies

## Requirement 7
- Using the rental service I can add a new movie
- A rental service can have at most 10 movies

## Requirement 8
- Using the rental service I can add a new customer
- A rental service can have at most 5 customers

## Requirement 9
Movies have a fixed price based on how relevant the movies are:
- One-day movies: you should return them the next day, their price is 5 euro.
- Trending movies: you should return them within a week, their price is 3 euro.
- Older movies: you should return them within a week, their price is 1 euro.

## Requirement 10
Make it possible to 'downgrade' a movie using the rental service: One-day movies > trending movies > older movies.
- Downgrading a one-day movie makes it a trending movie
- Downgrading a trending movie makes it an older movie
- Downgrading an older movie makes it an older movie
