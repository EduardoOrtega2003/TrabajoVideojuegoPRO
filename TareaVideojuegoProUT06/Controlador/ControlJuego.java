package Controlador;

import Modelo.Personaje;
import java.util.*;

public class ControlJuego {
    private List<Personaje> personajes;

    public ControlJuego() {
        personajes = new ArrayList<>();
    }

    public void agregarPersonaje(Personaje p) {
        personajes.add(p);
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public Personaje getPersonaje(int index) {
        return personajes.get(index);
    }
}