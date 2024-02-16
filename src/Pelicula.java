/**
 * Esta clase representa una película con sus características.
 */
public class Pelicula {

    /**
     * El título de la película.
     */
    private String titulo;

    /**
     * La duración de la película en minutos.
     */
    private int duracion;

    /**
     * Constructor de la clase Pelicula.
     *
     * @param titulo El título de la película.
     * @param duracion La duración de la película en minutos.
     */
    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    /**
     * Obtiene el título de la película.
     *
     * @return El título de la película.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene la duración de la película.
     *
     * @return La duración de la película en minutos.
     */
    public int getDuracion() {
        return duracion;
    }

}