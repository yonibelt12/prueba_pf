package Punto1;

import java.util.LinkedList;
import java.util.List;

public final class InmutableCar {
    private final String brand;
    private final String model;
    private final Integer mileage;
    private final List<String> owners;

    public InmutableCar(String brand, String model, Integer mileage, List<String> owners ) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.owners = new LinkedList<>(owners);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getMileage() {
        return mileage;
    }

    public List<String> getOwners() {
        return new LinkedList<>(owners);
    }
}
