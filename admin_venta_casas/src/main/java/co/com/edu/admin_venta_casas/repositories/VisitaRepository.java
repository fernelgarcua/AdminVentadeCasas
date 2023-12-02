package co.com.edu.admin_venta_casas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.edu.admin_venta_casas.repositories.entities.InmuebleEntiti;
import co.com.edu.admin_venta_casas.repositories.entities.VisitaEntity;

public interface VisitaRepository extends CrudRepository<VisitaEntity, Long>{
    List<VisitaEntity> findByInmueble(InmuebleEntiti inmueble);
}
