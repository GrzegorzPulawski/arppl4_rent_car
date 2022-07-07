package arppl4.arppl4_spring_rental.repository;

import arppl4.arppl4_spring_rental.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository {
    public interface ProductRepository extends JpaRepository<Car, Long> {
    }
}
