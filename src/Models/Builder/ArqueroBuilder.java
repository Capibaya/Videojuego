package Models.Builder;

import Models.Estadisticas;
import Models.EstadisticasEspeciales;
import Models.Personaje;

import java.util.Arrays;

public class ArqueroBuilder extends PersonajeBuilder {

    @Override
    protected void inicializarHabilidadesPermitidas() {
        habilidadesPermitidas = Arrays.asList(
                "Flecha de Fuego",
                "Ataque Rápido",
                "Curación",
                "Defensa Escudo"
        );
    }

    @Override
    public void construirBase() {
        inicializarHabilidadesPermitidas();
        Estadisticas stats = new Estadisticas(5, 4, 9, 5);
        EstadisticasEspeciales esp = new EstadisticasEspeciales(8, null);
        personaje = new Personaje("Arquero", stats, esp);
    }
}