# Codelab01


This codelab will show you how you can use flyway to organise your database scripts.
We've created a simple application but the database schema is missing. 
It's up to you to provide it with flyway.

## Installing flyway

Installing flyway on Spring Boot is fairly easy.
First add the following dependency to the project.

```xml
<dependency>
    <groupId>org.flywaydb</groupId>
    <artifactId>flyway-core</artifactId>
</dependency>
```

Afterwards create the flyway script directory resulting in `src/main/resources/db/migration`.

That's it. Easy, wasn't it?

P.S. do know that flyway will use the connection configured in your `application.properties` to make the correct database changes.
If this user isn't allowed to make database changes (for security reasons), you'll need to provide a 2nd connection, used only by flyway, that can make these changes.


## Our first story

The first story of this little application was to allow you to add cars to the database.
The java code is already written, but the database table isn't.

Create a new file in `db/migration` called `V1__story_1_create_table_car.sql`.
The separate parts of this file mean:
- `V1`: the version your database will be in after this script is executed. This needs to be unique
- `story_1`: a reference to the story. Necessary for when your colleagues want to know why that script is there.
- `create_table_car`: a short description on what the script does.

Inside `V1__story_1_create_table_car.sql` add the code that will create the correct Car table.
- Hint: Look at the car class which columns are needed and what their types are.
- Hint: You can always create your table with the help of the intellij wizard. Just don't execute the script but just copy it in this file.
Also, inside `V1__story_1_create_table_car.sql` create a sequence for the car table called `car_seq`.

After you're done, run the application.
Analyze your script: if everything was implemented well, you should so a mention of flyway in the logs and a line that says that version 1 was applied to your database.

Open Postman and send a post request to `/cars`. It should create a car in your database.


## The second story

The next feature is to get back a list of cars. Off course this isn't interesting if there isn't a list of cars in the database.

Create a `V2__story_2_populate_car_table.sql` script.
Inside write 3 insert statements for the car table. 
- use `nextval('car_seq')` to generate the ids.

Afterwards, restart your application. Check the logs to make sure that the 2nd version was applied.
Send a get request to `/cars` and see if your newly created cars are returned.

Restart your application and check `/cars` again. Flyway shouldn't have applied your 2nd script again.
So the same number of cars should be returned.

Now, go to the `flyway_schema_history` table in your database client.
When you open the table, you'll see two records. One for each version that has been applied.
Delete the line from version 2 and rerun your application.

Check `/cars` again. Flyway should have reapplied your 2nd version and now 3 more cars should have been added to your database.

---

One last thing. Run the integration test. You'll see that every time you run the test, flyway will apply all scripts.


