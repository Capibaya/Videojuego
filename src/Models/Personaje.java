package Models;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private final String tipo;
    private final Estadisticas stats;
    private final EstadisticasEspeciales statsEspeciales;
    private final Nivel nivel;
    private final List<Habilidad> habilidades = new ArrayList<>();

    public Personaje(String tipo, Estadisticas stats, EstadisticasEspeciales statsEspeciales) {
        this.tipo = tipo;
        this.stats = stats;
        this.statsEspeciales = statsEspeciales;
        this.nivel = new Nivel();
    }

    public void agregarHabilidad(Habilidad h) {
        habilidades.add(h);
    }

    public boolean tieneHabilidad(String nombre) {
        return habilidades.stream().anyMatch(h -> h.getNombre().equals(nombre));
    }

    public void ejecutarHabilidad(String nombre) {
        for (Habilidad h : habilidades) {
            if (h.getNombre().equals(nombre)) {
                System.out.print("   • " + h.getNombre() + ": ");
                h.ejecutar();
                return;
            }
        }
        System.out.println("   • No tiene la habilidad: " + nombre);
    }

    public void ejecutarHabilidades() {
        System.out.println("EJECUTANDO TODAS LAS HABILIDADES:");
        for (Habilidad h : habilidades) {
            System.out.print("   • " + h.getNombre() + ": ");
            h.ejecutar();
        }
        System.out.println();
    }

    public String getTipo() {
        return tipo; }
    public Estadisticas getStats() {
        return stats; }
    public EstadisticasEspeciales getStatsEspeciales(){
        return statsEspeciales; }
    public Nivel getNivel() {
        return nivel; }
    public List<Habilidad> getHabilidades() {
        return habilidades; }
}