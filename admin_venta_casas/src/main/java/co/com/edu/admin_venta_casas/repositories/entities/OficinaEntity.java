package co.com.edu.admin_venta_casas.repositories.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.*;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "oficina")
public class OficinaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreOficina;
    private String direccionOficina;
    private Number telefonoOficina;
    private String ciudadOficina;
    @OneToMany(mappedBy = "oficina")
    @JsonIgnoreProperties("oficina")
    private List<InmuebleEntiti> inmuebles;
}
