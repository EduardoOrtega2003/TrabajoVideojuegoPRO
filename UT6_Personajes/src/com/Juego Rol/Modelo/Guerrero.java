package Modelo;

import Interfaces.Defendible;
import Interfaces.Movilizable;

public class Guerrero extends PersonajeFisico implements Defendible, Movilizable {
    private int fuerza, armadura, escudo;

    public Guerrero(String nombre, int nivel, int salud, int fuerza, int armadura, int escudo) {
        super(nombre, nivel, salud);
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.escudo = escudo;
    }

    public void cargarAtaque() {
        System.out.println(nombre + " carga un ataque con fuerza " + fuerza);
    }

    public void defender(int dañoRecibido) {
        int dañoReducido = dañoRecibido - (armadura + escudo);
        if (dañoReducido < 0) dañoReducido = 0;
    
        salud -= dañoReducido;

        System.out.println(nombre + " bloquea el ataque! Daño recibido reducido a " + dañoReducido);
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se pone en posición defensiva con armadura " + armadura + " y escudo " + escudo);
    }

    public void moverse() {
        System.out.println(nombre + " se desplaza silenciosamente.");
    }
    
    @Override
    public void atacar() {
        System.out.println(nombre + " ataca cuerpo a cuerpo con fuerza " + fuerza);
    }
}