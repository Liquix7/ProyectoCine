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

    }
}