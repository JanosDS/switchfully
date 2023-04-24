# Codelab02 - Our first components

## What are components?

In modern web development, you will notice that most, if not all, of the popular frameworks or libraries work with components. React is no different. Before we can make it do things, we need to break it apart into manageable, descriptive components. React doesn’t have any hard rules for what is and isn’t a component – that’s up to you! But how do we define our components?

Defining a component can seem tricky until you have some practice, but the gist is:

* If it represents an obvious "chunk" of your app, it's probably a component
* If it gets reused often, it's probably a component.

That second bullet is especially valuable: making a component out of common UI elements allows you to change your code in one place and see those changes everywhere that component is used. Let's start with two components that will be shown all the time in our app!

## Making our Header

The first component we will be making is our header. Inside your **src** folder, make a subfolder called **components**. We'll store all of our components in here. Inside that components folder, make a new file and call it **Header.jsx**. Let's add a bit of detail to what a component should consist of first.

A React component contains both JavaScript and HTML/CSS. We include the logic that this particular component needs to function and the code to show that component on our screen the way we want it to. In a very top-level way, you could see three parts in a component.
* **imports**: Just like in Java, we need to import specific dependencies our component needs to function.
* **logic**: The first part of our component contains logic. We can initialize variables, include functions and all sorts of things.
* **output code**: This is the code that will determine how this component is shown to our clients. You can recognize it because it often starts with return() or ReactDOM.render(), depending on if we are using functional or class components. We can call on our logic from within our HTML since we use JSX. You'll see this for yourself soon enough.

Excuse me Switchfully? Functional or class components? What is this sorcery?
Yes! React offers you two kinds of components. They can do exactly the same, the syntax is just different. Let's illustrate this with an example. Below you can see a class component showing a sentence on screen.

    class Car extends React.Component {
        render() {
          return <h2>Hi, I am a Car!</h2>;
        }
      }

The exact same example, written as a functional component, will look like this:

    function Car() {
        return (<h2>Hi, I am a Car!</h2>);
    }

In this simplified example, there isn't that big of a difference between the two. However, in everyday work, functional components can be written using less code, which makes them easier to use and understand. Class components have a different way of handling state compared to functional components. State is probably one of the most important aspects of ReactJS, since
it is what we will use to determine our app's behaviour (a component will rerender when its state changes, you'll see the importance of this while going through these codelabs). In the current version of React, certain functionalities are also dependent on the use of functional components.
Because of this, we won't be using class components in our codelabs. Functional components are the way to go in modern React applications!

Enough talking, let's get that header component on our screen! In **Header.jsx**, we will be showing our title inside the header. To do this, we will use CSS (don't worry, we already made it and you can just copy/paste) and a tiny bit of code for this. First of all, type ```function Header() {}```. In between the curly braces, we will
add our code. We want to define our title as a constant and call that constant from within our HTML.
* Make a new functional component **Header.jsx**.
  * Make a file **Header.jsx** in your components folder
  * Add a function named Header in your newly created file. Like so: `function Header(){}` 
* You will need to import the React library for your component to work. Add ```import { React } from 'react';``` at the top of your file.
* Define a constant **title** in your **Header()** function and give it a String value *Petinder*.
* Copy the HTML code you find in the **header.html** file into your component.
  * The html code for your code goes into a `return (<html_code_goes_here>)` statement in your function. 
  * The html code itself nothing very special, except the way we are showing our constant variable title on the screen. To do this in React, we wrap that variable in curly braces -> **{title}**.
* One very important step still needs to be taken before our component is ready to be used in our app. We need to make sure it is accessible to other components and to do so, we have to **export** it. At the end of your file (outside your function), add ```export default Header;```. This will export your component, making it visible to other components
  who want to use it.
* One last small detail that you might have noticed. In our HTML, we don't use **class** as CSS tag, we use **className**. This is because class is already a reserved keyword in JSX files, hence there is a different notation for our CSS classes: className. Other than that, there is no difference.

## Making our Footer

Good job on that header, let's do the same for out footer! You can repeat the same steps, only the look and logic in the footer will of course be slightly different. When your component is set up, copy and paste the code you find in footer.html. You'll notice there is something missing here.
We want to show the current year in our footer, but we don't want to update it manually whenever a new year hits.
* Set up the **Footer.jsx** component.
  * Create the file
  * Set up a component like you did with **Header.jsx**
  * Copy the content from **footer.html** into this new component. Use **Header.jsx** on how to do this.
* Make sure the year is displayed correctly.
  * Everything between `{}` in your html code will be evaluated as JavaScript. Add the necessary JavaScript code to display the year.
    * Hint: JavaScript has a Date() functionality, just like Java does.
* You might notice something weird in the HTML file. ```{' '}``` is a JSX annotation to show a space, in this case between our current year and Switchfully.

## Showing our components

When you save your components and check your application at [http://localhost:3000](http://localhost:3000), you won't see any difference. This makes sense, we have our components but we aren't instructing our application to show them yet. Let's fix this!

Copy/paste the code from **app.html** into **App.jsx**. You'll see a lot of code in **App.jsx** already, you can safely delete it all and put the code in the return method of a functional component called **App**.
* Delete the contents in **App.jsx**. Make this component a functional component that returns the HTML you copied from **app.html**.
* Add our Header and Footer component in the right place. Inserting a component is nothing more than simply typing ```<NameOfYourComponent />```. 
  * In our app, this means Header should be right below the opening of our wrapping ```<div>``` 
  * The Footer goes right above the closing of our wrapping ```<div>```.
* If you want an example of how a component can be called, take a look at **index.jsx**. Our application starts there with the calling of our **App** component.

Save all your files and take a look at your app in your browser. Not what you expected? There's are a few more final step we forgot:

* Adding the CSS
  * Copy the contents in **styles.css** and add them to **index.css** in your app. 
* Displaying an image
  * To display an image you first need to save this image in your **src/** folder and then reference it from your component.
  * Add the directories **assets/images/** to your **src** folder.
  * Copy **heart.png** to your images folder
  * Reference the image from your component by adding `import pic from '../assets/images/heart.png'` to your header component

This should solve the final issues. Enjoy your header and footer! 

## Conclusion

We now have a working React application with our own custom CSS attached to it. There are two components, Header and Footer who are being called from within the App component. They will be shown in every part of your app.

You've learned:
- How to create a component.
- How a component is structured.
- What the **export** statement is used for.
- What the difference is between a **functional** and a **class** component.
- how to access a variable in the view using the ``{}``-operator.
- how to add a component to your app by inserting it where you want it to appear.
