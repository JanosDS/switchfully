## Expanding our app

Up until now, we have only been implemented some placeholder logic to get acquainted with the controller and APIs. Time to add real functionality to this app!

Let's repeat what we started with in the previous codelab:

> So what are we going to create here? For now, we want you to make an application that returns the pets in our list whenever a call for this is made. We are going to do this by implementing a REST api. We'll guide you through this step-by-step. Do realize that REST services is coming up in a few days, so don't
 worry if some things are still unclear. The main purpose is showing how a Spring Boot implementation works.
 Let's take some time to think about what this application will need:
 > - We need to be able to fill up a list with pets
 > - We want to have a API that we can make calls to (right now we only need one call and this call should return the pets present in our list to us)  
> Knowing this, we want a Pet class, DTO and Mapper since we're going to use an API, a repository, a service for our business logic and a controller where we will define the logic for our API.

### Defining our model

Let's begin by defining what a Pet needs.

* Make a Pet class with the following properties:
  * id
  * name
  * kind (our app will only accept specific kinds of pets, for now it will be cats, dogs and chickens)
  * profileText

* Create a PetDTO and PetMapper class. The PetDTO can have the same properties as our Pet class. The PetMapper needs two toDTO methods. One that transforms a Pet to a PEtDTO and one that that transforms a List of Pets to a List of PetDTOs. To do this, you'll have to provide a List of Pets and return a List of PetDTOs.
  You can stream over the List of Pets and map each Pet to a PetDTO using the toDTO method. Afterwards, just collect it into a List. If you're stuck, the example below shows you how it's done. Just adapt it to your app.

```
  public List<ObjectDTO> toDTO(List<Object> objectList) {
        return objectList.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public objectDTO toDTO(Object object){
        return new ObjectDTO(object.getProperty1(), object.getProperty2(), ...);
    }
```

We are now able to create a Pet with the necessary properties. On top of that, we added a DTO and mapper for this, which enables us to use the DTO/Mappers design when responding calls made by our API. Unsure why this is used again? Ask us or take a look at the presentation given during the design patterns chapter.

### Making our repository

* Create a class called PetRepository. In this class, we will store the methods that will access our "database" and return the elements we want to see returned.
* For now, we only need one method. Create the ``getAllPets()`` method and make sure it returns a List of Pets. In the future, we will learn how to query our database and get our info that way, but for now we will hardcode this.

``List.of(new Pet 1, new Pet 2, ...)`` seems like a good way to quickly get a list going.

### Making our service

* Create a class called PetService. In here, we will store all the business logic our app needs. For now, we only need one method and that is the ``getAllPets()`` method. You might think this is strange since we just created a similar method in our repository. We're going to implement it in a different way here.
  Make sure this method returns a list of PetDTOs. To get this list, return the result of the right ``toDTO`` method in our ``PetMapper``. Make sure you pass on the list you just created in the ``PetRepository`` to this ``toDTO`` method.

### Adjusting our controller

Our controller only has one method for now. A placeholder method returning "Hello Pets!". Let's add another method!

* Add a method called ``getAllPets()``. This method will return a List of PetDTOs. Inside the method, we will return the result of the ``getAllPets()`` method in our PetService.
* Make sure to use the correct mapping annotation for this method. We want to make this call to get all our pets whenever we go to /pets, no path value is needed here. However, we do want to get this information in the JSON format, so between the parenthesis you can add ``produces = "application/json"``.

> produces = application/json is used to specify the type of data this call will produce. In our case, we will receive our List of PetDTOs in JSON format. This is important when the returned data is going to be used by another application which expects JSON. Java will convert our object to JSON for us.

* Fire up your app and try to go to the [http://localhost:8080/pets](http://localhost:8080/pets) endpoint. If all goes well, you'll see your beautiful Petinder backend explode. RIP billion-dollar idea :disappointed:.

No worries, we'll make your app rise from the dead in the next codelab!

In this codelab, you learned:
* Use DTO/Mapper as a pattern
* The basic structure of an application. Model, repository, service, controller and their responsibilities.
* Use produces = "application/json" to configure the way information is returned or handled when using your controller (there are more options than application/json, it's dependent on what the app making the request needs)
