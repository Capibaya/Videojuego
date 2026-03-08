package Models.Strategy;

public class FlechaDeFuego implements HabilidadStrategy {
    @Override
    public void ejecutar() {
        System.out.println("¡El arquero lanza una Flecha de Fuego!");
    }
}