package co.com.edu.admin_venta_casas.repositories;

import org.springframework.data.repository.CrudRepository;

import co.com.edu.admin_venta_casas.repositories.entities.InmuebleEntiti;

public interface InmuebleRepositorie extends CrudRepository<InmuebleEntiti, Long>{
    
}
