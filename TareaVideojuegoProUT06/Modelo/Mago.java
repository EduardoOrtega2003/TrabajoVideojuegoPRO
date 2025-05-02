package Modelo;

import Interfaces.Magico;
import Interfaces.Curable;

public class Mago extends PersonajeMagico implements Magico, Curable {
    private int mana, sabiduria;

    public Mago(String nombre, int nivel, int salud, int mana, int sabiduria) {
        super(nombre, nivel, salud);
        this.mana = mana;
        this.sabiduria = sabiduria;
    }

    public void regenerarMana() {
        System.out.println(nombre + " regenera maná. Total: " + mana);
    }

    @Override
    public void lanzarHechizo() {
        int costoMana = 10;

        if (mana >= costoMana) {
            mana -= costoMana;
            System.out.println(nombre + " lanza un hechizo con sabiduría " + sabiduria + ". Maná restante: " + mana);
        } else {
            System.out.println(nombre + " intenta lanzar un hechizo, pero no tiene suficiente maná.");
        }
    }

    @Override
    public void curar() {
        int cantidadCurada = sabiduria * 2;
        salud += cantidadCurada;
        System.out.println(nombre + " usa magia para curarse. Salud ahora es " + salud);
    }

    @Override
    public void atacar() {
        lanzarHechizo();
    }
}

