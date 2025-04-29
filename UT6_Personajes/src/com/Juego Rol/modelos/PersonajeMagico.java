package modelos;

public abstract class PersonajeMagico extends Personaje {
    protected int mana;

    public PersonajeMagico(String nombre, int nivel, int salud, int mana) {
        super(nombre, nivel, salud);
        this.mana = mana;
    }

    public void recargarMana() {
        System.out.println(nombre + " recarga su maná. Maná restante: " + mana);
    }
}
