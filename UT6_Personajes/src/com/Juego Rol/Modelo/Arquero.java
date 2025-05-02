package Modelo;

import Interfaces.Defendible;
import Interfaces.Movilizable;

public class Arquero extends PersonajeFisico implements Movilizable, Defendible {
    private int agilidad, numFlechas, arboles;

    public Arquero(String nombre, int nivel, int salud, int agilidad, int numFlechas, int arboles) {
        super(nombre, nivel, salud);
        this.agilidad = agilidad;
        this.numFlechas = numFlechas;
        this.arboles = arboles;
    }

    public void dispararFlecha() {
        if (numFlechas > 0) {
            System.out.println(nombre + " dispara una flecha con agilidad " + agilidad + ". Flechas restantes: " + (--numFlechas));
        } else {
            System.out.println(nombre + " no tiene flechas para disparar.");
        }
    }

    public void reabastecerFlechas() {
        numFlechas += 5;
        System.out.println(nombre + " reabastece flechas. Total: " + numFlechas);
    }

    public void moverse() {
        System.out.println(nombre + " se mueve ágilmente con velocidad de " + agilidad + ".");
    }

    public void defender(int dañoRecibido) {
        int dañoReducido = dañoRecibido - (arboles);
        if (dañoReducido < 0) dañoReducido = 0;
    
        salud -= dañoReducido;

        System.out.println(nombre + " bloquea el ataque! Daño recibido reducido a " + dañoReducido);
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se pone en posición defensiva con armadura " + arboles);
    }

    @Override
    public void atacar() {
        dispararFlecha();
    }
}