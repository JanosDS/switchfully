# Reporting functionality
1. A nephew of `SwitchToTheSun` already started initialising a database.
   Unfortunately he couldn't finish because he just received a ps5 for his birthday.
   Now `SwitchToTheSun` isn't sure what is in the database and what isn't.
   To make more clear what is in the database they want you to create some REST-endpoints.
    1. `AttractionRepository` needs to return a list of all the attractions in the `attraction` table.
        1. Complete the implementation so that the repository returns a list of all the attractions
        1. Check that it works by starting your server and surfing to `http://localhost:8080/attractions`
    2. `SwitchToTheSun` also wants you to show a list of all the countries in their database.
        1. Create a new `CountryRepository` and `Country` class.
        2. Read out the `Country` table and show a list of all available countries
        3. Implement the `CountryController` so that it returns a list of Countries when navigating to `http://localhost:8080/countries`.
2. The manager of `SwitchToTheSun` also stores some application information in the database. He would like to be able to update this information.
   1. Implement the PUT method in the `ApplicationInfoController`. This should update the application info with the provided information.
