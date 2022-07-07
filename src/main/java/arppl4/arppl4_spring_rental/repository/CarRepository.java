package arppl4.arppl4_spring_rental.repository;

import arppl4.arppl4_spring_rental.model.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface CarRepository {

    void save(Car car);

    List<Car> getAllCar();

    void deleteById(Long identyfikator);

    Optional<Car> findById(Long identifier);


    public interface ProductRepository extends JpaRepository<Car, Long> {

    }
}
