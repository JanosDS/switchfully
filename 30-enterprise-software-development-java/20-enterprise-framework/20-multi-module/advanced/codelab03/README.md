# Spring Boot Stock Exchange

We're going to transform our multi-module Maven stock exchange application to a Spring Boot application,
including:
- A functioning (REST) endpoint / entrypoint to our API
- Dependency Injection with Spring
- An executable JAR (also known as "fat JAR" or "JAR with dependencies")

The Stock Exchange Application is described in the README.md file of package `30-enterprise-software-development-java > 10-build-and-dependency-management > 40-maven > codelab05`
- If you already successfully finished codelab05, use your own code as your starting point
- If not (or, if you prefer our solution), use the provided solution of codelab05 as your starting point
    -  https://github.com/switchfully/maven-stock-exchange

## Requirements
1. Include the Spring boot starter parent pom in your own parent pom
    ```
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.7.4</version>
        <relativePath/>
    </parent>
    ```
2. Still in your own parent pom
    - The following dependencies should be automatically provided to ALL modules:
        ```
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        ```
        - This allows you to remove all junit, assertj and mockito dependencies
    - The following dependencies should be managed by parent pom and be available to the modules on-demand:
        ```
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>31.1-jre</version>
        </dependency>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.12.0</version>
        </dependency>
        ```
        - Additionally, all the modules on which another module has a dependency should also be defined in this section.
3. Module api should have a dependency on spring-boot-starter-web:
    ```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    ```
    - (don't specify a version, it will get this from its parent (or parent's parent))
4. All other modules should have a dependency on spring-boot-starter:
    ```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
    ```
    - (don't specify a version, it will get this from its parent (or parent's parent))
5. Both StockExchangeController (api) and StockService (service) should become managed beans by Spring's ApplicationContext.
    - Since StockExchangeController already performed Constructor Dependency Injection, we should be able to easily inject the stockService dependency
6. StockExchangeController should be expanded to become a REST endpoint (access point to our application)
    - Annotate the class itself with @RequestMapping("/stocks"")
        - Search for yourself what they do and mean.
    - Alter your getStock method:
        ```
        @GetMapping("/{stockId}")
            public StockDto getStock(@PathVariable String stockId) {
                // your code
            }
        ```
        - What does @GetMapping do?
        - What does @PathVariable do?
7. If you have a cli module, remove it
8. Create a new module, as artifactId, name it "jar"
    - Create a *SpringBootApplication* class named Application
    - What will this class do?
9. In (module) jar's pom, include the spring-boot-maven-plugin (for generating our .jar artifact):
    ```
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
    ```
    - This will take over the assembly-plugin configuration. You can remove it.
10. Run `mvn clean install`
    - It will run your tests
    - It will package your code (generate the jar)
    - And all the other things like compiling,...
11. You have multiple ways of running your application:
    - Inside the target folder of jar, run the `jar-1.0-SNAPSHOT.jar`
    - Run Application.java inside the IDE
    - Execute command `mvn spring-boot:run` from inside module (folder) jar
12. Surf to `http://localhost:8080/stocks/AA` where AA is an example of a stockId
    - Change AA into BB or something else
    

## Solution

A solution is provided on https://github.com/switchfully/spring-boot-stock-exchange
- Only check it out when you're completely finished.
- Don't if you're stuck. If you're stuck: ask questions!
