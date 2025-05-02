package Modelo;

import java.util.Objects;

public abstract class Personaje {
    public String nombre;
    protected int nivel;
    protected int salud;

    public Personaje(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public abstract void atacar();

    public void recibirDanio(int cantidad) {
        salud -= cantidad;
        if (salud < 0) {
            salud = 0;
        }
        System.out.println(nombre + " recibe " + cantidad + " de daño. Salud restante: " + salud);
    }

    public boolean estaVivo() {
        if (salud <= 0) {
            System.out.println(nombre + " ha caído en batalla.");
            return false;
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }
    
    public int getSalud() {
        return salud;
    }

    @Override
    public String toString() {
        return nombre + " (Nivel: " + nivel + ", Salud: " + salud + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(nombre, personaje.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}