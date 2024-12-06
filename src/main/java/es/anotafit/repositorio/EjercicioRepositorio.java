package es.anotafit.repositorio;

import es.anotafit.modelo.EjercicioDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EjercicioRepositorio extends JpaRepository<EjercicioDTO, Long> {
}
