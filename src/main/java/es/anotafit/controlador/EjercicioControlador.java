package es.anotafit.controlador;

import es.anotafit.modelo.EjercicioDTO;
import es.anotafit.servicio.EjercicioServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/crear")
    public EjercicioDTO crearEjercicio(@RequestBody EjercicioDTO ejercicioDTO) {
        return ejercicioServicio.crearEjercicio(ejercicioDTO);
    }
}
