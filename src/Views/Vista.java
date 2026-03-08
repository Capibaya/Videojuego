package Views;

import Models.Personaje;
import Models.Habilidad;

import java.util.Scanner;


public class Vista {
    private final Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("  CONSTRUCTOR DE PERSONAJES ");
        System.out.println(" 1. Crear personaje");
        System.out.println(" 2. Salir");

        System.out.print("Opción: ");
    }

    public int leerOpcion() {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public String seleccionarTipo() {
        System.out.println(" TIPOS DE PERSONAJE:");
        System.out.println("1.Arquero");
        System.out.println("2. Paladín");
        System.out.print("Opción: ");

        switch (leerOpcion()) {
            case 1:  return "arquero";
            case 2:  return "paladin";
            default:
                System.out.println("Opción no válida, usando Arquero por defecto.");
                return "arquero";
        }
    }
    public boolean quiereAgregarHabilidad() {
        System.out.print("\n¿Agregar habilidad? (s/n): ");
        return sc.nextLine().trim().toLowerCase().startsWith("s");
    }

    public void mostrarHabilidades(String tipo) {
        System.out.println(" HABILIDADES DISPONIBLES:");
        System.out.println("   1. Ataque Espada");
        System.out.println("   2. Flecha de Fuego");
        System.out.println("   3. Ataque Rápido");
        System.out.println("   4. Curación");
        System.out.println("   5. Defensa Escudo");
        System.out.println("   6. Ataque Sagrado");
        System.out.print("Opción: ");
    }

    public boolean quiereSubirNivel() {
        System.out.print("\n¿Subir de nivel? (s/n): ");
        return sc.nextLine().trim().toLowerCase().startsWith("s");
    }

    public void mostrarPersonaje(Personaje p) {
        System.out.println("  " + p.getTipo() + "  —  " + p.getNivel());
        System.out.println(" ESTADÍSTICAS BASE:");
        System.out.println("   " + p.getStats());

        String esp = p.getStatsEspeciales().toString();
        if (!esp.isEmpty()) {
            System.out.println(" ESTADÍSTICAS ESPECIALES:");
            System.out.println("   " + esp);
        }

        System.out.println(" HABILIDADES:");
        if (p.getHabilidades().isEmpty()) {
            System.out.println("   Ninguna");
        } else {
            for (Habilidad h : p.getHabilidades()) {
                System.out.println("   • " + h.getNombre());
            }
        }
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}