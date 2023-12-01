package co.com.edu.admin_venta_casas.services;

import co.com.edu.admin_venta_casas.repositories.entities.OficinaEntity;

public interface OficinaService {

    OficinaEntity findById(Long id);

    Iterable<OficinaEntity> findAll();

    OficinaEntity save(OficinaEntity oficina);

    OficinaEntity update(OficinaEntity oficina, Long oficinaId);

    void delete(Long oficinaId);
}
