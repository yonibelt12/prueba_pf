package Punto9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class punto9 {
    public static void main(String[] args) {

        //Expected result: Ria
        printOptionalNames(getNamesByLenght(3));

        //Expected result: ''
        printOptionalNames(getNamesByLenght(1));

    }

    static Optional<List<String>> getOptionalNames(){
        List<String> names = Arrays.asList("Lowri", "Molly", "Ria", "Irene", "Hazel", "Yasmin", "Alexia", "Nicole", "Sienna", "India");

        return Optional.of(names);
    }

    static Optional<List<String>> getNamesByLenght(Integer length) {
        Optional<List<String>> originalNames = getOptionalNames();

        return originalNames.map(names -> names.stream().filter(name -> name.length() == length.intValue()).collect(Collectors.toList()));
    }

    static void printOptionalNames (Optional<List<String>> namesList) {
        namesList.ifPresent(names -> names.forEach(System.out::println));
    }
}
