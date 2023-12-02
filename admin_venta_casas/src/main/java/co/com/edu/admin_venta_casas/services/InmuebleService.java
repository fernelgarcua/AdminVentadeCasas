package co.com.edu.admin_venta_casas.services;

import co.com.edu.admin_venta_casas.repositories.entities.InmuebleEntiti;

public interface InmuebleService {
    
    InmuebleEntiti save(InmuebleEntiti inmueble, Long idOficina);

    InmuebleEntiti findByid(Long id);

    InmuebleEntiti findByCodigo(String id);

    Iterable<InmuebleEntiti> findAll();

    InmuebleEntiti update(InmuebleEntiti inmueble, Long id, Long idOficina);

    void delete(Long id);
}
