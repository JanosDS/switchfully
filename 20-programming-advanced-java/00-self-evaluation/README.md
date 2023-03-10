# Self Evaluation 2

This self evaluation is created for the purpose of self reflection and to match your current level
of programming against our expectations.

You will have 2 dedicated days to complete it.
Should that not be enough, we expect you to finish it after-hours / over the weekend.

## Bigger exercises

The goal of this part of the self-evaluation is to see if you can handle bigger and more complex exercises.

Besides the requirements written in the exercises, your solution needs to:

* Have a test coverage of at least 80%
* Use Streams instead of other loop types
* Use more complex data structures (ArrayLists, HashMaps, ...) instead of Arrays

### Codelabs

1. [:heavy_check_mark:] Codelab 01 (Treehehehe)
    * Requirements are found in codelab01/README.md
    * Don't spend too much time designing upfront. Split the problem into smaller problems and solve them one at a time.
    * Makes sure that you have implemented all requirements when you're finished. You wouldn't be the first that has
      missed something.

1. [:heavy_check_mark:] Codelab 02 (Movie Rental)
    * Requirements are found in codelab02/README.md
    * Make sure that you have a RentalStoreService class
    * Testing user input is really difficult, so you can skip testing this. Try to find a way to test everything else
      though.

## Refactoring

The rest of the self evaluation is based on refactoring.

Try to increase the readability, the extendability and the discoverability (how quick somebody can find the code they
are looking for),
of the following codelabs.
These codelabs should all have tests, which should still work after the refactoring.

A few hints:

- On readability
    - Read and try to understand what the code of a certain method does.
    - Make a short summary either in your head or on paper of what the code does.
    - Refactor your code so that it reads like your summary
    - Do this for every method
- On discoverability:
    - For each method reflect if the method is in the right class
        - Ask yourself the question: "if somebody needs to find this method will they be able to find it quickly?"
        - e.g.: the method that will check how many people can fit in a car will it be in Car.java or CarStore.java?
- On extendability
    - Think about how the code can change in the future. What will likely be added?
        - A good place to look at is types. If you have the concept of a type somewhere with 2 or more possibilities,
          then the likelihood the customer will add a 3rd or 4th type is rather big.
        - e.g.: if you have code for summer and winter then chances are high you'll need to add spring and fall at a
          later time.
        - Places to look for types are if-else structures or switch cases
    - Make the extendability explicit through either enums, inheritance or interfaces
        - e.g.: summer and winter can become elements of a Season enum, subclasses of a Season class or implementations
          of a Season interface.
- Know when to stop
    - You can improve your code quality for a very long time. Set a fixed amount of time for yourself that you will
      spend on refactoring.

### Codelabs

1. [:heavy_check_mark:] Codelab 03 (Movie Rental Refactoring)
    * Requirements are found in codelab03/README.md

1. [:heavy_check_mark:] Codelab 01 (Treehehehe)
    * Go back over your code for this exercise and try to improve the quality

1. [:x:] Codelab 02 (Movie Rental)
    * Go back over your code for this exercise and try to improve the quality
