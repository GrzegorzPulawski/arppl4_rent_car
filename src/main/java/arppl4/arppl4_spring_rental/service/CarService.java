package arppl4.arppl4_spring_rental.service;

import arppl4.arppl4_spring_rental.model.Car;
import arppl4.arppl4_spring_rental.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
@Slf4j
@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public List<Car> getAllProduts() {
        return carRepository.findAll();
    }

    public void addProduct(Car car) {
        carRepository.save(car);
    }

    public void deleteById(Long identyfikator) {
        carRepository.deleteById(identyfikator);

    }

    public void updateProduct(Car daneAktualizujace) {
        Long identifier = daneAktualizujace.getId(); // identyfikator obiektu edytowanego

        Optional<Car> productOptional = carRepository.findById(identifier);
        if (productOptional.isPresent()) {
            Car editedProduct = productOptional.get();

            if (daneAktualizujace.getMarka() != null) {
                // zastąp name jeśli dane aktualizujące zawierają 'name'
                editedProduct.setMarka(daneAktualizujace.getMarka());
            }
            if (daneAktualizujace.getModel() != null) {
                // zastąp producent jeśli dane aktualizujące zawierają 'producent'
                editedProduct.setModel(daneAktualizujace.getModel());
            }
            if (daneAktualizujace.getProductionDate()!= null) {
                editedProduct.setProductionDate(daneAktualizujace.getProductionDate();
            }
            if (daneAktualizujace.getBodyType() != null) {
                editedProduct.setBodyType(daneAktualizujace.getBodyType());
            }
            if (daneAktualizujace.getSeats() != null) {
                editedProduct.setSeats(daneAktualizujace.getSeats());
            }
            if (daneAktualizujace.getCarGearBox() != null) {
                editedProduct.setCarGearBox(daneAktualizujace.getCarGearBox());
            }
            if (daneAktualizujace.getEngineCapacity() != null) {
                editedProduct.setEngineCapacity(daneAktualizujace.getEngineCapacity());
            }

            carRepository.save(editedProduct);
            log.info("Produkt został zapisany.");
            return;
        }
        throw new EntityNotFoundException("Nie znaleziono produktu o id: " + daneAktualizujace.getId());
    }

}
