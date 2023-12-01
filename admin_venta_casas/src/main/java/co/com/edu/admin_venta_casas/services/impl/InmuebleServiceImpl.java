package co.com.edu.admin_venta_casas.services.impl;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import co.com.edu.admin_venta_casas.repositories.InmuebleRepositorie;
import co.com.edu.admin_venta_casas.repositories.OficinaRepositorie;
import co.com.edu.admin_venta_casas.repositories.VisitaRepository;
import co.com.edu.admin_venta_casas.repositories.entities.InmuebleEntiti;
import co.com.edu.admin_venta_casas.repositories.entities.OficinaEntity;
import co.com.edu.admin_venta_casas.repositories.entities.VisitaEntity;
import co.com.edu.admin_venta_casas.services.InmuebleService;

@Service
public class InmuebleServiceImpl implements InmuebleService{

    @Autowired
    private InmuebleRepositorie inmuebleRepositorie;

    @Autowired
    private OficinaRepositorie oficinaRepositorie;

    @Autowired
    private VisitaRepository visitaRepository;

    @Override
    public InmuebleEntiti save(InmuebleEntiti inmueble, Long idOficina) {
        Optional<OficinaEntity> oficinaOptional= oficinaRepositorie.findById(idOficina);

        if(oficinaOptional.isPresent()){
            OficinaEntity oficinaEntity=oficinaOptional.get();

            inmueble.setOficina(oficinaEntity);
            inmuebleRepositorie.save(inmueble);

            return inmueble;
        }else{
            throw new NullPointerException("No existe en la base de datos");
        }
    }

    @Override
    public InmuebleEntiti findByid(Long id) {
        Optional<InmuebleEntiti> inmuebleOptional= inmuebleRepositorie.findById(id);
        
        if(inmuebleOptional.isPresent()){
            return inmuebleOptional.get();
        }else{
            throw new NullPointerException("No existe en la base de datos");
        }
    }

    @Override
    public Iterable<InmuebleEntiti> findAll() {
        return inmuebleRepositorie.findAll();
    }
}
