# Codelab03 - Showing our pets on the screen

With our basic layout structured and working, it's time to finally show some content. In real Tinder, it's all about the pics, so let's get our pets on the screen! For this, we have a basic Java backend running which is connected to a Postgres database, all in Heroku. 
This codelab will teach us how to fetch this data from within our React app and show it to the world! Even though our backend app is available through Heroku, we will check it out locally and spin it up ourselves.
This way, we can check and/or change backend code if needed (spoiler: you won't have to change a lot). It helps you to understand what is needed to enable our back- and frontend to talk to each other. You can find it at [https://github.com/switchfully/angular-pet-tinder-backend](https://github.com/switchfully/angular-pet-tinder-backend). Download it and spin it up!

## Defining a pet

* From this point on, we will have to take our backend into account. We're not just showing pets magically in our frontend, we're going to fetch them from a backend which has its own peculiarities and rules. In our Java code, we have defined what a Pet object needs before it can be a _real_ Pet object. 
Have a look at it and check the necessary fields for a Pet object.
* In React, we also want to define what a Pet object consists of. We will use it when we want to add a new pet. Similar to Java, we will make a Pet class that has the necessary fields. The syntax looks like this:

```
export default class Pet {
  constructor(var1, var2, and so on...) {
    this.var1 = var1 
    this.var2 = var2
    and so on...
  } 
}
```

You can fill this up with the contents you find in our backend Pet class (look for the constructor for this).
* Define a Pet model. For structure, make a model directory in our app's root folder. Inside that model directory, create a new file and call it **Pet.js** (note the use of .js instead .jsx, there will be no JSX in this file since we are not showing anything on our screen. This is pure JS). 
Inside this file, we will write the code to define a Pet object's contents.

## Creating our profile gallery

We'll show our pets in the center of our screen. Since this is a key-part of our application, we can hear this profile gallery screaming for its own component! 
* Make a new component and call it **ProfileGallery.jsx**. 

Don't start adding code to it yet, we'll cover something else first. In order to get our list of pets, we are going to make a call to the API running in our backend. We _could_ include all this information in our ProfileGallery component, but this would make it extensive and cluttered. 
It's best to keep calls like this in a separate file. Let's do that first.

## Creating a service

* Create a new subfolder in **src** and call it **api**. Create two new files inside that folder, **Client.js** and **PetService.js**.
* In the **Client** file, we will define our backend address. In **PetService**, we will be making the actual calls to our backend.
* Making http calls in React is a bit different from, for example, Angular. Angular has **HTTPClient** present, allowing you to perform such operations out-of-the-box. This is one of the key differences
between React and other frameworks. React does not have a library included that is able to handle these kinds of requests. It is possible in plain JavaScript, but most projects choose a different approach. React feels like an empty box at times. This is good because you are free to choose the solution you like, but to somewhat inexperienced devs, this can sometimes be daunting. What is the right way to go here? Want our honest answer? We're not sure either. Sometimes 
the answer is quite obvious, sometimes every article you research tells you something different. Experience is the only thing that can save you here. Give yourself time to learn and, over time, you'll have a toolkit at your disposal of which you know it will do what it needs to do!

* As for our current issue, a beloved library that has kind of become an industry standard is [Axios](https://axios-http.com/). Install it by using npm: ``npm install axios``.
* If all went well, you're now able to use the Axios library to make http calls. Back to our **Client.js**! We are going to define the url where React can find our backend here. To do this, we will define a constant called **apiClient**. We will attach an axios instance to this constant with the information we
want to specify. Afterwards, we'll export that constant, so it can be used throughout our app. Add the following to **Client.js**.
```
import axios from 'axios';

const client = axios.create({
  baseURL: 'https://pettinder.herokuapp.com/',
});
export default client;
```
* Let's move to **PetService.js**. We will be making the call to our API from here. Start by adding the import for the **client.js** file we just created, enabling our PetService to access and use it.
* Create a function **getPets()**. From within this function, we will call our API and return its response. The code that does this, is this: ``client.get('pets');``. ``client`` refers to the value obtained from our **Client.js** file. ``get`` is a function accessible to every axios instance and its purpose is quite clear in
this case, it will make a get call. ``'pets'`` is the mapping in our API where this request can be made. For now, this is all you'll need in **PetService**. We want this function to be accessible throughout our app, so don't forget to expose it. You should know by now how to achieve this. (Hint: an export doesn't always have to happen at the end of your file)

## Back to our ProfileGallery component!

Hold on to your horses, lots of stuff is about to happen in this ProfileGallery component. We'll clearly state what we want to achieve for now: **We want to show all the pets available in our database in this profile gallery.** This seems and feels like a pretty straightforward task, but implementing it will introduce several
new concepts. **Hooks**, **state** and **promises**! The first is a relatively new concept in React, the second is a very important part of React as it defines the lifecycle of our components and therefore the behaviour of our app, the latter has been around in JavaScript for quite some time and is typically used when working with asynchronous operations (which a get call to a backend API is). 
Let's provide some more insights here.

### State

React uses state in its components. State can be seen as a plain JavaScript object containing information we provide. State is managed within the component it is declared in. The most important aspect of state is the fact that, if state gets altered, React will respond by re-rendering our component. This is of major importance for any application,
and we will show it in action once we add functionalities like adding or deleting a pet (spoiler: React will not be so kind to refresh our list of pets automatically after we alter it, we'll have to _instruct_ it to do so and to achieve this, we'll be using the state of our component). We'll get back to it later, and it will become more clear
once you're actually working with it over different components, but if you want to know more already, you can check out [https://reactjs.org/docs/hooks-state.html](https://reactjs.org/docs/hooks-state.html).

### Hooks

In the past, React could become pretty complicated when updating state.`You'd be using functions called **ComponentDidMount** or **ComponentDidUpdate**, which quickly had the tendency to become big and cluttered since updating state wasn't the only responsibility you would find in these.
Hooks were developed to make this process easier. It would take us too far to explain it in detail in this codelab, luckily the ReactJS docs are quite extensive on this part. Have a look at [https://reactjs.org/docs/hooks-overview.html](https://reactjs.org/docs/hooks-overview.html) to learn more about hooks and see them in action.
As always, we're available for questions if anything would be unclear.

### Promises

A Promise is a proxy for a value not necessarily known when the promise is created. It allows you to associate handlers with an asynchronous action's eventual success value or failure reason. This lets asynchronous methods return values like synchronous methods: instead of immediately returning the final value, the asynchronous method returns a promise to supply the value at some point in the future.
That's a big explanation, which we can simplify with an example from this very exercise. We want to fill our profile gallery with all our pets. To do so, we need to make a call to our API. Making this call is an asynchronous operation. We do not know when we will receive a response, all we know is it won't be instant since it's a call to another application. So we want to work with a promise. You can recognize promises by the **then** keyword.
You can read it as: "when this asynchronous operation completes, then do this". If you don't wrap certain actions in a promise after making an async call and instead put them in a function that gets executed after the function that contains the call, you might get weird behaviour. This is caused by the result of the call not being received before the other function fires. That is async for you. Keep this in mind when making calls to your backend.

Back to our **ProfileGallery** component. 
* Declare a functional component called ProfileGallery. 
* At the very start of our function, we are going to declare the hooks we will be working with. For now, we just want to include a **useState()** hook that will enable us to keep and change a list of pet objects. We will write this as follows:
```
const [pets, setPets] = useState([]);
```
**pets** is the variable our list will be stored in. **setPets** is a function we can call to replace that pets variable with new content. We add the empty array to our useState() function to declare what the starting value of pets has to be (pets gets initialized when the component is created).


To fill up pets with the result of the corresponding call to our backend, we will use a second hook, called **useEffect()**. 
We use this hook when we want to do something after rendering our component. 
React will remember the function you passed (this is our "effect") and call it later after performing DOM updates (aka loading the component). 
This feature comes in handy for our requirement, as it allows us to pass on a property at the end. 
This property will be the property that is being watched by our useEffect() hook. 
When that property changes, our hook will be re-executed. 
In our application, we will make the hook monitor a certain state. We can alter that state when we, for example, add a pet. Altering the state will trigger a rerender of our component, which in its turn will re-execute our "effect". 
Our list of pets will be refreshed!
* Implement this useEffect() hook as follows:

```
useEffect(() => {
getPets().then((result) => setPets(result.data)));
}, [componentState]);
```
Implementing this into your app will break it. **ComponentState** is not known to our app at this point. In the future, we will want to be able to set this componentState to a different value. Sounds awfully familiar to **pets** right? 
* Make this error disappear before you move on to the next part.

## Showing our gallery

What we just included is the logic behind what we want to show. We have code that allows us to make a call to our backend. By using hooks, we attached state to it, allowing us to update and re-render when needed (this will come in handy in the next codelab). That's awesome, but we're not showing anything yet. Time to fix that and see the result of your hard work!
Just as a small recap: When using functional components in React, we show on the screen what we provide within our return() statement. If we type ``return(<h1>Switchfully rocks!</h1>``, you can probably guess what would be rendered on your screen. We're going to apply the same principle for our ProfileGallery component.

Start by adding **return();** below your logic in the component. Inside the parentheses, you can copy the contents of **profile-gallery.html**. This is the HTML we will be using to view our profile gallery. Of course, you still need to add some things in there to make it work.
What we want to do, is **map** our **list of pets** so that each individual pet in the list gets put in a ```<div>``` that shows the pet's name and its picture. Look at our HTML. Which ```<div>``` (not restricted to one) should be a dynamic? Dynamic means changed whenever a new pet is being rendered. Once you have figured out which ones, you want to include them in your mapping function. It's the only way
to make the current pet and its properties accessible to them. Your code will look like this:

```
{pets.map((pet) => (
            <div
              className="gallery-pet fader"
              key={insert-the-key-here}
            >
              <img
                src={insert-your-source-here}`}
                className="profile-picture"
                alt="pet"
              />
              <div className="overlay">
                <div className="overlay-text">{Render the current pet's name here}</div>
              </div>
            </div>
          ))}
```

The only thing left to do here is changing the dynamic values for each individual pet. You should be able to make it so that you show the right value for each individual pet object. The only thing that might require a bit more explaining is the **key** attribute. React needs a key to map your pets. Keys help React identify which items have changed, are added, or are removed. Keys should be given to the elements inside the array to give the elements a stable identity.
What would be the best key to identify each pet in our case? Check the backend to see if there is a property that is unique to each pet and easy to use as a key. Afterwards, include it as the key in your code. Unsure about it? Ask a coach or check the model solution.
* Replace each value between curly braces so your app shows the correct information.
* Make sure the key is a property that is present in each pet and can be used to uniquely identify a pet.
* Once you've included the key, do the same for the image and name. If you run your backend locally, you should be able to figure out where you can fetch the images from.

## Testing the result
* Time to try out your code! Open up your [localhost:3000](http://localhost:3000) and see what it is you're showing on your screen. Not seeing any pets? Getting weird message about CORS in your console? That is because we forgot one important thing. Our application needs to be "allowed" to talk to our
  backend. To do this, we need to add one small annotation in our backend. Go to our ``PetController``. Above the class definition, type ``@CrossOrigin(origins = "http://localhost:3000")``. Reboot your server and try again. Everything should work now!

  > Want some more info on CORS and some more specific use-cases? Take a look at https://www.baeldung.com/spring-cors 

## Conclusion
You've learned:
- what services are and how to create them.
- how to install a new library.
- how to make http calls in React with the Axios library.
- how to use promises whenever you are making asynchronous calls.
- what state is and how to use it through hooks.
- what hooks are and what useState() and useEffect() do in particular.
- how to map over multiple items and show each individual item on your screen.
- how to show data for each individual item.
- how CORS works.
- how to make your frontend and backend communicate with each other




