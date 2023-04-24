# Codelab05 - Adding a pet

Time to provide the possibility to add a pet! We want this app to grow larger than Facebook! In this codelab, we'll be working with a new component called **AddPet**, which we will include in our **ProfileGallery** component. We will
also add a new call to our **PetService**, since we need to make a post to our API in order to add a new pet. Let's start with the latter!

## Extending our service

At this moment, **getPets()** is the only function present in our service. Time to add a second one, called **addPet()**. 
* Make a new function called **addPet()**. Not sure how to? Get inspiration from the **getPets()** function. It looks kind of the same, with just a few tweaks since this is a different kind of request.
* This function should call our API and make a post request. Check the controller in our backend to see the details needed to make this work. What does the backend need in order to be able to accept this request? Do you need
to pass anything on with this function for that?

## The AddPet component

Adding a pet is an entirely independent functionality. We can make a new component for this. It helps keep our codebase structured and separates responsibilities. 
* Make a new functional component called **AddPet.jsx**.
* Paste the contents of **add-pet.html** into this new component.

Let's look at what we have here. We have a form which enables us to fill in the required fields. Outside that form (more on that soon), we have 
a button labeled _submit_. By now you know what we want to achieve here. We want to be able to fill in the fields, click submit and see our newly added
pet appear. This requires us to take a few steps.
* We need to provide a function to call when our submit button is clicked
* We need to handle whenever someone types something in one of the fields
* We need to provide functionality that updates our profile gallery when a new pet is added (we don't want to manually refresh)

Let's start with making sure our form does what we expect it to do. 
* Create a state for each value in our form. We can do this with the useState() hook. Adding a pet means providing a name, kind, image and profile text. You can write this using four separate useState() implementations, but you can also work with one useState() function by linking it to an object with the necessary fields.
* In our form, we need to attach each input field to the correct state. You can do this by using e.g.: **value={formValue.name}** for the name field. formValue is the name you gave the state containing the values for your form.
* This won't allow us to record what we type just yet. We need our code to update the value of the state every time we update the value in the form. For this, we will add an **onChange()** function that sets our state to the value of the input (remember our search input field?).
* Extend your input tags with **onChange={(e) => setFormValue({...formValue, name: e.target.value})}**. This goes for the name field. Do the same for the other fields, adjusted for their value. Do mind that your syntax will look different if you wrote separate useState() implementations.
* Add a **handleSubmit()** function that takes our values and uses them in a new Pet object. Pass that Pet object on when you call the **addPet()** function we wrote in our **PetService**. Make sure this function gets executed when we press the submit button.  
* Add the component to our ProfileGallery. We can show another component by using the following code: `<AddPet><AddPet/>`. You can add this right below the search functionality.
Try this out. Is it working? Even if you're not seeing anything change on your screen, keep an eye on your backend to see if the pet got created. If it was, refresh your browser, and you should see it appear.

## Using state to update our profile gallery

Remember when we said we would come back to state when we needed to see our profile gallery get updated when we alter our list of pets. The moment has come! Adding our pet doesn't seem to trigger any change in our frontend at the moment. Time to fix this!

State is the beating heart in everything that React does. We want to re-render our ProfileGallery component, and we can achieve this by altering its state. However, AddPet is a child component and React gets angry when we try to pass properties upwards. Luckily, there is a way to alter state
from within a child component. In short, we will have to create a function in the parent component that changes its state. That function can be passed down to a child component. When we call it from within the child component, we will update state in the parent, triggering our render and updating our list! Easy-peasy right? (Just kidding, we struggled with this for quite a while actually).

* Create a new state in the ProfileGallery. Call it componentState and initialize it as { state: 'Updated' }.
* Create a function called **updateState()**, where you set componentState to a value you passed on. 
* We need to pass this function to our child component, AddPet. Passing a property or function is done the following way: `<AddPet triggerParentUpdate = {updateState} />`. triggerParentUpdate is the name you will use in the child component, it can be literally anything you want.
* In AddPet, we will have to specify which property or function we are receiving from our parent component. We can do this by adding **{triggerParentUpdate}** inside the parentheses in our AddPet function.
* All that's left is making sure our state gets updated when we add a pet. We want the triggerParentUpdate function to fire when addPet() has been executed. This sounds like a fit for something we saw before, promises!
* Add a promise to the part of the code where we execute **addPet()**, making sure **triggerParentUpdate()** fires after the call was made succesfully. Don't forget to pass a new value for the state with the update function. (Hint: promises can be chained)
* Try adding a pet again. Your profile gallery should update now after successfully adding a new pet! Good job!! :thumbsup:
* To make it perfect, write a function **clearForm()** that sets the values in your form to empty strings and call that after our call as well. It will clear our form when needed.


* **OPTIONAL**: Write a separate function called **handleChange()**, allowing you to just call that function when using onChange in the HTML instead of inlining the entire function. The result will be the same but the code will be prettier. Look at our repository if you can't figure out how to do it.

## Conclusion
You've learned:
- Using a form to pass data from your frontend to your backend.
- Using state to manipulate data and components throughout your application.
- Changing state in one component from within another component.
- Using promises to determine which steps should be taken after an asynchronous call.
- Passing properties and functions from a parent component to a child component.
