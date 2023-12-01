package co.com.edu.admin_venta_casas.repositories.entities;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "inmuebles")
public class InmuebleEntiti {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private Double area;
    private String ciudadInmueble;
    private String direccionInmueble;
    private String tipoInmueble;

    @ManyToOne
    @JoinColumn(name = "oficina_id")
    @JsonIgnoreProperties("inmuebles")
    private OficinaEntity oficina;

    @OneToMany(mappedBy = "inmueble")
    @JsonIgnoreProperties("inmuebles")
    private List<VisitaEntity> visitas;
}
