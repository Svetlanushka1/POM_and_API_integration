package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString

public class AddCarDTO {
    String serialNumber;
    String manufacture;
    String model;
    int year;
    String fuel;
    int seats;
    String carClass;
    int pricePerDay;
    String about;
    String city;
}