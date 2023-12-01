package co.com.edu.admin_venta_casas.services.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.edu.admin_venta_casas.repositories.OficinaRepositorie;
import co.com.edu.admin_venta_casas.repositories.entities.OficinaEntity;
import co.com.edu.admin_venta_casas.services.OficinaService;

@Service
public class OficinaServiceImpl implements OficinaService{

    @Autowired
    private OficinaRepositorie oficinaRepositorie;

    @Override
    @Transactional(readOnly = true)
    public OficinaEntity findById(Long id){
        return oficinaRepositorie.findById(id).orElse(null);
    }

    @Override
    public Iterable<OficinaEntity> findAll() {
        return oficinaRepositorie.findAll();
    }

    @Override
    public OficinaEntity save(OficinaEntity oficina) {
        return oficinaRepositorie.save(oficina);
    }

    @Override
    public OficinaEntity update(OficinaEntity oficina, Long oficinaId) {

        var updatedOficina = oficinaRepositorie.findById(oficinaId).orElse(null);

        if (updatedOficina == null) {
            throw new NullPointerException("No se encontró la oficina indicada");
        }

        updatedOficina.setCiudadOficina(oficina.getCiudadOficina());
        updatedOficina.setDireccionOficina(oficina.getDireccionOficina());
        updatedOficina.setNombreOficina(oficina.getNombreOficina());
        updatedOficina.setTelefonoOficina(oficina.getTelefonoOficina());

        return oficinaRepositorie.save(updatedOficina);
    }

    @Override
    public void delete(Long oficinaId) {
        oficinaRepositorie.deleteById(oficinaId);
    }

}
