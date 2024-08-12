package Punto5;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class punto5 {
    public static void main(String[] args) {
        BinaryOperator<BigDecimal> divide = (dividend, divisor) -> {
            if(divisor.compareTo(BigDecimal.ZERO) == 0){
                System.out.println("Zero division not allowed");
                throw new ArithmeticException("Zero division not allowed");
            }

            return dividend.divide(divisor);
        };

        BigDecimal dividend = new BigDecimal(256);
        BigDecimal divisor = new BigDecimal(4);
        BigDecimal result = divide.apply(dividend, divisor);
        System.out.println("Division result: " + result);
    }
}
