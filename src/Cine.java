import java.util.Random;
import java.util.Scanner;

/**
 * Esta clase representa un cine con sus características y funcionalidades.
 */
public class Cine {

    /**
     * El nombre del cine.
     */
    private String nombre;

    /**
     * El aforo máximo del cine.
     */
    private int aforo;

    /**
     * Un array de objetos de la clase Sala que representan las salas del cine.
     */
    private Sala[] salas;

    /**
     * Constructor de la clase Cine.
     *
     * @param nombre El nombre del cine.
     * @param aforo El aforo del cine.
     */
    public Cine(String nombre, int aforo) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.salas = new Sala[0];
    }

    /**
     * Obtiene el nombre del cine.
     *
     * @return El nombre del cine.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el aforo del cine.
     *
     * @return El aforo del cine.
     */
    public int getAforo() {
        return aforo;
    }

    /**
     * Obtiene un array con las salas del cine.
     *
     * @return Un array con las salas del cine.
     */
    public Sala[] getSalas() {
        return salas;
    }

    /**
     * Agrega una nueva sala al cine.
     *
     * @param sala La sala que se desea agregar.
     */
    public void agregarSala(Sala sala) {
        Sala[] nuevasSalas = new Sala[salas.length + 1];
        System.arraycopy(salas, 0, nuevasSalas, 0, salas.length);
        nuevasSalas[salas.length] = sala;
        salas = nuevasSalas;
    }

    /**
     * Muestra información sobre las salas del cine.
     */
    public void verSalas() {
        for (Sala sala : salas) {
            System.out.println("Sala " + sala.getNumero() + ": " +
                    sala.getPelicula().getTitulo() + " - " +
                    sala.getPelicula().getDuracion() + " minutos");
        }
    }

}