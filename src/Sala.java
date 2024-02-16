import java.util.Random;

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
}
