## Resurrecting Petinder

Even though the compiler didn't warn us for anything and our app seems to boot up just fine, stuff goes horribly wrong when we try to make a call to our endpoint. This happens for a number of reasons. Let's take a look at what we (likely, some might have used dependency injection already) did in our ``PetService``.

```
public class PetService {
  private PetMapper petMapper = new PetMapper();
  private PetRepository petRepository = new PetRepository();

  public List<PetDTO> getAllPets() {
    return petMapper.toDTO(petRepository.getAllPets());
  }
}
```
We're going to tackle this in a different way when working with Spring Boot. Time for dependency injection!

### Dependency Injection

> Dependency Injection is a fundamental aspect of the Spring framework, through which the Spring container “injects” objects into other objects or “dependencies”. Simply put, this allows for loose coupling of components and moves the responsibility of managing components onto the container.

This is the official explanation about dependency injection that you can find at [Baeldung](https://www.baeldung.com/spring-dependency-injection#:~:text=Dependency%20Injection%20is%20a%20fundamental,managing%20components%20onto%20the%20container.). A more "simple" definition might be the following:

> An injection is the passing of a dependency (a service) to a dependent object (a client). Passing the service to the client, rather than allowing a client to build or find the service (constructor dependency injection instead of initializing the dependency in the client by using the new keyword), is the fundamental requirement of the pattern.

In the end, this just means that whenever a class is dependent on another class, we will use dependency injection to establish this dependency. 

> There are three ways to do this:
> * Constructor injection: In this type of injection, the injector supplies dependency through the client class constructor.
> * Setter Injection / Property Injection: In this type of injection, the injector method injects the dependency to the setter method exposed by the client.
> * Interface Injection: In this type of injection, the injector uses an Interface to provide dependency to the client class. The clients must implement an interface that will expose a setter method which accepts the dependency.

We will focus on dependency injection through the constructor. Let's rewrite our ``PetService`` class to use dependency injection.

* Instead of initializing a new instance of the classes PetService is dependent on inside the class itself, let's use dependency injection to achieve this. Ignore the compiler for now, it will complain but we will fix this soon.
* Do the same thing for any other classes that have dependencies.

### Beans

Once you inject these dependencies through the constructor, you'll notice the compiler starts complaining. It will tell you it can't find any bean of this type. That's because Spring Boot has no clue about these classes, they are not part of its ApplicationContext.

> One of the main features of the Spring framework is the IoC (Inversion of Control) container. The Spring IoC container is responsible for managing the objects of an application. It uses dependency injection to achieve inversion of control.
The interfaces BeanFactory and ApplicationContext represent the Spring IoC container. Here, BeanFactory is the root interface for accessing the Spring container. It provides basic functionalities for managing beans.
On the other hand, the ApplicationContext is a sub-interface of the BeanFactory. Therefore, it offers all the functionalities of BeanFactory.
Furthermore, it provides more enterprise-specific functionalities. The important features of ApplicationContext are resolving messages, supporting internationalization, publishing events, and application-layer specific contexts. This is why we use it as the default Spring container.

That's a lot of words and specific lingo. Let's try to simplify this a bit.

> Every class that you will be using through dependency injection, will be managed by Spring's ApplicationContext. We have to tell Spring which classes are going to be part of this. The result will be Spring allowing us to inject the classes we need to inject, as long as they are part of its ApplicationContext. It's basically us saying "Hey Spring, this PetMapper and PetRepository
> will be dependencies for certain services in my codebase. Manage them please, so I can use them whenever needed.".

Once a class is part of Spring's ApplicationContext, we refer to it as a ``bean``.

Now that you know this, it makes sense to tell you that the classes we are ``injecting`` should always be ``beans``. We can do this by annotating them. A basic annotation for this is ``@Component``. Annotating our ``PetMapper`` with it, will make it part of the ApplicationContext and
ready to be injected. Next to ``@Component``, there are Spring Stereotype Annotations as well. These are specialized annotations that provide specialized uses and meaning. These StereoType Annotations are ``@Service``, ``@Controller`` and ``@Repository``. You can probably guess the next step?

* Annotate all classes that need to be part of the ApplicationContext with their corresponding annotation. We already annotated our ``PetController`` with ``@RestController``.

> The difference between @Controller and @RestController is that the latter is specifically used for what we are doing, creating REST services. It is a combination of two annotations needed by our PetController class, @Controller and @ResponseBody. Our life is made easier by combining these two into one @RestController annotation.

After doing this, try running your app again. Is it working now?

What you learned in this codelab:
* What dependency injection is, what the different types are and how to use constructor injection
* What IoC is and how dependency injection is an implementation of this
* What the ApplicationContext is and what its responsibility is
* What Beans are and why some classes are Beans and others aren't
* The different annotations used to define classes as Beans
