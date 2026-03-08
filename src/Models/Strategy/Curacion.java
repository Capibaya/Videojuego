package Models.Strategy;

public class Curacion implements HabilidadStrategy {
    @Override
    public void ejecutar() {
        System.out.println("¡El personaje usa curación!");
    }
}