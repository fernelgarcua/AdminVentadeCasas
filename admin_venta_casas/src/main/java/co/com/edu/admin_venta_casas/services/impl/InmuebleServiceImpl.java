package co.com.edu.admin_venta_casas.services.impl;



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
    public InmuebleEntiti save(InmuebleEntiti inmueble, Long idOficina, Long idVisita){
        Optional<OficinaEntity> oficinaOptional= oficinaRepositorie.findById(idOficina);
        Optional<VisitaEntity> visitaOptional= visitaRepository.findById(idVisita);

        if(oficinaOptional.isPresent() && visitaOptional.isPresent()){
            OficinaEntity oficinaEntity=oficinaOptional.get();
            VisitaEntity visitaEntity=visitaOptional.get();
            inmueble.setOficina(oficinaEntity);
            inmueble.setVisitas(visitaEntity);
            inmuebleRepositorie.save(inmueble);

            return inmueble;
        }else{
            throw new NullPointerException("No existe en la base de datos");
        }
    }
    
    
}
