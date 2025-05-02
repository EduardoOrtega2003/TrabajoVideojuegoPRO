package modelos;

public abstract class PersonajeFisico extends Personaje {
    protected int resistencia;

    public PersonajeFisico(String nombre, int nivel, int salud, int resistencia) {
        super(nombre, nivel, salud);
        this.resistencia = resistencia;
    }

    public void esquivar() {
        System.out.println(nombre + " esquiva el ataque usando resistencia de " + resistencia);
    }
}
