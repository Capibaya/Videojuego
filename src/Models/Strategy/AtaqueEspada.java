package Models.Strategy;

public class AtaqueEspada implements HabilidadStrategy {
    @Override
    public void ejecutar() {
        System.out.println("¡El guerrero ejecuta un Espadazo!");
    }
}
