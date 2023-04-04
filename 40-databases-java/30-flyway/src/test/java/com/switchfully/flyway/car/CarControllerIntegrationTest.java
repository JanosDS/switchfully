package com.switchfully.flyway.car;

import com.switchfully.flyway.car.dto.CarDTO;
import com.switchfully.flyway.car.dto.CreateCarDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase
class CarControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    CarRepository carRepository;

    @Test
    void createCar() {
        given()
                .baseUri("http://localhost")
                .port(port)
                .when()
                .body(new CreateCarDTO("Volvo", "Blue", 40000.11))
                .contentType(JSON)
                .post("/cars")
                .then()
                .assertThat()
                .statusCode(HttpStatus.OK.value());

        Assertions.assertThat(carRepository.findByType("Volvo")).isNotNull();
    }

    @Test
    void getAllCars() {
        CarDTO[] result = given()
                .baseUri("http://localhost")
                .port(port)
                .when()
                .get("/cars")
                .then()
                .assertThat()
                .statusCode(HttpStatus.OK.value())
                .extract()
                .as(CarDTO[].class);

        Assertions.assertThat(result).hasSize(3);
    }
}
