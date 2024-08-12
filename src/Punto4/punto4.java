package Punto4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class punto4 {

    public static void main(String[] args) {


        Supplier<List<Libro>> generator = () -> {
            List<Libro> lista = new ArrayList<>();

            lista.add(new Libro("Cronica de una muerte anunciada", "Gabriel García Márquez", 9));
            lista.add(new Libro("María", "Jorge Isaacs", 6));
            lista.add(new Libro("Cometas en el cielo", "Khaled Hosseini", 9));
            lista.add(new Libro("Un mundo feliz", "Aldous Huxley", 8));
            return  lista;
        };

        Consumer<List<Libro>> booksConsumer = libros -> {
            Predicate<Libro> isRecommended = libro -> libro.getPuntaje() >= 7;
            UnaryOperator<String> printText = libro -> {
                System.out.println("El libro " + libro + " es recomendado smile");
                return libro;
            };

            libros.forEach(libro -> {
                if (isRecommended.test(libro))
                    printText.apply(libro.getNombre());
            });

        };





        booksConsumer.accept(generator.get());
    }
}
