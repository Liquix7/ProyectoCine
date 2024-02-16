import java.util.Random;
import java.util.Scanner;

public class Cine {
    private String nombre;
    private int aforo;
    private Sala[] salas;

    public String getNombre() {
        return nombre;
    }

    public int getAforo() {
        return aforo;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public Cine(String nombre, int aforo) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.salas = new Sala[0];
    }

    public void agregarSala(Sala sala) {
        Sala[] nuevasSalas = new Sala[salas.length + 1];
        System.arraycopy(salas, 0, nuevasSalas, 0, salas.length);
        nuevasSalas[salas.length] = sala;
        salas = nuevasSalas;
    }

    public void verSalas() {
        for (Sala sala : salas) {
            System.out.println("Sala " + sala.getNumero() + ": " +
                    sala.getPelicula().getTitulo() + " - " +
                    sala.getPelicula().getDuracion() + " minutos");
        }
    }

}
