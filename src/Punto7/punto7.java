package Punto7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class punto7 {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();

        dates.add(LocalDate.of(1999, 5, 12));
        dates.add(LocalDate.of(1995, 7, 24));
        dates.add(LocalDate.of(1971, 1, 15));
        dates.add(LocalDate.of(2001, 9, 27));
        dates.add(LocalDate.of(2024, 3, 21));
        dates.add(LocalDate.of(2014, 11, 30));

        dates.forEach(punto7::printAge);
    }
    public static void printAge(LocalDate date){
        System.out.println("La fecha es " + date.getDayOfMonth() + " de " + date.getMonth()  + " del " + date.getYear() );
    }
}
