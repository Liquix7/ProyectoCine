import java.util.Random;
import java.util.Scanner;

public class Sala {
    private int numero;
    private Pelicula pelicula;
    private String[][] butacas;

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

    public int getNumero() {
        return numero;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

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
