package Controlador;

public class Pelicula {
    private String titulo;
    private String director;
    private int duracion; // en minutos
    private int anio;

    public Pelicula(String titulo, String director, int duracion, int anio) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return titulo + " (" + anio + "), Dir: " + director + ", Duración: " + duracion + " min";
    }
}
