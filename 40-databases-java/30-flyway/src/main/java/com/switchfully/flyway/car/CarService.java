package com.switchfully.flyway.car;

import com.switchfully.flyway.car.dto.CarDTO;
import com.switchfully.flyway.car.dto.CreateCarDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private CarRepository carRepository;
    private CarMapper carMapper;

    public CarService(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    public List<CarDTO> getAllCars() {
        return carMapper.toDto(carRepository.findAll());
    }

    public void createCar(CreateCarDTO createCarDTO) {
        carRepository.save(carMapper.toCar(createCarDTO));
    }
}
