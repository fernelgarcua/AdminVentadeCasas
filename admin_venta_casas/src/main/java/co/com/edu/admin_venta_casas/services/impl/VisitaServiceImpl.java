package co.com.edu.admin_venta_casas.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.edu.admin_venta_casas.repositories.InmuebleRepositorie;
import co.com.edu.admin_venta_casas.repositories.VisitaRepository;
import co.com.edu.admin_venta_casas.repositories.entities.VisitaEntity;
import co.com.edu.admin_venta_casas.services.VisitaService;

@Service
public class VisitaServiceImpl implements VisitaService{

    @Autowired
    private VisitaRepository visitaRepository;

    @Autowired
    private InmuebleRepositorie inmuebleRepository;

    @Override
    public VisitaEntity findById(Long id){
        return visitaRepository.findById(id).orElse(null);
    }

    @Override
    public VisitaEntity save(VisitaEntity visita, Long idInmueble) {
        visita.setInmueble(inmuebleRepository.findById(idInmueble).orElse(null));

        return visitaRepository.save(visita);
    }

    @Override
    public Iterable<VisitaEntity> findAll() {
        return visitaRepository.findAll();
    }

    @Override
    public VisitaEntity update(VisitaEntity visita, Long id, Long idInmueble) {
        VisitaEntity visitaEntity = visitaRepository.findById(id).orElse(null);

        visitaEntity.setFecha(visita.getFecha());
        visitaEntity.setObservacion(visita.getObservacion());
        visitaEntity.setInmueble(inmuebleRepository.findById(idInmueble).orElse(null));

        return visitaRepository.save(visitaEntity);
    }

    @Override
    public void delete(Long id) {
        visitaRepository.deleteById(id);
    }
    
}
