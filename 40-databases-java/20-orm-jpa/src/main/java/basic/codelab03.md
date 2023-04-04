# Mapping

In this codelab we'll be extending the `SwitchToTheSun` exercise with extra data, thus allowing us for more relationships.

- Look at the slides for links to additional resources **(!!)**

## Exercises

### Embeddable
1. Extend the `COUNTRY` table with the following columns:
    1. population
    1. land area
    1. GDP
1. Create a new class `GeographicalInformation` (which encapsulates population, land area and gdp) 
and make it an embeddable of `Country`
    1. `GeographicalInformation` is a nice example of a Value Object, so give it the characteristics of a Value Object (see slides) 
1. Create a new endpoint: Whenever you surf to `/geographical-informations?country=<country>`, you'll get the geographical information of `<country>`
    1. As always think of the edge cases.
 
### OneToOne
1. Create a new table `ATTRACTION_OVERVIEW` with columns:
    1. Score `An overal score of the attraction between 0 and 100`
    1. Description
    1. Price
    1. Visitors per year
1. Create a one-to-one relationship between attraction and attraction overview.
    1. Create a link between the tables in the database
    1. Create an entity `AttractionOverview`
    1. Link the entities `AttractionOverview` and `Attraction` together
1. Create a new endpoint: Whenever you surf to `/attraction-overview?attraction=<attractionName>`, you'll get the extra information of `<attraction>`.
    1. As always think of the edge cases
1. Think about the differences between an embeddable and a oneToOne relationship.
    1. What are the benefits?
    1. Why would you use one over the other?
  
### ManyToOne vs OneToMany
1. Let's add continents to our model (the table `CONTINENT` already exists).
    1. Start by adding a continent field to `Country`. Look at how `Attraction` added a country field.
    1. Make sure that every time you print out a country, you'll print out the continent name as well.
        1. e.g. `France - Europe`
1. Add a new endpoint that will return the list of countries in a given continent`/countries?continent=<continent>`.
    1. Do this by adding a field of type `List<Country>` to `Continent`
    1. Look at the `@OneToMany` annotation to help you.
1. Right now we have a bidirectional relationship. Most of the time this is not preferable. Try making the relationship unidirectional.
    1. Make the continent field in `Country` a `Transient` field.
    1. Adapt the OneToMany annotation so that it keeps working
    1. Test the getAllCountries endpoint. It should return the countries with null as continent name (because the continent was made transient)

### ManyToMany
1. Now we're going add tourists to our application (the table `TOURIST` already exists). 
A tourist can visit multiple attractions and attractions will be visited by multiple tourists.
We'll be adding two new endpoints `/tourists?attraction=<attraction>` and `/attractions?tourist=<tourist>`   
    1. Start by creating a tourist entity
    1. Then add a `List<Tourist>` field to `Attraction` and provide the mapping annotations. You can make changes to the database schema.
    1. Now try to a add a `List<Attraction>` to `Tourist`. What are the problems you face? What can you do to fix it? You can make changes to the database schema.
    1. Implement both functionalities
    1. Populate the database with some dummy data.
1. Yet again we have a bidirectional relationship. This can become confusing if we start adding more constraints, 
     e.g. a tourist can only visit attractions in the same country and every attraction has a max amount of visitors?

####Extra
1. Write a functionality that will create an attraction. It should be possible to create an attraction in a country that doesn't exist.
   1. In case the country already exists: How can you connect the attraction to the right country?
   2. In case the country doesn't exist yet: How can you both create the attraction and the country in the same call? (see cascade for help)
2. Write a functionality that will delete a country.
   1. Deleting a country means also deleting all it's attractions.
      1. How can you both delete a country as its attractions in the same call? Look at orphan removal for help
3. Create a subclass of `Tourist` named `CulturedTourist`. This tourist can only visit monuments and cities.
   1. Lookup `Discriminator` to see how you can save such a tourist in the database.
