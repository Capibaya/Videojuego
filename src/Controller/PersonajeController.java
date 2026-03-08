package Controller;

import Models.Builder.PersonajeBuilder;
import Models.Factory.PersonajeFactory;
import Models.Habilidad;
import Models.Personaje;
import Models.Strategy.*;
import Views.Vista;

public class PersonajeController {
    private final Vista vista = new Vista();

    public void iniciar() {
        while (true) {
            vista.mostrarMenu();
            int opcion = vista.leerOpcion();

            if (opcion == 1) {
                crearPersonaje();
            } else if (opcion == 2) {
                vista.mostrarMensaje("¡Hasta luego!");
                break;
            } else {
                vista.mostrarMensaje("Opción no válida, intenta de nuevo.");
            }
        }
    }

    private void crearPersonaje() {
        try {
            String tipo = vista.seleccionarTipo();
            PersonajeBuilder builder = PersonajeFactory.crearBuilder(tipo);
            builder.construirBase();

            while (vista.quiereAgregarHabilidad()) {
                vista.mostrarHabilidades(tipo);
                int opcion = vista.leerOpcion();

                try {
                    switch (opcion) {
                        case 1:
                            builder.agregarHabilidad(new Habilidad("Ataque Espada", new AtaqueEspada()));
                            break;
                        case 2:
                            builder.agregarHabilidad(new Habilidad("Flecha de Fuego", new FlechaDeFuego()));
                            break;
                        case 3:
                            builder.agregarHabilidad(new Habilidad("Ataque Rápido", new AtaqueRapido()));
                            break;
                        case 4:
                            builder.agregarHabilidad(new Habilidad("Curación", new Curacion()));
                            break;
                        case 5:
                            builder.agregarHabilidad(new Habilidad("Defensa Escudo", new DefensaEscudo()));
                            break;
                        case 6:
                            builder.agregarHabilidad(new Habilidad("Ataque Sagrado", new AtaqueSagrado()));
                            break;
                        default:
                            vista.mostrarMensaje("Opción no válida.");
                            continue;
                    }
                    vista.mostrarMensaje(" Habilidad agregada");

                } catch (IllegalArgumentException e) {
                    vista.mostrarMensaje(" " + e.getMessage());
                }
            }

            Personaje p = builder.construir();
            vista.mostrarPersonaje(p);
            p.ejecutarHabilidades();

            if (vista.quiereSubirNivel()) {
                p.getNivel().subirNivel();
                vista.mostrarMensaje(" Nivel subido a " + p.getNivel().getNivel());
            }

        } catch (Exception e) {
            vista.mostrarMensaje("Error inesperado: " + e.getMessage());
        }
    }
}