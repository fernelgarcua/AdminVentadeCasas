package co.com.edu.admin_venta_casas.services;

import co.com.edu.admin_venta_casas.repositories.entities.InmuebleEntiti;

public interface InmuebleService {
    
    InmuebleEntiti save(InmuebleEntiti inmueble, Long idOficina);

    InmuebleEntiti findByid(Long id);

    Iterable<InmuebleEntiti> findAll();
}
