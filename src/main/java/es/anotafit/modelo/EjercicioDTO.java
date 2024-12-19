package es.anotafit.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@Entity
@Table(name = "ejercicio")
public class EjercicioDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEjercicio;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "series", nullable = false)
    private int series;

    @Column(name = "repeticiones", nullable = false)
    private int repeticiones;

    @Column(name = "peso_adicional")
    private double pesoAdicional;

    @UpdateTimestamp // Actualizala fecha de manera automática
    @Column(name = "fecha_modificacion", nullable = false)
    private LocalDate fechaModificacion;

    @Column(name = "tipo_ejercicio", nullable = false)
    private String tipoEjercicio;
}
