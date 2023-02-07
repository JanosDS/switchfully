# Codelab07 - Setting up a date

We're _almost_ done! All that's left is to add the functionality to arrange a date with one of our pets. For this, we will route our app to a different component,
which means our ProfileGallery will be replaced with the SetupDate component on our screen. Let's dive into this!

## Routing to a new component

Right now, routes are not available in your application. ReactJS doesn't offer this out-of-the-box. We will have to install a library for this. Routing is an indispensable
part of every application, so this library will most likely always have to be installed. We will be using **react-router-dom** for this, which you can add to your project by typing
**npm i react-router-dom**. If you're interested in documentation on this, you can find it at [their repository](https://github.com/remix-run/react-router/blob/main/docs/getting-started/tutorial.md).

Adding routes to React is pretty straightforward. We will be adding ours in **App.jsx**. You can use the following example and adjust it to your app:
```
<div>
      <Header />
      <div className="container-fluid">
        <div className="row">
            <BrowserRouter>
                <Routes>
                  <Route exact path="/" element={<ComponentName />} />
                  <Route exact path="/path" element={<AnotherComponent />} />
                  <Route path="*" element={<Navigate to="/" />} />
                </Routes>
          </BrowserRouter>
          <Outlet />
        </div>
      </div>
      <Footer />
</div>
```

This is the code you will see in your App.jsx file after adding the routing functionality. The first two Routes are custom routes you provide to any of your components (you can pass on properties or functions here as well). Adjust
them to show what they need to show. The first should show our ProfileGallery, the second the SetupDate component we are going to make.
The last Route is a fallback that is used whenever someone tries to go to an address that doesn't exist. It can be used to show a custom 404 page.
<Outlet /> is where the result of our routes will be shown. The component we show will be replacing <Outlet />.

Once this is done, your routes are active and working.

Of course, routing to a SetupDate component won't be working since we still need to create it. Let's do that!

## Creating the SetupDate component

* Create a SetupDate component and paste the contents of setup-date.html in it.

SetupDate is a special component. We want to link to it from within our PetInformation component, meaning we'll be using a _special_ way to pass down our selectedPet property to it.
```
<Link> can be used once you have added the react-router-dom library. It allows you to create links in your application (go figure...). These links can go to external content as well as internal. In this particular case, we want it
to link to another component. On top of that, we want to pass down state. We want our selectedPet to be known by the component we go to next. So PetInformation needs to share the selectedPet property with SetupDate. We can achieve this as follows:

  <Link to="/route-to-your-component" state={{ selectedPet: { propertyToPassDown } }}>
    .......
  </Link>
```
That's all there is to it. Once we've done this, the **Link** tag will bring us to the route where **SetupDate** is loaded (check your routes in **App.jsx** to see how we configured this). We do need to configure a few things in
our SetupDate component to work with the property we pass on.
```
  const location = useLocation();
  const { selectedPet } = location.state.selectedPet;
```

This is the part where the magic happens. We first define a **location constant** which is populated with the response of our **useLocation** hook. This is a hook that's present in react-router-dom, and it basically returns the
object that represents the current URL. You can think about it like a useState that returns a new location whenever the URL changes. Once we have that, we can create a const **selectedPet** which we populate with our **location.state.selectedPet**.
* Implement this and adjust all places in the HTML where we need to display certain selectedPet properties, make sure they all appear correctly.

Our component is almost ready. We just need to provide functionality to the two buttons in it. The cancel button needs to redirect us back to the profile gallery. The Let's Play button should also redirect us to the profile gallery, but it should
increase the selectedPet's popularity property by 1 as well.
* Implement the functionalities for both buttons. Use <Link> to make the cancel button work, write a **onSubmitLetsPlay** function for the other button. 
* Take a look at the backend to see how we can increment the popularity and implement it accordingly in our frontend app. If your play button isn't working as intended, take a look at how you implemented this. What functions are available for an event? How can we prevent certain default behaviour? Internet has lots of answers for this issue, it's very common when using forms in ReactJS.
How will you guide your app back to its starting page after increasing the popularity? Look at the **useNavigate** hook (also a react-router-dom feature) and implement this as a promise in your function. More info about this hook can be found at [https://reactrouter.com/docs/en/v6/api#usenavigate](https://reactrouter.com/docs/en/v6/api#usenavigate).

## Conclusion
You've learned:
- Passing state on when using a Link to navigate through the page.
- The useLocation() hook and how to use it.
- How to prevent default behaviour by a form, which can cause real headaches in ReactJS.
- How to use the useNavigate() hook.
