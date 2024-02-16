import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cine cine = new Cine("Cine XYZ", 100);

        Pelicula pelicula1 = new Pelicula("Avengers", 120);
        Sala sala1 = new Sala(1, pelicula1, 5, 5);
        cine.agregarSala(sala1);

        Pelicula pelicula2 = new Pelicula("Minions", 90);
        Sala sala2 = new Sala(2, pelicula2, 6, 6);
        cine.agregarSala(sala2);

        int opcion;
        do {
            System.out.println("1. Ver salas y películas");
            System.out.println("2. Reservar Asiento");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cine.verSalas();
                    break;
                case 2:
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
                    System.out.println("Hasta Luego");
                    break;


                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

    }
}