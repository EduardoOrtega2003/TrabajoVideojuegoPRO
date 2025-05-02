package App;

import Controlador.*;
import Modelo.*;
import Vista.VistaJuego;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControlJuego juego = new ControlJuego();
        VistaJuego vista = new VistaJuego();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== BIENVENIDO A RIVENDOLL WORLD =====");
        System.out.println("¡Prepárate para el combate!");

        Guerrero thor = new Guerrero("Thor", 10, 150, 80, 50, 40);
        Mago merlin = new Mago("Merlín", 12, 100, 200, 90);
        Arquero legolas = new Arquero("Legolas", 11, 120, 85, 20,30);
        Hechicero morgana = new Hechicero("Morgana", 14, 110, 180, 95);
        Asesino ezio = new Asesino("Ezio", 13, 105, 70, 60);

        juego.agregarPersonaje(thor);
        juego.agregarPersonaje(merlin);
        juego.agregarPersonaje(legolas);
        juego.agregarPersonaje(morgana);
        juego.agregarPersonaje(ezio);

        int opcion;
        do {
            System.out.println("\n===== MENÚ DEL JUEGO =====");
            System.out.println("1. Mostrar personajes");
            System.out.println("2. Iniciar batalla");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    vista.mostrarAcciones(juego.getPersonajes());
                    break;
                case 2:
                    vista.seleccionarYBatallar(juego.getPersonajes());
                    break;
                case 3:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 3);
        
        scanner.close();
    }
}
