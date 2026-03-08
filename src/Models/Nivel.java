package Models;

public class Nivel {
    private int nivel;
    private static final int MAX_NIVEL = 10;

    public Nivel() {
        this.nivel = 1;
    }

    public int getNivel() { return nivel; }

    public void subirNivel() {
        if (nivel < MAX_NIVEL) {
            nivel++;
        } else {
            System.out.println("¡Ya estás en el nivel máximo (" + MAX_NIVEL + ")!");
        }
    }

    public int getBonusEstadistica() {

        return nivel - 1;
    }

    @Override
    public String toString() {

        return "Nivel: " + nivel;
    }
}