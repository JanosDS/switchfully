package com.switchfully.flyway.car;

import com.switchfully.flyway.car.dto.CarDTO;
import com.switchfully.flyway.car.dto.CreateCarDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarMapper {

    public List<CarDTO> toDto(List<Car> carList) {
        return carList.stream().map(t -> toDto(t)).collect(Collectors.toList());
    }

    public CarDTO toDto(Car car) {
        return new CarDTO(car.getId(), car.getType(), car.getColor(), car.getPrice());
    }

    public Car toCar(CreateCarDTO createCarDTO) {
        return new Car(createCarDTO.getType(), createCarDTO.getColor(), createCarDTO.getPrice());
    }
}
