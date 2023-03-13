## Expanding our Spring Boot app

Now that we have a basic app going, it's time to implement some more stuff, so we can actually do things with it! 

* Start off by creating a new Spring Boot application. The artifactId can be called Petinder. There's no need for any other dependency than spring-boot-starter-web for now.

So what are we going to create here? For now, we want you to make an application that returns the pets in our list whenever a call for this is made. We are going to do this by implementing a REST api. We'll guide you through this step-by-step. Do realize that REST services is coming up in a few days, so don't 
worry if some things are still unclear. The main purpose is showing how a Spring Boot implementation works.

Let's take some time to think about what this application will need:
- We need to be able to fill up a list with pets
- We want to have a API that we can make calls to (right now we only need one call and this call should return the pets present in our list to us)

Knowing this, we want a Pet class, DTO and Mapper since we're going to use an API, a repository, a service for our business logic and a controller where we will define the logic for our API. This codelab will focus on this controller.

### Making our controller

Our controller is the point where calls are being made to. If you ever need to debug an application that runs an API or simply want to see how the flow of the app works, the controller is often the preferred point to start your journey. We will take a deeper dive into APIs in a few days, but we will build a simple controller now and guide you through this.
We'll just repeat what we said before -> do NOT worry if things are unclear. This is uncharted territory.

> Our controller will enable our application to run an API. You will see that this API will expose certain endpoints that external applications can reach. Upon reaching any of these endpoints, the logic we implemented for it will be executed. This can be the returning of certain information we fetch from our database, a new item we want to save,... Want to see
> an API in action? There are several public APIs available on the internet. A famous one is the pokeapi, which basically is a working Pokedex. You can find it at [pokeapi](https://pokeapi.co). Take a look at it, experiment with it. Keep an eye out for the shape of the url you are making requests to. This is the entire address that is made up when you fill in values
> in the textbox on the screen (eg.: https://pokeapi.co/api/v2/pokemon/2, where pokemon/2 is something you provide yourself). Changing the value in the textbox will return different information. Check out the docs to see all available endpoints for this API.

This should give you a bit more of an idea how we want our API to work. Let's create a very basic one that, for now, only will return a String "Hello Pets".

* Create a class called PetController. We will have to annotate this class to determine the path where this api will operate. We do this by using the ``@RequestMapping`` annotation. It looks like this:
```
  @RequestMapping(value = "pets")
  public class PetController {}
```
The value next to our annotation is the exact address where this api will run. In our case, it will be ``http://localhost:8080/pets``. Inside of our controller, we will implement different methods for specific behavior that can be reached through this API. These methods can have paths as well. These paths will extend from the base path we just configured. Say we have a method A
that gets annotated with ``path="name"``, the exact url for reaching this method through our API will be ``http://localhost:8080/pets/name``. The path configured at the top is our base path for this API. Paths configured above methods are deeper levels from this base path.

> Let's take another look at the pokeapi. Can you figure out how that controller would be built? What is the base path and can you find paths that might be configured on a method-level?

Let's create our method that will return Hello Pets.

* Create a method called ``helloPets()``. This method needs to return a String "Hello Pets!".
* We need to annotate this method with the right mapping strategy. 

> At class-level, we used ``RequestMapping``. When working with the methods within our controller, we need to provide the "strategy" this method will utilize. Strategy sounds heavy, but it just means making explicit what kind of request this method will make.
> There are five possible kinds of requests:
> GET (get information from the backend)
> POST (post information to the backend, for example creating a user in a webapp. This is used to create an entire new entry)
> PUT (post information to the backend, but if an entry already exists, it will replace this specific entry. If it doesn't exist, a new entry will be made)
> DELETE (delete information from the backend)
> PATCH (change data in a specific entry that already exists in the backend)
> 
> Providing this strategy can be done in two ways. The old way is done by using @RequestMapping(path = "your-chosen-path", method = RequestMethod.GET). This is obviously for a GET operation, you can replace GET with the strategy needed for that method.
> A more modern way is using Spring's convenience annotations: @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @PatchMapping. No need to provide a method if you're doing it this way. A path still has to be configured (if you need one).

* Annotate the ``helloPets()`` method with the right mapping annotation. Make sure the endpoint for this method is ``http://localhost:8080/pets/hello``.

### Done?

If we're purely looking at our logic, we might think we're done at this point. And in fact, we are almost done. If you fire up your app, you'll notice it's possible to do so. However, if you navigate to [http://localhost:8080/pets/hello](http://localhost:8080/pets/hello), you'll see Spring Boot's error page.
This happens because ``PetController`` doesn't belong to our ``ApplicationContext`` yet. We'll tell you more about this soon. For now, you can just add an extra annotation to our ``PetController``. 
* At class-level, type ``@RestController``.
* Reboot your app and try going to [http://localhost:8080/pets/hello](http://localhost:8080/pets/hello) again. Hello Pets! should appear on your screen!


In this codelab, you learned:
* What an API is and how it works
* What the purpose of a controller is
* How we can configure our API and its endpoints
* What the possible HTTP request methods are and how we configure our methods to utilize such a request method

