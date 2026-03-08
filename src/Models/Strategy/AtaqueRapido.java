package Models.Strategy;

public class AtaqueRapido implements HabilidadStrategy {
    @Override
    public void ejecutar() {
        System.out.println("¡El personaje realiza un ataque rápido y certero!");
    }
}
