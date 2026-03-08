package Models;


public class Estadisticas {
    private final int fuerza;
    private final int inteligencia;
    private final int velocidad;
    private final int resistencia;

    public Estadisticas(int fuerza, int inteligencia, int velocidad, int resistencia) {
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
    }

    public int getFuerza() {
        return fuerza; }
    public int getInteligencia() {
        return inteligencia; }
    public int getVelocidad() {
        return velocidad; }
    public int getResistencia() {
        return resistencia; }

    @Override
    public String toString() {
        return "Fuerza:" + fuerza + " Inteligencia:" + inteligencia + " Velocidad:" + velocidad + " Resistencia:" + resistencia;
    }
}