package arppl4.arppl4_spring_rental.controller;

import arppl4.arppl4_spring_rental.model.Car;
import arppl4.arppl4_spring_rental.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void addCar(@RequestBody Car car) {
        log.info("Wywołano metode  dodanie Car:" + car);
        carService.addCar(car);

    }

}
