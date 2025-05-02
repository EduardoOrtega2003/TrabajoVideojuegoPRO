package Modelo;

public abstract class PersonajeMagico extends Personaje {
    public PersonajeMagico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    public void meditar() {
        System.out.println(nombre + " medita para aumentar su poder mágico.");
    }
}