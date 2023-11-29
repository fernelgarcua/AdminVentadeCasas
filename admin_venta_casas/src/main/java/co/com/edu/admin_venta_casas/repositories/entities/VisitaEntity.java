package co.com.edu.admin_venta_casas.repositories.entities;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name= "visita")
public class VisitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private String observacion;
    @ManyToOne
    @JoinColumn(name = "inmueble_id")
    @JsonIgnoreProperties("visita")
    private InmuebleEntiti inmueble;
    
}
