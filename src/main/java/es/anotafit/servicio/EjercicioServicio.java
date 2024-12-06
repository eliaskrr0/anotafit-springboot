package es.anotafit.servicio;

import es.anotafit.modelo.EjercicioDTO;

import java.util.List;

public interface EjercicioServicio {
    List<EjercicioDTO> obtenerListadoEjercicios();
}
