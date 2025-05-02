package Modelo;

public abstract class PersonajeFisico extends Personaje {
    public PersonajeFisico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    public void entrenar() {
        System.out.println(nombre + " entrena para mejorar su fuerza física.");
    }
}