package es.anotafit.controlador;

import es.anotafit.modelo.EjercicioDTO;
import es.anotafit.servicio.EjercicioServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/anotafit/ejercicios")
public class EjercicioControlador {
    @Autowired
    private EjercicioServicioImpl ejercicioServicio;

    @GetMapping("/todos")
    public List<EjercicioDTO> obtenerListadoEjercicios() {
        return ejercicioServicio.obtenerListadoEjercicios();
    }
}
