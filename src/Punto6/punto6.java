package Punto6;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;

public class punto6 {
    public static void main(String[] args) {
        BiFunction<Integer, LocalDate, Boolean> calculateAge = (age, birthdate) -> {
            return Period.between(birthdate, LocalDate.now()).getYears() == age;

        };

        TriFunction<String, Integer, LocalDate, String> validateAge = (name, age, birthdate) -> {
            return calculateAge.apply(age, birthdate) ?
                    "La fecha de nacimiento de " + name + " corresponde corresponde a la edad ingresada" :
                    "La fecha de nacimiento de " + name + " no corresponde corresponde a la edad ingresada";
        };

        System.out.println(validateAge.apply("Alejandro", 25, LocalDate.of(1999, 5, 12)));
        System.out.println(validateAge.apply("Jose", 25, LocalDate.of(1963, 5, 12)));
    }

    @FunctionalInterface
    interface TriFunction<T,U,V,R> {
        R apply(T t, U u, V v);
    }
}
