import java.util.Random;
import java.util.Scanner;
/**
 * Esta clase representa las salas con sus características y funcionalidades.
 */
public class Sala {
    /**
     * El número de la sala.
     */
    private int numero;

    /**
     * La película que se proyecta en la sala.
     */
    private Pelicula pelicula;

    /**
     * Un array bidimensional de Strings que representa las butacas de la sala, donde "Ocupado" indica una butaca ocupada y "" una butaca libre.
     */
    private String[][] butacas;

    /**
     * Constructor de la clase Sala.
     *
     * @param numero El número de la sala.
     * @param pelicula La película que se proyecta en la sala.
     * @param filas El número de filas de butacas en la sala.
     * @param columnas El número de columnas de butacas en la sala.
     */
    public Sala(int numero, Pelicula pelicula, int filas, int columnas) {
        this.numero = numero;
        this.pelicula = pelicula;
        this.butacas = new String[filas][columnas];
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (random.nextBoolean()) {
                    // Asiento ocupado
                    butacas[i][j] = "Ocupado";
                } else {
                    // Asiento libre
                    butacas[i][j] = "";
                }
            }
        }
    }

    /**
     * Obtiene el número de la sala.
     *
     * @return El número de la sala.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Obtiene la película que se proyecta en la sala.
     *
     * @return La película que se proyecta en la sala.
     */
    public Pelicula getPelicula() {
        return pelicula;
    }


    /**
     * Muestra una representación gráfica de la matriz de butacas.
     */
    public void verMatriz() {
        for (String[] fila : butacas) {
            for (String asiento : fila) {
                if (asiento.isEmpty()) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[X]");
                }

            }
            System.out.println();
        }
    }


    /**
     * Permite Reservar asientos en la butaca deseada
     */
    public void reservarAsiento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Asientos disponibles:");
        verMatriz();

        System.out.print("Ingrese la fila del asiento: ");
        int fila = scanner.nextInt();
        int filas = fila - 1;

        System.out.print("Ingrese la columna del asiento: ");
        int columna = scanner.nextInt();
        int columnas = columna - 1;

        if (filas >= 0 && filas < butacas.length && columnas >= 0 && columnas < butacas[0].length) {
            if (butacas[filas][columnas].isEmpty()) {
                System.out.print("Ingrese su email para asociar con el asiento: ");
                String email = scanner.next();

                // Aquí puedes almacenar el email en algún lugar si es necesario
                // Por ahora, simplemente lo imprimiré en la consola
                System.out.println("Asiento reservado con éxito para " + email);

                // Asociar el email con el asiento ocupado
                butacas[filas][columnas] = email;
            } else {
                System.out.println("El asiento está ocupado. Seleccione otro asiento.");
            }
        } else {
            System.out.println("Asiento fuera de rango. Seleccione un asiento válido.");
        }
    }

}
