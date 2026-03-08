package Models.Builder;

import Models.Estadisticas;
import Models.EstadisticasEspeciales;
import Models.Personaje;

import java.util.Arrays;

public class PaladinBuilder extends PersonajeBuilder {

    @Override
    protected void inicializarHabilidadesPermitidas() {
        habilidadesPermitidas = Arrays.asList(
                "Ataque Espada",
                "Defensa Escudo",
                "Ataque Sagrado"
        );
    }

    @Override
    public void construirBase() {
        inicializarHabilidadesPermitidas();
        Estadisticas stats         = new Estadisticas(8, 5, 5, 9);
        EstadisticasEspeciales esp = new EstadisticasEspeciales(null, 7);
        personaje = new Personaje("Paladim", stats, esp);
    }
}