import java.util.Scanner;

/**
 * Aqui se ejecuta todo
 */
public class Main {

    /**
     * El método principal del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        // Crea un objeto Cine con el nombre "Cine XYZ" y una capacidad de 100 personas.
        Cine cine = new Cine("Cine XYZ", 100);

        // Crea dos objetos Pelicula: "Avengers" con una duración de 120 minutos y "Minions" con una duración de 90 minutos.
        Pelicula pelicula1 = new Pelicula("Avengers", 120);
        Sala sala1 = new Sala(1, pelicula1, 5, 5);
        cine.agregarSala(sala1);

        Pelicula pelicula2 = new Pelicula("Minions", 90);
        Sala sala2 = new Sala(2, pelicula2, 6, 6);
        cine.agregarSala(sala2);

        // Presenta un menú al usuario con las siguientes opciones:

        int opcion;
        do {
            System.out.println("1. Ver salas y películas");
            System.out.println("2. Reservar Asiento");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Muestra la información de las salas y las películas que se proyectan en cada una.
                    cine.verSalas();
                    break;
                case 2:
                    // Solicita al usuario el número de la sala y reserva un asiento en esa sala.
                    System.out.print("Ingrese el número de sala: ");
                    int numSala = scanner.nextInt();

                    Sala salaSeleccionada = null;
                    for (Sala sala : cine.getSalas()) {
                        if (sala.getNumero() == numSala) {
                            salaSeleccionada = sala;
                            break;
                        }
                    }

                    if (salaSeleccionada != null) {
                        salaSeleccionada.reservarAsiento();
                    } else {
                        System.out.println("Sala no encontrada.");
                    }
                    break;
                case 3:
                    // Sale del programa.
                    System.out.println("Hasta Luego");
                    break;


                default:
                    // Muestra un mensaje de error si la opción no es válida.
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

    }
}
