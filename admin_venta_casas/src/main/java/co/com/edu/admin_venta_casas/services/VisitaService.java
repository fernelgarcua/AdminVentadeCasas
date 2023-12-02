package co.com.edu.admin_venta_casas.services;

import co.com.edu.admin_venta_casas.repositories.entities.VisitaEntity;

public interface VisitaService {

        VisitaEntity findById(Long id);

        VisitaEntity save(VisitaEntity visita, Long idInmueble);

        Iterable<VisitaEntity> findAll();

        VisitaEntity update(VisitaEntity visita, Long id, Long idInmueble);

        void delete(Long id);
}
