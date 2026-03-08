package Models.Factory;
import Models.Builder.ArqueroBuilder;
import Models.Builder.PaladinBuilder;
import Models.Builder.PersonajeBuilder;


public class PersonajeFactory {

    private PersonajeFactory() {}


    public static PersonajeBuilder crearBuilder(String tipo) {
        switch (tipo.toLowerCase()) {
            case "arquero": return new ArqueroBuilder();
            case "paladin": return new PaladinBuilder();
            default:
                throw new IllegalArgumentException("Tipo de personaje no válido: " + tipo);
        }
    }
}