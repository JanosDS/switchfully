# Codelab06 - Showing pet information and deleting a pet

Having lots of pets is wonderful, but right now we're only showing a name and a picture. Our users will want to see each pet's extended information. Time to work on that!

## The PetInformation component

We will be making a separate **PetInformation** component for this. This component will show us the specific information for the pet we clicked in our
profile gallery. This means we will have to send that information down in our application structure, **PetInformation** will be a child component of **ProfileGallery**.

Let's start off in our ProfileGallery.
* Create a new state selectedPet. Its initial state can be null.
* In the div that contains our pet's picture and name, add an **onClick()** that sets our selectedPet value to that specific pet. You can inline an arrow function to achieve this.
* Setting the selectedPet isn't enough, we need to pass this pet down to our child component as well. Even though it doesn't exist yet, add the PetInformation component below the AddPet one and pass selectedPet on as a property.

We move on towards the PetInformation component:
* Create a new PetInformation component and paste the contents of pet-information.html inside it.
* You can see this HTML is missing quite some required code to make our component function the way it should.
* Make sure our selectedPet is accessible in this component. It's an object with multiple fields so use the spread operator when adding it. You can find more info on this at [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Spread_syntax)
* Destructure it to make ESLint happy. You can find more info on this at [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Destructuring_assignment)
* Now adjust the HTML to show everything needed, conditionally. This means, only show this component when a pet is selected. Doing this in JavaScript works like this:
```
{propertyToCheck
    && (
        code to show or not show
        );
}
```
_Remember that the html of a component always needs to be in **one** tag. Encircle your html with `<></>` when needed._

In this piece of code, we are checking if our propertyToCheck is true or false. If true, we'll show what comes after &&. If false, we're not showing anything.

This should be it as far as our pet's information goes. Try to click a pet in the profile gallery and check if the correct information pops up.

## Deleting a pet

From within the same PetInformation component, we will also provide the possibility to delete a pet. This won't differ that much from what we did when adding a pet. Heck, we don't need a form for it, so it's probably easier.
* You can see the **delete pet** button being present in **pet-information.html** . We just need to provide the **handleDelete()** functionality.
* Add a function **handleDelete()** which calls a **deletePet()** function in our **PetService**. By now, you should be able to write that deletePet() function yourself.
* Take a step back and revisit the previous codelab. We added a pet and our profile gallery didn't update automatically. We took a few steps to get this working the way it should. Do the same for this delete pet functionality. Make sure
the state in ProfileGallery changes, triggering a render of this component and thus updating our list of pets.
* After successfully deleting a pet, you will notice the pet's information is still present even though it was deleted. Try to fix this bug by adding a promise that will prevent this.

## Conclusion
You've learned:
- Using conditions in your HTML to show or not show specific code
- Passing specific properties to a child component in order to work with them.
