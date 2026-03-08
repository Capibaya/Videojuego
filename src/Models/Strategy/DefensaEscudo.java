package Models.Strategy;

public class DefensaEscudo implements HabilidadStrategy {
    @Override
    public void ejecutar() {
        System.out.println("¡El personaje se protege con su escudo!");
    }
}