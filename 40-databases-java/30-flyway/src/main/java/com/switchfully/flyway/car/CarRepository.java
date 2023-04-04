package com.switchfully.flyway.car;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, String> {

    Car findByType(String type);
}
