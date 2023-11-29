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
    
}
