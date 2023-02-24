# BDD

In this Codelab we'll see how create simple BDD test using Cucumber

## Creating an application

Before we can start writing our tests, we first need an application to test.

Create a spring boot application:

- With an endpoint that allows you to store users.
  - A user has a first name and a second name.
  - We're not going to use a database so store the users in memory (using an ArrayList or HashMap)
- With an endpoint to fetch all users.


Test your application manually, see if you can add a user and retrieve it using Postman


## Creating a cucumber test setup
To create a cucumber test we'll need the following dependencies:

   ```xml
   <dependency>
          <groupId>io.cucumber</groupId>
          <artifactId>cucumber-java</artifactId>
          <version>${cucumber.version}</version>
          <scope>test</scope>
      </dependency>
      <dependency>
          <groupId>io.cucumber</groupId>
          <artifactId>cucumber-spring</artifactId>
          <version>${cucumber.version}</version>
          <scope>test</scope>
      </dependency>
      <dependency>
          <groupId>io.cucumber</groupId>
          <artifactId>cucumber-junit</artifactId>
          <version>${cucumber.version}</version>
          <scope>test</scope>
      </dependency>
      <dependency>
          <groupId>io.cucumber</groupId>
          <artifactId>cucumber-junit-platform-engine</artifactId>
          <version>${cucumber.version}</version>
          <scope>test</scope>
      </dependency>
```
Add them to your project

---

Next we'll need the Cucumber configuration:
- (Don't forget to never use default packages)

- Create a CucumberSpringConfiguration in your **test folder**
```java
@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CucumberSpringConfiguration {
}
```

- Create a CucumberIntegrationTest in your **test folder**
```java
@Cucumber
public class CucumberIntegrationTest {
}
```
---
Run the integration test:
- If everything went well you'll get the following warning: 
  - `WARNING: No features found in package '<package of your integration test>'`

How do we solve this? By adding features!.

## Creating a Cucumber test
Cucumber tests are called features. Each feature has its own .feature file.

The content has the following structure (called gherkin format)
```gherkin
Feature: Name of the feature
  (optional) Description of the feature

  Scenario: Name of the scenario
  (optional) Description of the scenario
    Given The given of the scenario
    And another given
    When The action of the scenario
    Then The condition to test

  Scenario: Another scenerio
  ...
```

Create a `user-management.feature` file in your **test resources**.
Put the feature file in the same package as your integration test.

---

Put the following content in the file:
```gherkin
Feature: Being able to manage users

  Scenario: I can retrieve a list of users from the system
    Given hello world
```
---
Let's run our integration test again and see what happens.

If everything is configured correctly, you'll get the following error:
```
Step undefined
You can implement this step using the snippet(s) below:

@Given("hello world")
public void hello_world() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
```

There is one more piece missing, connecting the steps with our java code.

## Creating steps
Steps are the smallest part of our Cucumber tests.
They either start with Given, When or Then.
Every step is going to execute some java code. To make the connection we create Steps classes.

Let's create a Steps class.
In your **test folder** create a steps package. There, create a `UserSteps` class.
Every step that has something to do with Users will be placed here.

Let's add the suggested code to our UserSteps class:
```java
@Given("hello world")
public void helloWorld() {
  System.out.prinln("Hello World!")
}
```

Run the integration test again. This time everything should work.

Great work!

## Doing something meaningful
Unfortunately we're not really testing anything just printing out hello world.
Let's make our step does something.

Create a `UserClient` class in your **test folder**.
In your UserClient add the following code:
```java
    private RestTemplate restTemplate = new RestTemplate();

    public void addUser(User user) {
        restTemplate.postForObject("<url-to-your-resource>", user, Void.class);
    }
```
Add an @Component to your UserClient, so you can use it in your UserSteps.
To use the client in your UserSteps just use constructor injection like you would do in any other Spring Component
- Don't add @Component on your UserSteps. Cucumber will detect your Steps class because you've use @Given.

A client makes it easy to call the different endpoints of your application.
When making BDD test you should create a Client for each Controller.

---
Now use the UserClient in your UserSteps.
Replace 
```java
 System.out.prinln("Hello world!");
```
with
```java
 userClient.addUser(new User("first name", "last name"));
```
---
Finally, change the text in your feature file and @Given annotation to `a user in the system`

Run your integration test again. You should not see any changes.
However instead of printing out hello world, the test will have created a User in the system.

### Asserting the result

Of course, the point of making a test is doing an assertion.
Let's get the list of all users and check if our given user is in the list.
---
First the **when** part.

Add the following line to your scenario in your .feature file:
```gherkin
When getting a list of users
```

Now implement the step in your UserSteps class by:
- creating a new method in the UserSteps class
- implementing a method on UserClient that will get all the Users from the system using the RestTemplate
- letting our new method call the new UserClient method and save the result (all the users) in an instance field.
- adding @When to our new method

If you run the integration test now. You'll:
- have created a user in the system
- fetched all the users
- saved all the users in a field in your UserSteps class

Next to assert that the list contains the right user.

---
We'll add the **then** step.

In this step we make an assertion (is the user we created in the list of returned users?).

Add the following line to your scenario in your .feature file:
```gherkin
Then the user will be in the list
```

Implement the step in your UserSteps by:
- creating a new method in the UserSteps class
- making an assertion in the new method (using assertj) asserting that our returned list (saved in the instance field) contains our newly created user.
- adding @Then to our new method

Run your integration test again. 
If it succeeds you were successful in creating your first meaningful BDD test.

To make yourself 100% sure that it works, it is always a good idea to make a tiny mistake in your assertion and see if that makes your test fail.

## Make your steps flexible
A nice feature of Cucumber is that your steps can use variables.
This increases the reuse of your steps enormously.

By now your scenario should look something like this:
```gherkin
Feature: Being able to manage users

  Scenario: I can retrieve a list of users from the system
    Given a user in the system
    When getting a list of users
    Then the user will be in the list
```
Read: https://cucumber.io/docs/cucumber/step-definitions/

Use this information to change your scenario to:
```gherkin
Feature: Being able to manage users

  Scenario: I can retrieve a list of users from the system
    Given a user named "Bob" "Dylan" in the system
    When getting a list of users
    Then "Bob" "Dylan" will be in the list
```

Run your test again and see if it works. Can you make your test fail by changing the values of the variables?

That's it. You now understand the basics of cucumber tests!


## Extra
Can you make a new scenario that will allow you, given that there are multiple users, to test multiple users at once?
Hint: use DataTables
