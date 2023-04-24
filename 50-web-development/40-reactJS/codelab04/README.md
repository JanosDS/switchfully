# Codelab04 - Adding a search functionality

This is starting to look decent. We're making a call to our backend and utilizing its response to show the entire list of pets in our database on our screen! Great job so far, but Petinder needs more before Google will want to buy it for big cash!

**IMPORTANT NOTICE: With the knowledge gained from prior codelabs, we will start giving you less _solutions_ and instead try to guide you towards the correct implementation. You can do this! :muscle:**


![](https://media.giphy.com/media/13B1WmJg7HwjGU/giphy.gif)

Let's start by adding a functionality that will enable us to search for a specific pet by its name. Once we go live, millions of pets will be looking for love through our app, so we want some sort of filter present.

## Search your pet

At this moment, we receive a list of pets from our backend, and we are just showing it on our screen. If we want to filter this list based on names, we will have to somehow capture the characters a user types in a searchbar and filter our list based on that. Let's
create our searchbar first. To do so, add the code in **searchbar.html** below your profile gallery code. Add it so that the result looks like the example you find at [https://petinder-react.netlify.app](https://petinder-react.netlify.app).

Good, with that out of the way, let's talk logic for a moment. **We will have to provide a way so that our list of pets gets updated in real-time, depending on the changes our app records in our searchbar.**

Inside the **input** tag, you can see an attribute called **onChange**. This is where we will define what needs to happen whenever an event takes place. In our case, the event we are looking for is the typing of a character. The implementation will look like this: 

```
onChange={(event) => what-needs-to-happen}
```

Only one thing needs to change here, we want to provide a function that gets executed everytime a user types a letter in our input field. We don't have to change **(event)**, since that is just a placeholder name for our event. It could be literally anything, as long as we refer to it in our implementation. Conventions here
is the use of either **event** or **e** as a name.

Take a look at the value attribute in our input tag. It is set to **{filterText}**. This could provide a bit of clarity (don't worry if it does not though). 
We are going set the value of a variable called **filterText** to the current value of our input field. Every time someone types a letter in this field, this variable is being
updated with that new letter. When I type _a_, filterText should get value _a_. If I type _b_ after that (seeing _ab_ in the search field), filterText becomes _ab_. This filterText variable can be used to filter our list of pets according to its value.

In a way, we will be setting our filterText variable to the value of our search field. What technique did we learn about in the previous codelab that could easily allow us to do this?
* Provide a filterText variable and a way to set it to a new value.
* Adjust the onChange method in our **input** tag so that filterText is updated with its value. We want to record every change to its value, we can track this kind of change with **event.target.value**.

All that's left is to provide a filtered list of pets, filtered by the value of filterText. If nothing has been typed in the search field, filterText will be an empty String, and we show every pet in our list. 
Once filterText changes, we want to show the pets in our list that correspond to this change.
* Make a new variable **filteredPets**, give it our list of pets as a value and find a way to filter it so the list only shows the names that include the letters that are present in filteredText.
* If your searchbar isn't working, take a good look at what you are doing when showing your pets on screen. _Which_ list are you showing?
* Be wary of potential edge-cases that could mess with your result.

Looking good! You know what would make it look even better? Sorting our result alphabetically! 

## Sort out gallery alphabetically

Lucky for us, sorting alphabetically isn't that big of a deal in JavaScript. We'll leave this one to you! 
* Adjust the **filteredPets** variable so that it, besides filtering, also sorts our list of pets alphabetically by the pet's names. (take a look into JavaScript's sort() functionality if you don't know where to start). [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/sort) is a good place to find more info on this (and many more frontend-related things).

## Conclusion
You've learned:
- How to sort a list in JavaScript.
- How to filter a list in JavaScript.
- How to look for an event that changes a field in our HTML through the use of onChange and events.
- How to use state to set a filteredText and use that immediately when an event takes place. The app adjusts on-the-fly.
