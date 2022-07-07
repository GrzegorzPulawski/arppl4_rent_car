package arppl4.arppl4_spring_rental.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity



public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String marka;
    private String model;
    private LocalDate productionDate;
    @Enumerated(EnumType.STRING)
    private CarBodyType bodyType;
    private Integer seats;
    @Enumerated(EnumType.STRING)
    private CarGearBox carGearBox;
    private Double engineCapacity;

    public Car(String marka, String model, LocalDate productionDate, CarBodyType bodyType, Integer seats, CarGearBox carGearBox, Double engineCapacity) {
        this.marka = marka;
        this.model = model;
        this.productionDate = productionDate;
        this.bodyType = bodyType;
        this.seats = seats;
        this.carGearBox = carGearBox;
        this.engineCapacity = engineCapacity;
    }
}
