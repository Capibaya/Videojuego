package Models;

import Models.Strategy.HabilidadStrategy;

public class Habilidad {
    private final String nombre;
    private final HabilidadStrategy strategy;

    public Habilidad(String nombre, HabilidadStrategy strategy) {
        this.nombre = nombre;
        this.strategy = strategy;
    }

    public void ejecutar() {
        strategy.ejecutar();
    }

    public String getNombre() {
        return nombre;
    }
}