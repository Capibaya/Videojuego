package Models.Strategy;

public class AtaqueSagrado implements HabilidadStrategy {
    @Override
    public void ejecutar() {
        System.out.println("¡El paladín ejecuta un Ataque Sagrado!");
    }
}
