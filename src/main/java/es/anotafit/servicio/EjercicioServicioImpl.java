package es.anotafit.servicio;

import es.anotafit.modelo.EjercicioDTO;
import es.anotafit.repositorio.EjercicioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EjercicioServicioImpl implements EjercicioServicio {

    @Autowired
    private EjercicioRepositorio ejercicioRepositorio;

    @Override
    public List<EjercicioDTO> obtenerListadoEjercicios() {
        return ejercicioRepositorio.findAll();
    }

    @Override
    public EjercicioDTO crearEjercicio(EjercicioDTO ejercicioDTO) {
        return ejercicioRepositorio.save(ejercicioDTO);
    }
}
