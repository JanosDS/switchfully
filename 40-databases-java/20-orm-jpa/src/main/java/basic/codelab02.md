#JPA Creating, Reading, Updating, Deleting (CRUD)

We continue with transforming `SwitchToTheSun` to JPA (Hibernate).

- Look at the slides for links to additional resources **(!!)**

## Exercises

### Create

1. We're going to focus now on the 'creating a country' functionality.
    1. Try inserting a new country in the database with `entitymanager.persist` in the `CountryRepository`
        1. You'll need to specify the id generation strategy, or you will get an error / incorrect id
            1. Try to fix this with the `@SequenceGenerator` and `@GeneratedValue` annotations.
            1. https://www.mkyong.com/jpa/jpa-insert-oracle-sequences-example/
            1. https://www.objectdb.com/java/jpa/entity/generated
            1. https://www.baeldung.com/hibernate-identifiers
        1. Secondly, in order to persist, the entityManager needs an active transaction (which it wants to commit)
            1. Try to fix the error with the `@Transactional` annotation.
            1. Be sure to use the spring `@Transactional` and not the javax one!
    2. The persisting, resulting in a stored Country entity with a correct id should succeed now.
    3. It's better to put `@Transaction` on a service and not on a controller or repository.
        1. Create a new `CountryService`
        2. Let the controller call the service and the service call the repository
        3. Move the `@Transactional` to the service.
        4. Test again to see if your refactoring didn't break anything.
    4. Make sure that all edge cases still work. If not: fix them!

### Read

1. Now we're going to replace all the jdbc queries with JPA queries. The remaining queries should be: '
   findAttractionsOfType', 'findAttractionsInCountry' and 'getAllCountries'
    1. Replace all three with JPA (using JPQL) queries. You'll need to lookup what the differences are.
        1. Are all queries prepared statements? (so, no raw data inputs but parameters)
    1. Normally you should have introduced a type field for findAttractionsOfType of type String.
        1. Make an enum name AttractionType with values `MONUMENT, BEACH, CITY`. Change the type of the field type into
           AttractionType.
        1. Look at the `@Enumerated` annotation for help
           lo

### Update

1. The only update statement that we have, is the application info so let's switch that one to JPA as well.
   To update an entity you need to first fetch the entity from the database and then change the fields of that entity.
    1. First make `ApplicationInfo` an entity.
    2. Change the method that fetches the ApplicationInfo from JDBC to JPA.
    3. Create an `ApplicationInfoService`.
        1. Let your controller talk to this service instead of talking directly to the repository.
        2. Implement the updateApplicationInfo method on the service by first fetching the ApplicationInfo and then
           updating the fetched entity.
    4. Like with creating entities you also need a transaction when updating entities.
        1. Add `@Transactional` to your service.
    5. Test it. It should work.
    6. Now try to move your `@Transactional` to your repository.
        1. Your update shouldn't work anymore. Why?
    7. Put `@Transactional` back on your service, to make your update work again.

#### Extra

1. Throw an exception in your `ApplicationInfoService` after you have updated the ApplicationInfo. Will the update be
   persisted?

### Delete

1. We only have one jdbcTemplate left! Go to the `CountryRepository` and change the delete method so that it uses JPA.
    1. You'll need to fetch the country that will be deleted first.
    1. Make sure that all edge cases still work
