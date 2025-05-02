package Modelo;

import Interfaces.Movilizable;
import Interfaces.Curable;

public class Asesino extends PersonajeFisico implements Movilizable, Curable {
    private int sigilo, critico;

    public Asesino(String nombre, int nivel, int salud, int sigilo, int critico) {
        super(nombre, nivel, salud);
        this.sigilo = sigilo;
        this.critico = critico;
    }

    public void atacarPorLaEspalda() {
        int daño = critico * 2;
        System.out.println(nombre + " ataca por la espalda con un golpe crítico causando " + daño + " de daño.");
    }

    public void ocultar() {
        System.out.println(nombre + " se oculta en las sombras con sigilo " + sigilo);
    }

    public void moverse() {
        System.out.println(nombre + " se desplaza silenciosamente.");
    }

    @Override
    public void curar() {
    int cantidadCurada = 15;
    salud += cantidadCurada;
    System.out.println(nombre + " usa hierbas para curarse. Salud ahora es " + salud);
}

    @Override
    public void atacar() {
        atacarPorLaEspalda();
    }
}