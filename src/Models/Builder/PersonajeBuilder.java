package Models.Builder;

import Models.Habilidad;
import Models.Personaje;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonajeBuilder {
    protected Personaje personaje;
    protected List<String> habilidadesPermitidas = new ArrayList<>();

    public abstract void construirBase();

    protected abstract void inicializarHabilidadesPermitidas();

    public void agregarHabilidad(Habilidad h) {
        if (personaje == null) return;

        if (habilidadesPermitidas.contains(h.getNombre())) {
            personaje.agregarHabilidad(h);
        } else {
            throw new IllegalArgumentException(
                    "\"" + h.getNombre() + "\" no es compatible con " + personaje.getTipo()
            );
        }
    }

    public Personaje construir() {
        return personaje;
    }
}