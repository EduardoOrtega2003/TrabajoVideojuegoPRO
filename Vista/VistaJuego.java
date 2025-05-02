package Vista;

import Modelo.*;
import Interfaces.*;
import java.util.*;

public class VistaJuego {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarAcciones(List<Personaje> personajes) {
        for (Personaje p : personajes) {
            System.out.println("\n" + p);
            p.atacar();

            if (p instanceof Defendible d) d.defender();
            if (p instanceof Curable c) c.curar();
            if (p instanceof Magico m) m.lanzarHechizo();
            if (p instanceof Volador v) v.volar();
            if (p instanceof Movilizable mv) mv.moverse();
        }
    }

    public void simularBatalla(Personaje p1, Personaje p2) {
        System.out.println("\n--- COMIENZA LA BATALLA ---");
        System.out.println(p1 + " VS " + p2);

        Random random = new Random();
        int ronda = 1;
        while (p1.estaVivo() && p2.estaVivo()) {
            System.out.println("\n--- Ronda " + ronda + " ---");

            int danio1 = random.nextInt(20) + 10;
            p1.atacar();
            p2.recibirDanio(danio1);

            if (!p2.estaVivo()) break;

            int danio2 = random.nextInt(20) + 10;
            p2.atacar();
            p1.recibirDanio(danio2);

            ronda++;
        }

        System.out.println("\n--- FIN DE LA BATALLA ---");
        System.out.println((p1.estaVivo() ? p1.getNombre() : p2.getNombre()) + " ha ganado la batalla.");
    }

    public void seleccionarYBatallar(List<Personaje> personajes) {
        System.out.println("\nSelecciona dos personajes para la batalla:");
    
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println(i + ": " + personajes.get(i));
        }
    
        int index1 = -1, index2 = -1;
    
        while (index1 < 0 || index1 >= personajes.size()) {
            System.out.print("\nIntroduce el número del primer personaje: ");
            if (scanner.hasNextInt()) {
                index1 = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, ingresa un número.");
                scanner.next(); 
            }
        }
    
        while (index2 < 0 || index2 >= personajes.size() || index2 == index1) {
            System.out.print("Introduce el número del segundo personaje: ");
            if (scanner.hasNextInt()) {
                index2 = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, ingresa un número.");
                scanner.next();
            }
        }
    
        simularBatalla(personajes.get(index1), personajes.get(index2));
    }
}