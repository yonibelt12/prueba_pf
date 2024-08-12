package Punto2y3;

import java.util.function.Function;
import java.util.function.Predicate;

public class punto2y3 {

    public static void main(String[] args) {
        Function<InputPower, Double> power = new Function<InputPower, Double>() {
            @Override
            public Double apply(InputPower inputPower) {
                return Math.pow(inputPower.base, inputPower.exponent);
            }
        };

        InputPower input = new InputPower(2, 8);
        System.out.println("Power result: " + power.apply(input));

        Predicate<Double> isEven = x -> x % 2 == 0;

        System.out.println("Is even? : " + isEven.test(power.apply(input)));
    }
}
