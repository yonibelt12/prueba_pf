package Punto1;

import Punto1.InmutableCar;
import Punto1.MutableCar;

import java.util.ArrayList;
import java.util.List;

public class punto1 {
    static void alterCar(MutableCar car) {
        car.setModel("Aventador");
        car.setMileage(0);
    }
    static void alterCarMileageAndOwners(InmutableCar car) {
        List<String> owners = car.getOwners();
        Integer mileage = car.getMileage();
        owners.add("Pablo");
        owners.add("Pedro");
        mileage = 0;
    }

    public static void main(String[] args) {

        //Mutable Object

        MutableCar jetta = new MutableCar();
        jetta.setBrand("Volkswagen");
        jetta.setModel("jetta");
        jetta.setMileage(6000);

        System.out.println("INITIAL MUTABLE CAR DATA");
        System.out.println("Car brand: " + jetta.getBrand() + " Car model: " + jetta.getModel() + " Car mileage: " + jetta.getMileage());

        alterCar(jetta);
        System.out.println("MODIFIED MUTABLE CAR DATA");
        System.out.println("Car brand: " + jetta.getBrand() + " Car model: " + jetta.getModel() + " Car mileage: " + jetta.getMileage());


        //Inmutable Object

        System.out.println("/////////////////////////////////");

        List<String> owners = new ArrayList<>();
        owners.add("Jonathan");
        owners.add("Alejandra");
        owners.add("Armando");
        InmutableCar corolla = new InmutableCar("Toyota", "Corolla", 6000, owners);

        System.out.println("INITIAL INMUTABLE CAR DATA");
        System.out.println("Car brand: " + corolla.getBrand() + " Car model: " + corolla.getModel() + " Car mileage: " + corolla.getMileage());
        System.out.println("Car owners: " + corolla.getBrand());

        alterCarMileageAndOwners(corolla);

        System.out.println("MODIFIED INMUTABLE CAR DATA");
        System.out.println("Car brand: " + corolla.getBrand() + " Car model: " + corolla.getModel() + " Car mileage: " + corolla.getMileage());
        System.out.println("Car owners: " + corolla.getBrand());
    }
}

