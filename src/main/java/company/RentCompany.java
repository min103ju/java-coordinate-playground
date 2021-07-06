package company;

import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {
    private final List<Car> carList = new ArrayList<>();

    public void addCar(Car car) {
        this.carList.add(car);
    }

    public String generateReport() {
        return this.carList.stream()
                .map(car -> car.getName() + " : " + car.getChargeQuantity() + "리터")
                .collect(Collectors.joining("\n"));
    }
}
