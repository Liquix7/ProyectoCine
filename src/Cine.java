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
}
