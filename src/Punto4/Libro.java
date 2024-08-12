package Punto4;

public class Libro {
    private String nombre;
    private String autor;
    private Integer puntaje;

    public Libro(String nombre, String autor, Integer puntaje) {
        this.nombre = nombre;
        this.autor = autor;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getPuntaje() {
        return puntaje;
    }
}
