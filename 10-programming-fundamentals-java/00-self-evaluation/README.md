# Self evaluation 1

This self evaluation is created for the purpose of self reflection and to match your current level
of programming against our expectations.

You will have 2 dedicated days to complete it.
Should that not be enough, we expect you to finish it after-hours / over the weekend.

This self evaluation is in no means a 'classic' test in which the received grades are the most important aspect.
Therefore, the self evaluation will not be graded in a numerical way. However, you will receive extensive feedback
on your solutions which you should review in-depth!

You should be able to correctly complete the theoretical questions and the codelabs,
although some looking-up and tinkering might be necessary.

It is our expectation that you should understand most of the questions and should be able to solve all the codelabs.
Should you feel like you're struggling heavily with every codelab, make sure to address this. We will be more than happy
to see how - and help you - to get you back on track as soon as possible!

**The process is more important than the goal**, don't simply copy/paste (theoretical) answers or solutions from the
internet.
Make sure you truly understand what you're doing! Try to work as autonomous as possible.

## Theoretical questions

Do always (try to) come-up and formulate an answer first,
only then search for additional information, should you be unsure of your answer, to improve your knowledge.

Answer the questions inline, like the example below:

1. **If this is the question**
    - Then this should be your answer (don't forget to tab and prefix with `-` or `*`)

In **this file**, please replace every :x: with a check mark :heavy_check_mark: `:heavy_check_mark:` when you have
created a solution for it.
Please do this after each finished codelab. It will help us in keeping track of your progress.

### Questions Basic

1. [:heavy_check_mark:] **What kind of types are there in Java?**
    - Primitive and reference types
2. [:heavy_check_mark] **What does 'declaring and initializing a variable' mean?**
    - Creating the memory space, and assigning a value
3. [:heavy_check_mark:] **What is a statement? What is an expression? What is an operator?**
    - Statement: instructions that tell the programming language what to do, like declaration and string statements
    - Expression: a series of operators, variables, and method calls constructed according to the syntax
    - Operator: A symbol to indicate an operation to be executed on a variable
4. [:heavy_check_mark:] **What is `casting`? E.g. "I'm casting the value to an `int`"**
    - Assiging the value of a variable, to a variable of a different type
5. [:heavy_check_mark:] **What is the signature of a method?**
    - name + method params
6. [:heavy_check_mark:] **What is method overloading?**
    - more than one method with the same name (but different param(s))
7. [:heavy_check_mark:] **What is method overriding (OOP)?**
    - When a subclass overwrites a parents method
8. [:heavy_check_mark:] **What is meant with "arguments are passed-by-value"?**
    - only the value of the variable is passed, not the "original variable" -> no reference to the var is passed
9. [:heavy_check_mark:] **Of what types can we create an array?**
    - All types
10. [:heavy_check_mark:] **Can the size of an array change after instantiation?**
    - No
11. [:heavy_check_mark:] **What is the main difference (in use-case, not structure) of an If/Else statement and a Switch
    statement?**
    - Switch case: used for ints and chars -> binairy search
    - if-else: used for ints, string, chars, pointers, floats -> liniair search
12. [:heavy_check_mark:] **What is the main difference between primitive data types and reference types in Java?**
    - Primitive: Primitive types are the most basic data types available within the Java language. There are 8:
      boolean , byte , char , short , int , long , float and double .
    - Reference: reference data types are class, Arrays, String, Interface
13. [:heavy_check_mark:] **What is the main difference between a While and Do-While loop (in execution, not structure)?
    **
    - While will check the condition before executing, do-while checks after execution
14. [:heavy_check_mark:] **What is the main difference between a For and Foreach loop (in use-case, not structure)?**
    - for has an index, foreach not
15. [:heavy_check_mark:] **A variable declared within the opening and closing parenthesis of a method is called a ____
    variable?**
    - local
16. [:heavy_check_mark:] **Why would you choose `long` over `int`?**
    - long for numbers over 2billion (long: 64bits, int: 32bits)
17. [:heavy_check_mark:] **What's the difference between `long` and `float`?**
    - float= higher range
    - long= higher precision
18. [:heavy_check_mark:] **What value (`1/2` or `0.5` or `0`) will be printed for the following
    code? `System.out.println(1/2);`? Explain why?**
    - 0 -> 1/2 = 0 (int) -> string
19. [:heavy_check_mark:] **What is the difference between `.java` and `.class` files?**
    - .java: A file containing Java source code
    - .class: contains the Java bytecode produced by the Java compiler
20. [:heavy_check_mark:] **What is the output of following code?**
    `java
    boolean isTrue = true;
    if(isTrue != false){
    System.out.println("It is true");
    }
    System.out.println("It is false");
    `
    - It is true

### Questions OOP

1. [:heavy_check_mark:] **The term "instance variable" is another name for ___ ? And, what is it exactly?**
    - object variable, variable specific to a certain object
2. [:heavy_check_mark:] **The term "class variable" is another name for ___ ?**
    - A static variable: a variable defined in a class of which a single copy exists, regardless of how many instances
      of the class exist.
3. [:heavy_check_mark:] **What are parameters?**
    - variables used to define a particular value during a function definition
4. [:heavy_check_mark:] **What are arguments?**
    - the actual values that are passed to variables defined in the method header when the method is called from another
      method.
5. [:heavy_check_mark:] **What is the return type void?**
    - Nothing gets returned
6. [:heavy_check_mark:] **What's an object? What's a class?**
    - An object is an instance of a class
7. [:heavy_check_mark:] **What's state? What's behavior?**
    - State: data/values
    - Behavior: methods/functions
8. [:heavy_check_mark:] **What is an instance?**
    - An object of a class
9. [:heavy_check_mark:] **How do we create an object from a class?**
    - Classname objectName = new Classname(constructor params)
10. [:heavy_check_mark:] **What is the value `null`? What types can hold `null`?**
    - All referencetypes can be null
    - Null => there is no reference
11. [:heavy_check_mark:] **What is an object reference?**
    - Reference to an object (of a class)
12. [:heavy_check_mark:] **What is data encapsulation? What role do the access modifiers play in it? Provide all access
    modifiers.**
    - Keeping instance variables as private/enclosed as possible
    - Private: only accesible by this object, Protected: Accesable by package, Public: everything can access
13. [:heavy_check_mark:] **What is a constructor?**
    - A method to create a new Object instance of a class
14. [:heavy_check_mark:] **What is the default constructor?**
    - Empty -> no parameters req
15. [:heavy_check_mark:] **What is a package? Why do we use them?**
    - Organizing classes that belong together
16. [:heavy_check_mark:] **What is an enum and when should you use one?**
    - a way to limit the possible values of a variable
17. [:heavy_check_mark:] **What's the difference between a static method and an instance method?**
    - Static method is always available (in that class), instance method can only be used when an object is created
18. [:heavy_check_mark:] **What is a constant?**
    - static final -> value can not be changed and
19. [:heavy_check_mark:] **What is inheritance? Why is it useful? Give an example.**
    - Child class inherits methods/variables from parrentclass -> Parentclass Bird has a lot of childclasses that can
      inherit a lot of the same variables and methods -> avoid duplication
20. [:heavy_check_mark:] **What is composition? Why is it useful? Give an example.**
    - Splitting one class into multiple classes (components)
    - readability, maintainability, using diff component classes in different situations
21. [:heavy_check_mark:] **What is polymorphism? Why is it useful? Give an example.**
    - Changing the
22. [:heavy_check_mark:] **What is meant with the sentence 'Class A extends / inherits from Class B'?**
    - Class A utilises/implements the methods defined in Class B
23. [:heavy_check_mark:] **What is the difference between a (parent) class and an (abstract) parent class?**
    - Abstract class can not be instantialised
24. [:heavy_check_mark:] **What's the difference between an abstract class and an interface?**
    - Interfaces can not have states
25. [:heavy_check_mark:] **What is meant with the sentence 'Class A implements (interface) B'?**
    - Class A implements the methods defined in interface B
26. [:heavy_check_mark:] **How does an object gets 'destroyed' and thrown out of the memory?**
    - When object is no longer beeing used -> remove pointer and deallocates memory it occupies (the memory gets
      overwritten)
27. [:heavy_check_mark:] **What is the `Object` class?**
    - Parent class of all other classes
28. [:heavy_check_mark:] **To invert the value of a boolean, which operator would you use?**
    - !boolean
29. [:heavy_check_mark:] **What is casting? explain widening/upcast and narrowing/downcast.**
    - Casting = changing of type
    - Upcasting = casting a ref typ to a parent ref type
    - Downcasting = casting to a child class
30. [:heavy_check_mark:] **What does the `final` keyword do?**
    - after value is set, it can not be changed while the program is running
31. [:heavy_check_mark:] **What is the difference between `==` and `equals`?**
    - == : checks if the "object" is the same
    - equals: can be difined to check certain values, and conclude if the objects are the same if the values are

## Hands-on

For every codelab, a package `codelab{n}` has been created.
It's your starting location for implementing the assignment.

The assignments themselves are written down in this file, in the following sections.

Sometimes, tests have been written to validate your solution. Use (run) them.

### Codelab 01

1. [:heavy_check_mark:] Create a method that prints the string "Hello World!"
2. [:heavy_check_mark:] Create a method (`printAny`) that prints any string you give it.
3. [:heavy_check_mark:] Using method overloading, create two methods with the same name (`printNumber`).
    - Both have one parameter.
    - Both should print a message, although the message differs based on the type (int or double):
        - `I'm an int: {parameter}` in case of the actual argument being of type `int`.
        - `I'm a double: {parameter}` in case of the actual argument being of type `double`.
4. [:heavy_check_mark:] Create a method that returns the number it receives plus 1
    - E.g. 4 is provided as an argument, then value 5 is returned

### Codelab 02

1. [:heavy_check_mark:] Create a method that returns an array with all the letters of the alphabet.
    - Check the test to see what is required exactly.
        - E.g. is it required to include both lower and upper-casing characters?
    - Run the tests (before and after having implemented your solution)
2. [:heavy_check_mark:] Create a method that replaces the 3th element of a String[] array by "do".
    - Run the tests (before and after having implemented your solution)
    - Think about edge cases: empty array, null,...
        - Test scenario's:
            - `["we", "can", "work", "it"]` --> `["we", "can", "do", "it"]`
            - `["you", "should", "work", "it"]` --> `["you", "should", "do", "it"]`

### Codelab 03

1. [:heavy_check_mark:] Create a method that generates a 2D pattern (as a 2D array) based on a provided size (
   parameter).
2. [:heavy_check_mark:] Call the method and loop over the 2D array to print its contents to the console.
3. [:heavy_check_mark:] Based on the examples below, the pattern should be clear.
4. [:heavy_check_mark:] Run the tests (before and after having implemented your solution)

Some examples (size = 2), printed to the console

```
@@
@@
```

Some examples (size = 3), printed to the console

``` 
@@@
@ @
@@@
```

Some examples (size = 4), printed to the console

```    
@@@@
@  @
@  @
@@@@
```

Some examples (size = 5), printed to the console

```    
@@@@@
@   @
@   @
@   @
@@@@@
```

### Codelab 04

1. [:heavy_check_mark:] Create a method that returns the month in English by its number.
    - Run the tests (before and after having implemented your solution.
        - The tests will also show what the exact requirements are!
2. [:heavy_check_mark:] Create a method that takes in a number of elements and calculates a price based on the following
   rules:
    - The first 10 elements costs 5 euro each.
    - The following 5 elements costs 4 euro each.
    - Every next element costs 3 euro each.
    - A negative amount of elements will return 0
    - Run the tests (before and after having implemented your solution
        - Test scenario's:
            - amountOfItems == 1, then price == 5
            - amountOfItems == 0, then price == 0
            - amountOfItems == 9, then price == 45
            - amountOfItems == 10, then price == 50
            - amountOfItems == 11, then price == 54
            - amountOfItems == 15, then price == 70
            - amountOfItems == 16, then price == 73
            - amountOfItems == 20, then price == 85
            - amountOfItems == -1, then price == 0
3. [:heavy_check_mark:] Create a method that returns the following:
    - When the input is 1: "It's something"
    - When the input is 2: "That's more like it"
    - When the input is 3: "Way to go"
    - Other input: "That's a fail whale"
    - Run the tests (before and after having implemented your solution

### Codelab 05

1. [:heavy_check_mark:] Create an `Alarm`.
2. [:heavy_check_mark:] Make sure we can use a no-arg constructor and an single argument (the sound to make)
   constructor. By default,
   the sound to make is "BEEP".
3. [:heavy_check_mark:] The `makeSound` method(s) should return an array containing x-times the sound to make.
    - We should be able to provide x, although it should not be required.
    - If x is not provided, the returned value should contain the 'sound to make' 3 times.
        - 3 is the default amount of times to make a sound.

### Codelab 06

We're going to program a (French) deck of cards.

French decks come in a variety of patterns and deck sizes. We're going for the most popular 52-card deck.
It includes 13 ranks of each suit. There are four suits: hearts, spades, diamonds and clubs.
Each suit includes an ace, a king, queen, and jack, and numbers two through ten.

Commercial packs often include between one and six jokers, most often two.
But we will not include them in our solution!

1. [:heavy_check_mark:] Create a class that represents a single playing card.
2. [:heavy_check_mark:] Create a class that represents a deck of (52) cards.
    - After creating a deck of cards object, it should hold 52 cards.
    - However, it should also be possible to create a deck of cards object for which
      we provided (as an argument) the cards (possible not 52 cards).
    - It should be possible to check whether a certain card (argument) is part of the deck of cards.
    - It should be possible to get a textual representation of the entire deck of cards.
3. [:heavy_check_mark:] Write a small executable program in which you create a deck of cards and check whether a certain
   card is part of it.

### Codelab 07

- [:heavy_check_mark:] Write a `Dog`, `Labrador` and `Chihuahua` class.
- [:heavy_check_mark:] All dogs have a name and can bark
    - The actual barking sound is specific to the breed of dog.
        - A labrador has as its barking sound value "WOOF WOOF!"
        - A chihuahua has as its barking sound value "Kefkefkef!"
    - The name is specific to the actual instance of a dog.
- [:heavy_check_mark:] All dogs also have an average breed weight
    - The actual value for the average breed weight is specific to the breed of dog.
        - A labrador has as its average breed weight, value 35 (Kg).
        - A chihuahua has as its average breed weight, value 2 (Kg).
    - We should be able to let every dog bark
    - We should be able to **get** the average breed weight for every dog
    - (It should not be possible to create instances of `Dog` itself)

- [:heavy_check_mark:] Chihuahuas also have a color field, it can be either Brown, Black or White.
- [:heavy_check_mark:] Override the `toString` method, it should contain the entire state of every dog.
    - For a labrador: "Labrador: (name = Labby, sound = WOOF WOOF!, average breed weight = 35)"
    - For a chihuahua: "Chihuahua: (name = Darling, sound = Kefkefkef!!, average breed weight = 2, color = Brown)"
- [:heavy_check_mark:] Override the `equals` method: two dogs are equal if they have the same name and make the same
  sound.

### Codelab 08

- [:heavy_check_mark:] All birds have a beak size, it can be small, medium or large. Furthermore, it should be possible
  to **get** this
  beak size.
    - Eagle is a specific type of bird, an eagle has a large beak size.
    - Pigeon is a specific type of bird, a pigeon has a medium beak size.
    - Dodo is a specific type of bird, a dodo has a large beak size.
    - (any future new specific types of bird will also have a beak size)
    - (creating an instance of a (non-specific) bird should not be possible)

- [:heavy_check_mark:] Most birds can **fly**, but not all! Eagle and Pigeon can fly, a Dodo can not.
    - When we let an eagle fly, it should return textual value "I'm soaring through the sky!"
    - When we let a pigeon fly, it should return textual value "Flap flap... oeh, look, breadcrumbs!"
    - It should be impossible to let a dodo fly (they're fly-less birds!)

- [:heavy_check_mark:] For all the specific birds that can fly (eagle and pigeon), we should also be able to get the
  maximum altitude
  it can fly.
    - The maximum altitude is specific to a single instance (so 2 eagle birds can have a different maximum altitude).
      However,
      there is a range per bird type.
        - Eagles should have a maximum altitude between 4.000 and 5.000 meters (both including).
        - Pigeons should have a maximum altitude between 500 and 750 meters (both including).
        - Dodo's do not have the concept of a maximum altitude (as they don't fly...)

- [:heavy_check_mark:] Finally, create a `Sky` class. It should have a class - not instance - method
  that accepts (as an argument) an array of birds that can fly (only!).
    - Let this method loop over the array and let it call, each bird's fly method.
    - Each time, print the value returned by the fly method to the console.

### Codelab 09

Let's design - in code - a Laptop.

- [:heavy_check_mark:] Our `Laptop` class consists of a screen, a storage device, RAM, a processor and peripheral
  devices (keyboard,
  mouse,...)
    - Make sure that each of these components are represented by some obvious state and have some useful behavior.

- [:heavy_check_mark:] A screen can be either an LCD screen or LED screen (and in the future, who knows what else...)
    - Possible state: resolution, color, brightness,...
    - Possible behavior: dim (brightness),...

- [:heavy_check_mark:] A storage device can be either HDD or SSD (and in the future, who knows what else...)
    - Possible state: speed, size,...
    - Possible behavior: storeData,...

- [:heavy_check_mark:] A processor can have 3 different modes: energy-saving, normal and overclocked.
    - It should be possible to let a processor switch from its mode (during runtime)
        - E.g. from energy-saving to normal
    - Possible behavior: processInstructions,...

- [:heavy_check_mark:] It should be possible to **get** both the active and idle energy consumption of all screens,
  storage devices and
  processors.
    - Energy consumption can be written in kilowatt hour (kWh).

- [:heavy_check_mark:] keyboard and mouse are both peripheral devices. A laptop can have up to 5 peripheral devices.
    - All peripheral devices should have a method to use them. But based on the specific peripheral, using it means
      something else.

- [:heavy_check_mark:] Finally, create an instance from `Laptop` and interact with it (maybe also print it to the
  console?).

Think about your design (simply think about these questions):

- When and where do we need (or can use) inheritance?
- When and where do we need (or can use) abstraction?
- When and where do we need (or can use) composition?
- When and where do we need (or can use) interfaces?
- When and where do we need to create additional concepts (classes, enums,...)
    - E.g. is resolution a concept which we can or should create?

## Finished?

1. Ask feedback on your solutions
2. Review the solutions from the `solutions` branch [:heavy_check_mark:]
3. Complete all uncompleted codelabs from modules `10-basics` and `20-oop`. [:heavy_check_mark:]
4. Start / continue with Rowdy Racers
