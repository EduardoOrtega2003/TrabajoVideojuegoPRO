package Modelo;

import Interfaces.Magico;
import Interfaces.Defendible;

public class Hechicero extends PersonajeMagico implements Magico, Defendible {
    private int mana, concentracion;

    public Hechicero(String nombre, int nivel, int salud, int mana, int concentracion) {
        super(nombre, nivel, salud);
        this.mana = mana;
        this.concentracion = concentracion;
    }

    public void invocarEntidad() {
        System.out.println(nombre + " invoca una entidad mágica con concentración " + concentracion);
    }

    @Override
    public void lanzarHechizo() {
        int costoMana = 10;

        if (mana >= costoMana) {
            mana -= costoMana;
            System.out.println(nombre + " lanza un hechizo oscuro con concentración " + concentracion + ". Maná restante: " + mana);
        } else {
            System.out.println(nombre + " intenta lanzar un hechizo, pero no tiene suficiente maná.");
        }
    }

    @Override
    public void defender() {
        int escudoMagico = mana / 2;

        System.out.println(nombre + " crea un escudo mágico con poder " + escudoMagico);
    }

    @Override
    public void atacar() {
        invocarEntidad();
    }
}


