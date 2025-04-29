package modelos;

public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int salud;

    public Personaje(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public abstract void atacar();

    public abstract void defender();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Nivel: " + nivel + ", Salud: " + salud;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personaje personaje = (Personaje) obj;
        return nivel == personaje.nivel && salud == personaje.salud && nombre.equals(personaje.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nivel, salud);
    }
}