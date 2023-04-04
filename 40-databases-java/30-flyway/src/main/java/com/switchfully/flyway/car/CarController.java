package com.switchfully.flyway.car;

import com.switchfully.flyway.car.dto.CarDTO;
import com.switchfully.flyway.car.dto.CreateCarDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<CarDTO> getAllCars() {
        return carService.getAllCars();
    }

    @PostMapping(consumes = "application/json")
    public void saveCar(@RequestBody CreateCarDTO createCarDTO) {
        carService.createCar(createCarDTO);
    }
}
